public class PersonClient {

  public static void main(String[] args) {
    // create Person objects via our new ctors
    Person p1 = new Person();
    System.out.println(p1.toString());
    
    Person p2 = new Person("Leanne");
    System.out.println(p2.toString());
    
    Person p3 = new Person("John", 17);
    System.out.println(p3.toString());
    
    Person p4 = new Person("Linda", 57, 65, 147);
    System.out.println(p4.toString());
  }
}