public class Main {
    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2000);
        Vehicle v2 = new Vehicle("Ford", "Mustang", 1968);
        Vehicle v3 = new Vehicle("Honda", "Civic", 2022);

        System.out.println("--- Testing Getters and Initial Info ---");
        v1.displayInfo();
        v2.displayInfo();
        v3.displayInfo();
        
        System.out.println("\nUsing individual getters on v1:");
        System.out.println("Brand: " + v1.getBrand());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is Vintage: " + v1.isVintage());

        System.out.println("\n--- Testing setYear on v1 ---");
               boolean res1 = v1.setYear(2000);
        System.out.println("setYear(2000) -> Return: " + res1 + "; year is " + v1.getYear() + "; age: " + v1.calculateAge() + "; vintage: " + v1.isVintage());

              boolean res2 = v1.setYear(1885);
        System.out.println("setYear(1885) -> Return: " + res2 + "; year remains " + v1.getYear());

               boolean res3 = v1.setYear(2027);
        System.out.println("setYear(2027) -> Return: " + res3 + "; year remains " + v1.getYear());

        System.out.println("\n--- Testing Constructor with Invalid Years ---");
        Vehicle invalidV1 = new Vehicle("Chevrolet", "Camaro", 1885);
        System.out.println("New vehicle with year 1885 -> Initial year is " + invalidV1.getYear());

        Vehicle invalidV2 = new Vehicle("Tesla", "Model S", 2027);
        System.out.println("New vehicle with year 2027 -> Initial year is " + invalidV2.getYear());
    }
}