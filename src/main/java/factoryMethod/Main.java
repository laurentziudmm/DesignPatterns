package factoryMethod;

public class Main {
    public static void main(String[] args) {

        Account regularAccount = new Account();
        regularAccount.setAccountType("Regular");

        Account businessAccount = new Account();
        businessAccount.setAccountType("Business");

        Account freeAccount = new Account();
        freeAccount.setAccountType("Free");

        Invoice invoice = new Invoice();
        invoice.sendInvoice(regularAccount);
        invoice.sendInvoice(businessAccount);
        invoice.sendInvoice(freeAccount);
    }

}

