public class PersonClient {

  public static void main(String[] args) {
    // create a Person object and set its data
    Person p = new Person();
    p.name = "Jason";
    p.age = 42;
    p.height = 73.5;
    p.weight = 170;
    
    // call methods on it
    double bmi = p.calculateBMI();
    System.out.println(p.name + " has a BMI of: " + bmi);
    
    p.eat("pizza");
  }
}