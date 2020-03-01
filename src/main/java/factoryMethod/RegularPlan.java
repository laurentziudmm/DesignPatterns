package factoryMethod;

public class RegularPlan implements SubscriptionPlan{
    @Override
    public long price() {
        return 8;
    }
}
