public class PersonClient {

  public static void main(String[] args) {
    // Lab03.1 - test age validation
    Person p = new Person();
    p.setName("Mary");
    p.setAge(10);  // valid
    p.setHeight(43.5);
    p.setWeight(175);
    System.out.println(p.toString());
    
    p.setAge(-10);  // invalid
    System.out.println(p.toString());  // age should still be 10
    
    // check the BMI and output a warning if appropriate
    double bmi = p.calculateBMI();
    
    if (bmi >= 3) {
      System.out.println("The person's BMI is 3 or greater");
    }
    else {
      System.out.println("The person's BMI is less than 3");
    }
    
    // make sure they don't eat pizza
    p.eat("pizza");
    p.eat("salad");
  }
}