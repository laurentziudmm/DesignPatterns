package factoryMethod;

public class BusinessPlan implements SubscriptionPlan {
    @Override
    public long price() {
        return 10;
    }
}
