package prototype;

public class Car {
    private String brand;
    private String model;
    private String year;
    private long motor;
    private String color;

    public Car(String brand, String model, String year, long motor, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.motor = motor;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public long getMotor() {
        return motor;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMotor(long motor) {
        this.motor = motor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car copy() {
        return new Car(this.brand, this.model, this.year, this.motor, this.color);
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + year + " " + motor + " " + color;
    }
}

