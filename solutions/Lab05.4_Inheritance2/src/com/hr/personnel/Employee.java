package com.hr.personnel;

import java.sql.Date;

public class Employee {
  // INSTANCE VARIABLES
  private String name;
  private Date hireDate;
  
  // CONSTRUCTORS
  public Employee() {
  }
  
  public Employee(String name, Date hireDate) {
    this.setName(name);
    this.setHireDate(hireDate);
  }
  
  // BEHAVIORAL METHODS
  public void work() {
    System.out.println(this.getName() + " working hard since " + this.getHireDate());
  }
  
  public void pay() {
    System.out.println(this.getName() + " is paid...somehow");
  }
  
  // ACCESSOR METHODS
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public Date getHireDate() {
    return this.hireDate;
  }
  public void setHireDate(Date hireDate) {
    this.hireDate = hireDate;
  }
  
  public String toString() {
    return "Employee [name=" + this.getName() + ", hireDate=" + this.getHireDate() + "]";
  }
}