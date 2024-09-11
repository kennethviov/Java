public class Vehicle {
    String brand;
    String model;
    String color;
    int speed;
    int fuel;

    void move() {
        System.out.println(brand + " " + model + " is moving at " + speed + "km/h");
        fuel -= (int)(speed / 5);
    }

    void stop() {
        System.out.println(brand + " " + model + " has stopped");
    }

    void refuel(int amount) {
        System.out.println(amount + " liters has been refueled");
    }

    void displayDetails() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(fuel);
    }
}