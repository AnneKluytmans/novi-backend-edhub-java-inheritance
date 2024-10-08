public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Winnie", "the Pooh", new VisaCard(3495), new EmailContactInfo("test@test.com"));
        customer1.printName();

        Customer customer2 = new Customer("Klaas", "Vaak", new MasterCard(9948), new EmailContactInfo("test123@test.com"));
        customer2.printName();

        Customer customer3 = new Customer("Test", "Visa", new VisaCard(0), new SmsContactInfo("0653585053"));
        Customer customer4 = new Customer("Test", "Master", new MasterCard(0), new SmsContactInfo("0648534599"));


        customer1.getCreditCard().pay(105);
        System.out.println(customer1.getCreditCard().getDebt() + "\n");
        customer1.getContactInfo().sendMessage();


        customer3.printName();
        customer3.getCreditCard().pay(105);
        System.out.println(customer3.getCreditCard().getDebt() + "\n");
        customer3.getContactInfo().sendMessage();

        customer4.printName();
        customer4.getCreditCard().pay(105);
        System.out.println(customer4.getCreditCard().getDebt() + "\n");
        customer4.getContactInfo().sendMessage();


    }
}
