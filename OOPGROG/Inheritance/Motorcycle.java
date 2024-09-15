public class Motorcycle extends Vehicle {
    String motorType;
    
    public Motorcycle() { // default constructor
        brand = "Yamaha";
        model = "Fazzio";
        color = "Orange";
        speed = 45;
        fuel  = 100;
        motorType = "Scooter";
    }

    public Motorcycle(String brand, String model, String color, int speed, int fuel, String motorType) { // constructor
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.fuel = fuel;
        this.motorType = motorType;
    }

    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    public void wheelie() {
        System.out.println("You did a wheelie");
    }

    @Override
    public void displayDetails() {
        System.out.println("==============================================");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuel);
        System.out.println("Type: " + motorType);
        System.out.println("==============================================");
    }

    public void ride() {
        System.out.println("Ridden the vehicle...\n");
        System.out.println("[1] Start engine");
        System.out.println("[2] Move");
        System.out.println("[3] Dashboard");
        System.out.println("[4] Stop");
        System.out.println("[5] Refuel");
        System.out.println("[6] Wheelie");
        System.out.println("[7] Exit car (Return to Catalog)");
    }
}

