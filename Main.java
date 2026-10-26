public class Main{

      public static void printDetails (Vehicle vehicle){
       vehicle.displayInfo();
      }

      public static void main (String[] args){
         Vehicle vehicle = new Car ("Toyota", "86 GT", 2020, 4);
            vehicle.displayInfo();
            System.out.println();
      
         vehicle = new Motorcycle ("Yamaha", "TMX 125", 2023, "Manual");
            vehicle.displayInfo();
            System.out.println();
      
            vehicle = new Truck ("Scania", "R770", 2023, 10);
            vehicle.displayInfo();
            System.out.println();
          Car car = new Car("Ford", "Mustang GT", 2020, 4);
          Motorcycle motor = new Motorcycle("Yamaha", "TMX 125", 2023, "Manual");
          Truck truck = new Truck("Scania", "R 770", 2023, 10);

      
         printDetails(car);
            System.out.println();
         printDetails(motor);
            System.out.println();
         printDetails(truck);
            System.out.println();
      
         System.out.println("_____Polymorphic Array_____");
         Vehicle[] vehicles = {
           new Car("Chevrolet", "Camaro SS", 2021, 4),
    new Motorcycle("Kawasaki", "Ninja 400", 2022, "Manual"),
    new Truck("Volvo", "FH16 750", 2024, 10)         };
      
         for(Vehicle currentVehicle : vehicles){
            printDetails(currentVehicle);
            System.out.println();
         }
      }
}