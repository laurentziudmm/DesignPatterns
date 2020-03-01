package factoryMethod;

public class PlanFactory {

    public SubscriptionPlan getPlan(String accountType) {

        if (accountType.equals("Business")) {
            return new BusinessPlan();
        } else if (accountType.equals("Regular")) {
            return new RegularPlan();
        } else {
            return new FreePlan();
        }
    }
}
