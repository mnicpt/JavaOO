public class Person {
  
  // VARIABLES
  private String name;
  private int age;
  private double height;
  private double weight;
  
  // BEHAVIORAL METHODS
  public double calculateBMI() {
    return weight / height;
  }
  
  public void eat(String food) {
    if (food.equals("pizza")) { 
      System.out.println("Sorry, I don't eat pizza");
    }
    else {
      System.out.println(this.getName() + " is eating " + food);
    }
  }
  
  // ACCESSOR METHODS
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public int getAge() {
    return this.age;
  }
  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    }
  }
  
  public double getHeight() {
    return this.height;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  
  public double getWeight() {
    return this.weight;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
  
  public String toString() {
    return "Person [name=" + this.getName() + ", age=" + this.getAge() + ", height="
      + this.getHeight() + ", weight=" + this.getWeight() + "]";
  }
}