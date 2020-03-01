package strategy;

public class Context {
    private String name;
    private Strategy strategy;

    public Context(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public String launchAttack (){
        return this.strategy.attack();
    }
}
