package prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        List<String> colorList = new ArrayList<>();
        colorList.add("Blue");
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Gold");

        Car prototypeCar = new Car("BMW", "Seria 3", "2019", 2000, "Grey");

        for (String color : colorList) {
            for (int i = 1; i <= 15; i++) {
                Car car = prototypeCar.copy();
                car.setColor(color);
                carList.add(car);
                System.out.println(i + " -> " + car);
            }
            System.out.println("-----------------");
        }
    }
}
