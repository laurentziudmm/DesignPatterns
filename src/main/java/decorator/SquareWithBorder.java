package decorator;

public class SquareWithBorder extends Square {
    @Override
    public String draw() {
        return "Red border " + super.draw();
    }
}
