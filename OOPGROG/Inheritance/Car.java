public class Car extends Vehicle{
    private int numberOfSeats;
    private String carEngine;

    public Car() {
        brand = "Tesla";
        model = "Model 3";
        color = "Red";
        speed = 40;
        fuel = 100;
        numberOfSeats = 5;
        carEngine = "Electric";
    }

    public Car(String brand, String model, String color, int speed, int fuel, int numberOfSeats, String carEString) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.fuel = fuel;
        this.numberOfSeats = numberOfSeats;
        this.carEngine = carEString;
    }

    public void openTrunk() {
        System.out.println("Trunk opened.");
    }

    public void slideDownWindow() {
        System.out.println("Window slipped down.");
    }

    public void transform () {
        System.out.println("Autobots, Roll out!");
        System.out.println("EURGH, ORH< EURGH, ORH< EURGH");
    }

    @Override
    public void displayDetails() {
        System.out.println("==============================================");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuel);
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Car Engine: " + carEngine);

        if (model.equals("Bumblebee")) {
            System.out.println("Special Features: ");
            System.out.println("Transforms, Talks, and is an Alien");
        }
        System.out.println("==============================================");
    }

    public void ride(String str) {
        System.out.println("Ridden the vehicle...\n");
        System.out.println("[1] Move");
        System.out.println("[2] Dashboard");
        System.out.println("[3] Stop");
        System.out.println("[4] Refuel");
        System.out.println("[5] Slide down window");
        System.out.println("[6] Open Trunk");
        System.out.println("[7] Exit car (Return to Catalog)");

        if (str.equals("Bumblebee")) {
            System.out.println("[8] Transform");
        }
    }
}