public class AutomobileClient {
  
  // main is the entry point for every Java program
  public static void main(String[] args) {
    // create an instance of Automobile
    Automobile car1 = new Automobile();
    
    // set its properties
    car1.makeModel = "Toyota Matrix";
    car1.licensePlate = "ABC 123";
    
    // call the start() method on it
    car1.start();
    
    // create a 2nd instance, set its properties, and call start()
    Automobile car2 = new Automobile();
    car2.makeModel = "Honda Civic";
    car2.licensePlate = "XYZ 321";
    car2.start();
  }
}