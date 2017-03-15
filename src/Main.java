public class Main {

    public static void main(String[] args) {
        // Телефонный справочник
        HomePhone homePhone = new HomePhone("334-67-80", "Минск");
        MobilePhone mobilePhone = new MobilePhone("+375 25 7680099", "MTS");

        Contact contact1 = new Contact("Вася ", "Петров ", homePhone, mobilePhone);

//        contact1.getInformation();

//        System.out.println(contact1.homePhone.callAmbulanceNumber());
//        System.out.println(contact1.homePhone.callPoliceNumber());
//        System.out.println(contact1.homePhone.callFireNumber());

        HomePhone homePhone2 = new HomePhone();

        homePhone2.setCity("");
        homePhone2.setNumber("");

        try {
            int d = 30;
            int result = d / 1;
//            Contact contact2 = new Contact();
//            contact2.getInformation();
            System.out.println("Эта строка выводиться не будет");
            // Перехват ошибки
        } catch (NullPointerException e) {
            System.out.println("У Вас контакт не проинициализирован");

            //System.out.println(e.getMessage());
            e.printStackTrace();
            // Перехват ошибки
        } catch (ArithmeticException e) {
            System.out.println("Вы делите на 0");
        } finally {
            System.out.println("Этот код выполняется всегда!");
        }

        System.out.println(contact1.toString());
    }
}
