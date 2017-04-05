public class PersonClient {

  public static void main(String[] args) {
    // create a Person object and set its data - using accessor methods now
    Person p = new Person();
    p.setName("Jason");
    p.setAge(42);
    p.setHeight(73.5);
    p.setWeight(170);
    
    // call methods on it
    double bmi = p.calculateBMI();
    System.out.println(p.getName() + " has a BMI of: " + bmi);
    
    p.eat("pizza");
    
    System.out.println(p.toString());
    
    System.out.println();
    
    // create a Person object, but don't set its data - what are the values?
    Person p2 = new Person();
    System.out.println(p2.toString());
  }
}