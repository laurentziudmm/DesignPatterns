package factoryMethod;

public class Invoice {

    public void sendInvoice(Account account) {

        PlanFactory planFactory = new PlanFactory();
        SubscriptionPlan subscriptionPlan = planFactory.getPlan(account.getAccountType());
        System.out.println("Pretul este de: " + subscriptionPlan.price()+ " Euro");

    }
}
