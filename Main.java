  public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveRight();
        vehicle.moveLeft();
    }

    public static void printMovement(Vehicle vehicle) {
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
    }

    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang GT", 2020, 4);
        Motorcycle motor = new Motorcycle("Yamaha", "TMX 125", 2023, "Manual");
        Truck truck = new Truck("Scania", "R 770", 2023, 10);
        Printer printer = new Printer();

        Serviceable[] serviceableItems = { car, motor, truck, printer };
        System.out.println("_____Serviceable Items_____");
        for (Serviceable item : serviceableItems) {
            performService(item);
        }

        System.out.println();

        Vehicle[] vehicles = { car, motor, truck };
        System.out.println("_____Vehicle Info & Movement_____");
        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }
    }
}