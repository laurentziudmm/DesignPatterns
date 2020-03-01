package decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle.draw());

        Shape square = new Square();
        System.out.println(square.draw());

        Circle redCircle = new CircleWithBorder();
        System.out.println(redCircle.draw());

        Square redSquare = new SquareWithBorder();
        System.out.println(redSquare.draw());
    }
}
