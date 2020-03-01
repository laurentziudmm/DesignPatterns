package singleton;

import java.util.ArrayList;

public class Menu {

    private static Menu instance = new Menu();
    private ArrayList<String> drinks = new ArrayList<String>();
    private ArrayList<String> burgers = new ArrayList<String>();

    private Menu() {
    }

    public ArrayList<String> getDrinks() {
        return drinks;
    }

    public ArrayList<String> getBurgers() {
        return burgers;
    }

    public void setDrinks(ArrayList<String> drinks) {
        this.drinks = drinks;
    }

    public void setBurgers(ArrayList<String> burgers) {
        this.burgers = burgers;
    }

    public static Menu getInstance() {
        if (instance == null) {
            return instance = new Menu();
        } else {
            return instance;
        }
    }
}
