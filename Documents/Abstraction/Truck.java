public class Truck extends Vehicle {
   private int numberOfWheels;
   
   public Truck(String brand, String model, int year, int numberOfWheels){
      super(brand, model, year);
      this.numberOfWheels = numberOfWheels;
   }

   @Override
   public void displayInfo(){
      super.displayInfo();
      System.out.println("Number of Wheels: " + numberOfWheels);
   }

      @Override
   public void moveForward() {
       System.out.println("The truck moves forward.");
   }

   @Override
   public void moveBackward() {
        System.out.println("The truck moves Backward.");
   }

   @Override
   public void moveLeft() {
       System.out.println("The truck moves Right.");
;
   }

   @Override
   public void moveRight() {
       System.out.println("The truck moves Left.");
   }
}