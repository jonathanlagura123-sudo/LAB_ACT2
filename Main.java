public class Main {
 public static void main (String []args) {
 
 Vehicle v1 = new Vehicle ();
 
 v1.brand = "Toyota";
 v1.model = "86 GT";
 v1.year = 2020;
 v1.displayinfo();
System.out.println("Age: " + v1.calculateAge());
System.out.println("Vintage: " + v1.isVintage());
 
 Vehicle v2 = new Vehicle ();
 
 v2.brand = "Ferrari";
 v2.model = "488 GTB";
 v2.year = 2018;
 v2.displayinfo();
 System.out.println("Age: " + v2.calculateAge());
System.out.println("Vintage: " + v2.isVintage());

Vehicle v3 = new Vehicle ();
 
 v3.brand = "Ford Mustang";
 v3.model = "GT";
 v3.year = 2020;
 v3.displayinfo();
 System.out.println("Age: " + v3.calculateAge());
System.out.println("Vintage: " + v3.isVintage());

 
 }
}