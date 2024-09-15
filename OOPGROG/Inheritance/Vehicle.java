public class Vehicle {
    public String brand;
    public String model;
    public String color;
    public int speed;
    public int fuel;

    public void move() {
        System.out.println(brand + " " + model + " is moving at " + speed + "km/h");
        fuel -= (int)(speed / 5);
    }

    public void stop() {
        System.out.println(brand + " " + model + " has stopped");
    }

    public void refuel(int amount) {
        System.out.println(amount + " liters has been refueled");

        if (amount > (100 - fuel)) {
            fuel = 100;
        } else {
            fuel += amount;
        }
    }

    public void displayDetails() {
        System.out.println("==============================================");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuel);
        System.out.println("==============================================");
    }

    public void displayAppearnce() {
        //System.out.println("========================================================");
        System.out.printf("Brand: %10s\tModel: %10s\tColor: %10s\n", brand, model, color);
    }

    public void dashboard() {
        System.out.println("Dashboard");
        System.out.println("==============================================");
        System.out.printf("Speed: %5d km/h\tFuel: %5d L\n", speed, fuel);
        System.out.println("==============================================");
    }
    
}