public class Main {
    public static void main(String[] args) {

                Vehicle v1 = new Vehicle("Toyota", "Corolla", 2010);
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

                Vehicle v2 = new Vehicle("Ferrari", "488 GTB", 2018);
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());

        Vehicle v3 = new Vehicle("Ford Mustang", "GT", 2020);
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
    }
}