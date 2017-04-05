public class PersonClientArgs {

  public static void main(String[] args) {
    // check to see that we got all 4 arguments
    if (args.length != 4) {
      System.out.println("Usage: java PersonClientArgs <name> <age> <height> <weight>");
      return;  // ends program early
    }
    
    // create new Person object
    Person p = new Person();
    
    // set the data - args assumed to be in this order: name, age, height, weight
    p.setName(args[0]);
    p.setAge(Integer.parseInt(args[1]));
    p.setHeight(Double.parseDouble(args[2]));
    p.setWeight(Double.parseDouble(args[3]));
    
    // show the Person's data
    System.out.println(p.toString());
    
    // show their BMI
    System.out.println(p.getName() + " has a BMI of: " + p.calculateBMI());
  }
}