package strategy;

public class Main {
    public static void main(String[] args) {

        Strategy groundStrategy = new GroundAttack();
        Strategy aerialStrategy = new AerialAttack();
        Strategy maritimStrategy = new MaritimAtatck();

        Context groundContext = new Context("ground attack",groundStrategy);
        System.out.println(groundContext.launchAttack());

        Context maritimContext = new Context("maritim attack",maritimStrategy);
        System.out.println(maritimContext.launchAttack());


    }
}
