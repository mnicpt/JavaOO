import com.hr.personnel.FoodException;
import com.hr.personnel.Person;

public class PersonClient {

  public static void main(String[] args) {
    Person p = new Person("Linda", 57, 65, 147);
    
    p.setAge(-10);
    
    try {
      p.eat("salad");
      p.eat("pizza");
      p.eat("chicken");
    }
    catch (FoodException e) {
      e.printStackTrace();
    }
  }
}