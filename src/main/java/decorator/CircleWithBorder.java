package decorator;

public class CircleWithBorder extends Circle {
    @Override
    public String draw() {
        return  "Red border " + super.draw();
    }
}
