public class IdentityTest {

  public static void main(String[] args) {
    // create two Automobiles and test for identity
    Automobile car1 = new Automobile();
    Automobile car2 = new Automobile();
    System.out.println("car1 == car2: " + (car1 == car2));  // different objects
    
    // see if an object reference is null
    Automobile auto = null;
    System.out.println("auto == null: " + (auto == null));
  }
}