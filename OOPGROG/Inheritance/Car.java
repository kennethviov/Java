public class Car extends Vehicle{
    int numberOfSeats;
    String carEngine;

    public Car() {
        brand = "Tesla";
        model = "Model 3";
        color = "Red";
        speed = 40;
        fuel = 100;
        numberOfSeats = 5;
        carEngine = "electric";
    }

    void openTrunk() {
        System.out.println("Trunk opened.");
    }

    void slideDownWindow() {
        System.out.println("Window slipped down.");
    }
}