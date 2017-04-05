public class Person {
  
  // VARIABLES
  String name;
  int age;
  double height;
  double weight;
  
  // METHODS
  double calculateBMI() {
    return weight / height;
  }
  
  void eat(String food) {
    System.out.println(name + " is eating " + food);
  }
}