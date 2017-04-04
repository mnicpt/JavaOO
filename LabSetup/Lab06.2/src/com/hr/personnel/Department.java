package com.hr.personnel;

public class Department {
  // INSTANCE VARIABLES
  private String name;
  private String location;
  private Employee[] employees = new Employee[100];
  private int currentIndex = 0;  // for dealing with array
  
  // CONSTRUCTORS
  public Department() {
  }
  
  public Department(String name, String location) {
    this.setName(name);
    this.setLocation(location);
  }
  
  // BEHAVIORAL METHODS
  public void listEmployees() {
    for (int i = 0; i < currentIndex; i++) {
      System.out.println(employees[i].toString());
    }
  }
  
  public void workEmployees() {
    for (int i = 0; i < currentIndex; i++) {
      employees[i].work();
    }
  }
  
  // DONE: implement payEmployees() method by calling pay() on each Employee
  // it will look similar to the workEmployees() method above
  public void payEmployees() {
    for (int i = 0; i < currentIndex; i++) {
      employees[i].pay();
    }
  }
  
  // helper method to add an Employee to the array
  public void addEmployee(Employee emp) {
    employees[currentIndex++] = emp;
  }
  
  // ACCESSOR METHODS
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public String getLocation() {
    return this.location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  public String toString() {
    return "Department [name=" + this.getName() + ", location=" + this.getLocation() + "]";
  }
}