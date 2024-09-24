public class Customer {
    private String firstName;
    private String lastName;
    private int customerNumber;
    private CreditCard creditCard;
    private ContactInfo contactInfo;


    public Customer(String firstName, String lastName, CreditCard creditCard, ContactInfo contactInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCard = creditCard;
        this.contactInfo = contactInfo;
    }

    public Customer(String firstName, String lastName, int customerNumber, CreditCard creditCard, ContactInfo contactInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.creditCard = creditCard;
        this.contactInfo = contactInfo;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }


    public void printName(){
        System.out.println("Customer " + firstName + " " + lastName);
    }
}
