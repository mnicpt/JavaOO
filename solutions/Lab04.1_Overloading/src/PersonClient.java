public class PersonClient {

  public static void main(String[] args) {
    Person p = new Person();
    p.setName("Gordon");
    
    p.eat();
    p.eat("scrambled eggs");
    p.eat("pizza");
  }
}