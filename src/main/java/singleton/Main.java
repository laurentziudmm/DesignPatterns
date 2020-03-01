package singleton;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> burgers = new ArrayList<>();
        burgers.add("McDonalds");
        burgers.add("BicMac");
        burgers.add("CheapBurger");

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Cola");
        drinks.add("Fanta");
        drinks.add("Mirinda");

        ArrayList<String> newDrinks = new ArrayList<>();
        newDrinks.add("AmericanCola");
        newDrinks.add("SucPastilat");
        newDrinks.add("Limonada");

        Menu menu1 = Menu.getInstance();
        Menu menu2 = Menu.getInstance();
        Menu menu3 = Menu.getInstance();

        menu1.setBurgers(burgers);
        menu1.setDrinks(drinks);
        //menu2.setDrinks(newDrinks);

        System.out.println("Menu1");
        for (int i = 0; i < menu1.getDrinks().size(); i++) {
            System.out.println(menu1.getDrinks().get(i));
        }
        for (int i = 0; i < menu1.getBurgers().size(); i++) {
            System.out.println(menu1.getBurgers().get(i));
        }
        System.out.println("-----------------");

        System.out.println("Menu2");
        for (int i = 0; i < menu2.getDrinks().size(); i++) {
            System.out.println(menu2.getDrinks().get(i));
        }
        for (int i = 0; i < menu2.getBurgers().size(); i++) {
            System.out.println(menu2.getBurgers().get(i));
        }
        System.out.println("-----------------");
        System.out.println("Menu3");
        for (String element : menu3.getDrinks()) {
            System.out.println(element);

        }
        for (String element : menu3.getBurgers()) {
            System.out.println(element);
        }
    }
}
