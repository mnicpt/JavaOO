import java.util.ArrayList;
import java.util.List;

public class AutoboxTest {

  public static void main(String[] args) {
    // NOTE: always use a type-safe collection where possible
    
    // without autoboxing
    List<Integer> ageList1 = new ArrayList<Integer>();
    ageList1.add(new Integer(38));
    Integer ageInteger = ageList1.get(0);
    int age1 = ageInteger.intValue();
    System.out.println(age1);
    
    // with autoboxing
    List<Integer> ageList2 = new ArrayList<Integer>();
    ageList2.add(45);            // autoboxed into new Integer(45)
    int age2 = ageList2.get(0);  // auto-unboxed from Integer(45)
    System.out.println(age2);
  }
}