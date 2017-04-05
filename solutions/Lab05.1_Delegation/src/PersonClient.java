import com.hr.personnel.Person;

public class PersonClient {

  public static void main(String[] args) {
    // create an instance of Person and show its data
    Person p = new Person("Linda", 57, 65, 147);
    System.out.println(p.toString());
    
    // get its BMI and print (as before)
    // NOTE: can't tell that Calculator is being used behind the scenes
    // this is another example of encapsulation
    double bmi = p.calculateBMI();
    System.out.println(p.getName() + " has a BMI of: " + bmi);
  }
}