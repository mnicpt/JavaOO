package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

public class Department {
  // INSTANCE VARIABLES
  private String name;
  private String location;
  private Collection<Employee> employees = new ArrayList<Employee>();
  
  // CONSTRUCTORS
  public Department() {
  }
  
  public Department(String name, String location) {
    this.setName(name);
    this.setLocation(location);
  }
  
  // BEHAVIORAL METHODS
  public void listEmployees() {
    for (Employee emp : employees) {
      System.out.println(emp.toString());
    }
  }
  
  public void workEmployees() {
    for (Employee emp : employees) {
      emp.work();
    }
  }
  
  // DONE: implement payEmployees() method by calling pay() on each Employee
  // it will look similar to the workEmployees() method above
  public void payEmployees() {
    for (Employee emp : employees) {
      emp.pay();
    }
  }
  
  // helper methods to work with the collection
  public void addEmployee(Employee emp) {
    employees.add(emp);
  }
  public void removeEmployee(Employee emp) {
    employees.remove(emp);
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