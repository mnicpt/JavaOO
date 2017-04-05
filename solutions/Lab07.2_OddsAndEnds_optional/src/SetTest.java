import java.util.Collection;
import java.util.HashSet;
import com.hr.personnel.Person;

public class SetTest {

  public static void main(String[] args) {
    Collection<Person> set = new HashSet<Person>();

    Person p1 = new Person("Linda", 57, 65, 147);
    Person p2 = new Person("Leanne", 24, 66, 119);
    Person p3 = new Person("Linda", 57, 65, 147);  // duplicate, won't be added
    
    set.add(p1);  // set calls p1.hashCode() - different (nothing there) - added
    set.add(p2);  // set calls p2.hashCode() - different - added
    set.add(p3);  // set calls p3.hashCode() - same, so it calls equals() - same, so not added
    
    System.out.println("The set contains " + set.size() + " elements");
  }
}