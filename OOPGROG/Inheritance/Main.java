import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Van> vans = new ArrayList<>();
        ArrayList<Motorcycle> motors = new ArrayList<>();

        Van van1 = new Van("Foton", "Toano", "Silver", 60, 80, 1200);
        Van van2 = new Van("Hyundai", "Staria", "Black", 70, 75, 900);
        Van van3 = new Van("Ben 10", "Rustbucket", "Retro Colors", 69, 99, 2000);
        Van van4 = new Van();

        Car car1 = new Car("Toyota", "Corolla", "White", 200, 50, 5, "Manual");
        Car car2 = new Car("Honda", "Accord", "Blue", 180, 60, 7, "Automatic");
        Car car3 = new Car("Autobot", "Bumblebee", "Yellow", 300, 100, 5, "Transformers");
        Car car4 = new Car();

        Motorcycle motorcycle1 = new Motorcycle("Suzuki", "T-Rex", "Black", 120, 40, "Cruisers");
        Motorcycle motorcycle2 = new Motorcycle("Yamaha", "YZF-R1", "White", 150, 50, "Sports");
        Motorcycle motorcycle3 = new Motorcycle();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        vans.add(van1);
        vans.add(van2);
        vans.add(van3);
        vans.add(van4);

        motors.add(motorcycle1);
        motors.add(motorcycle2);
        motors.add(motorcycle3);
        

        int choice = 0;
        int innerChoice = 0;
        do {
            catalog();

            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    displayCatalog(vans, cars, motors);

                    String input1 = "";
                    do {        
                        System.out.println("Enter a vehicle number to view more details (ex. V1, V2, etc.) ");
                        System.out.println("Or you can view the details of all by pressing [-1] or go back by pressing [0]");

                        input1 = scan.nextLine();
                        int v_i = Integer.parseInt(input1.replaceAll("[^0-9]", ""));

                        if (input1.contains("V") || input1.contains("v"))
                            vans.get(v_i-1).displayDetails();
                        else if (input1.contains("C") || input1.contains("c"))
                            cars.get(v_i-1).displayDetails();
                        else if (input1.contains("M") || input1.contains("m"))
                            motors.get(v_i-1).displayDetails();
                        else if (input1.equals("-1"))
                            displayAll(vans, cars, motors);
                        else if (input1.equals("0"))
                            break;
                        else 
                            System.out.println("Invalid input. Please try again.");
                    } while (!input1.equals("0"));

                    break;
                case 2:
                String input2 = "";
                    do {
                        displayCatalog(vans, cars, motors);
        
                        System.out.print("Enter a vehicle number to ride (ex. V1, V2, etc.) ");
                        System.out.println("Or you can go back by pressing [0]");
                        
                        input2 = scan.nextLine();
                        int v_i = Integer.parseInt(input2.replaceAll("[^0-9]", ""));

                        // for Vans
                        if (input2.contains("V") || input2.contains("v")) {
                            vans.get(v_i-1).ride(vans.get(v_i-1).model);

                            String input2v = "";
                            do {
                                input2v = scan.nextLine();
                                innerChoice = Integer.parseInt(input2v.replaceAll("[^0-9]", ""));

                                switch (innerChoice) {
                                    case 1: vans.get(v_i-1).move(); break;
                                    case 2: vans.get(v_i-1).dashboard(); break;
                                    case 3: vans.get(v_i-1).stop(); break;
                                    case 4:
                                        System.out.println("Enter amount to refuel");
                                        int fuel = scan.nextInt();
                                        scan.nextLine();
                                        vans.get(v_i-1).refuel(fuel);
                                        break;
                                    case 5: 
                                        System.out.println("Enter the weight of the cargo");
                                        int weight = scan.nextInt();
                                        scan.nextLine();
                                        vans.get(v_i-1).loadCargo(weight); 
                                        break;
                                    case 6: vans.get(v_i-1).unloadCargo(); break;
                                    case 7: break;
                                    case 8: vans.get(v_i-1).jetPropell(); break;
                                    case 9: vans.get(v_i-1).shootLaser(); break;
                                    default:
                                        System.out.println("1Invalid input. Please try again");
                                        break;
                                }
                            } while (innerChoice != 7);

                        } else if (input2.contains("C") || input2.contains("c")) {
                            cars.get(v_i-1).ride(cars.get(v_i-1).model);

                            String input2c = "";
                            do {
                                input2c = scan.nextLine();
                                innerChoice = Integer.parseInt(input2c.replaceAll("[^0-9]", ""));

                                switch (innerChoice) {
                                    
                                    case 1: cars.get(v_i-1).move(); break;
                                    case 2: cars.get(v_i-1).dashboard(); break;
                                    case 3: cars.get(v_i-1).stop(); break;
                                    case 4:
                                        System.out.println("Enter amount to refuel");
                                        int fuel = scan.nextInt();
                                        scan.nextLine();
                                        cars.get(v_i-1).refuel(fuel);
                                        break;
                                    case 5: cars.get(v_i-1).slideDownWindow(); break;
                                    case 6: cars.get(v_i-1).openTrunk(); break;
                                    case 7: break;
                                    case 8: cars.get(v_i-1).transform(); break;
                                    default:
                                        System.out.println("1Invalid input. Please try again");
                                        break;
                                }
                            } while (innerChoice != 7);

                        } else if (input2.contains("M") || input2.contains("m")) {
                            motors.get(v_i-1).ride();

                            String input2m = "";
                            do {
                                input2m = scan.nextLine();
                                innerChoice = Integer.parseInt(input2m.replaceAll("[^0-9]", ""));

                                switch (innerChoice) {
                                    case 1: motors.get(v_i-1).startEngine(); break;
                                    case 2: motors.get(v_i-1).move(); break;
                                    case 3: motors.get(v_i-1).dashboard(); break;
                                    case 4: motors.get(v_i-1).stop(); break;
                                    case 5:
                                        System.out.println("Enter amount to refuel");
                                        int fuel = scan.nextInt();
                                        scan.nextLine();
                                        motors.get(v_i-1).refuel(fuel);
                                        break;
                                    case 6: motors.get(v_i-1).wheelie(); break;
                                    case 7: break;
                                    default:
                                        System.out.println("1Invalid input. Please try again");
                                        break;
                                }
                            } while (innerChoice != 7);

                        } else if (input2.equals("0"))
                            break;
                        else 
                            System.out.println("2Invalid input. Please try again.");
                    } while (!input2.equals("0"));

                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("3Invalid imput. Try again.");
                    break;
            }
        } while (choice != 4);

        scan.close();
    }

    static void catalog() {
        System.out.println("==============================================");
        System.out.println("OOP-I's Vehicle Rentals\n");
        
        System.out.println("[1] Catalog");
        System.out.println("[2] Ride a Vehicle");
        System.out.println("[3] Exit");
        System.out.println("==============================================");
    }

    static void displayCatalog(ArrayList<Van> vans, ArrayList<Car> cars, ArrayList<Motorcycle> motors) {
        int i = 1, j = 1, k = 1;
        
        System.out.println("==============================================");

        System.out.println("Vans");
        System.out.println("======================");
        for (Van van : vans) {
            System.out.print("[V"+ i++ + "] ");
            van.displayAppearnce();
        }
        
        System.out.println("Cars");
        System.out.println("======================");
        for (Car car : cars) {
            System.out.print("[C"+ j++ + "] ");
            car.displayAppearnce();
        }

        System.out.println("Motorcycles");
        System.out.println("======================");
        for (Motorcycle motor : motors) {
            System.out.print("[M"+ k++ + "] ");
            motor.displayAppearnce();
        }

        System.out.println("==============================================");
    }

    static void displayAll(ArrayList<Van> vans, ArrayList<Car> cars, ArrayList<Motorcycle> motors) {
        int i = 1, j = 1, k = 1;

        System.out.println("==============================================");

        System.out.println("Vans");
        for (Van van : vans) {
            System.out.print("[V"+ i++ + "] \n");
            van.displayDetails();
            System.out.println();
        }

        System.out.println("===============");

        System.out.println("Cars");
        for (Car car : cars) {
            System.out.print("[C"+ j++ + "] \n");
            car.displayDetails();
            System.out.println();
        }

        System.out.println("===============");

        System.out.println("Motorcycles");
        for (Motorcycle motor : motors) {
            System.out.print("[M"+ k++ + "] \n");
            motor.displayDetails();
            System.out.println();
        }

        System.out.println("==============================================");
    }
}