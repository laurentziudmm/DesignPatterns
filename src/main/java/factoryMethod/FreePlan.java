package factoryMethod;

public class FreePlan implements SubscriptionPlan {
    @Override
    public long price() {
        return 0;
    }
}
