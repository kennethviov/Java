public class Van extends Vehicle {
    private final int cargoCap;
    private int cargoLeft;  

    public Van() { // default constructor
        brand = "Toyota";
        model = "Hiace";
        color = "white";
        speed = 50;
        fuel = 100;
        cargoCap = 1000;
        cargoLeft = cargoCap; 
    }

    public Van(String brand, String model, String color, int speed, int fuel, int cargoCap) { // constructor
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.fuel = fuel;
        this.cargoCap = cargoCap;
        cargoLeft = cargoCap;
    }

    public void loadCargo(int weight) {
        if (weight < cargoCap && weight < cargoLeft) {
                cargoLeft = cargoCap - weight;
                System.out.println("Cargo loaded: " + weight + " kg, Remaining cargo: " + cargoLeft + " kg");
        } else {
            System.out.println("Cannot load cargo. Cargo capacity exceeded.");
        }
    }

    public void unloadCargo() {
        cargoLeft = 0;
        System.out.println("Cargo unloaded.");
    }

    @Override
    public void displayDetails() {
        System.out.println("==============================================");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuel);
        System.out.println("Cargo Capacity: " + cargoCap);

        if (model.equals("Rustbucket")) {
            System.out.println("Special Features: ");
            System.out.println("Jet Propulsion and Laser Weaponry");
        }
        System.out.println("==============================================");
    }

    public void ride(String str) {
        System.out.println("Ridden the vehicle...");
        System.out.println("[1] Move");
        System.out.println("[2] Dashboard");
        System.out.println("[3] Stop");
        System.out.println("[4] Refuel");
        System.out.println("[5] Load Cargo");
        System.out.println("[6] Unload Cargo");
        System.out.println("[7] Exit car (Return to Catalog)");

        if (str.equals("Rustbucket")) {
            System.out.println("[8] Jet Propell");
            System.out.println("[9] Shoot Laser");
        }
    }

    public void jetPropell() {
        System.out.println("Jet Propulsion activated. Speed +500");
        speed += 500;
    }

    public void shootLaser() {
        System.out.println("Laser Shooted. Damage +100 but Fuel -50");
        fuel -= 50;
    }
}