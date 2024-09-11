public class Van extends Vehicle {
    final int cargoCap;
    int cargoLeft;  

    public Van() {
        brand = "Toyota";
        model = "Hiace";
        color = "white";
        speed = 50;
        fuel = 100;
        cargoCap = 1000;
    }

    void loadCargo(int weight) {
        if (weight < cargoCap && weight < cargoLeft) {
                cargoLeft = cargoCap - weight;
                System.out.println("Cargo loaded: " + weight + " kg, Remaining cargo: " + cargoLeft + " kg");
        } else {
            System.out.println("Cannot load cargo. Cargo capacity exceeded.");
        }
    }

    void unloadCargo() {
        cargoLeft = 0;
        System.out.println("Cargo unloaded.");
    }
}