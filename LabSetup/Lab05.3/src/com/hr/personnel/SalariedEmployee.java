package com.hr.personnel;

import java.sql.Date;

public class SalariedEmployee
extends Employee {
  // INSTANCE VARIABLES
  private double salary;
  
  // CONSTRUCTORS
  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, Date hireDate) {
    this.setName(name);
    this.setHireDate(hireDate);
  }
  
  public SalariedEmployee(String name, Date hireDate, double salary) {
    this.setName(name);
    this.setHireDate(hireDate);
    this.setSalary(salary);
  }
  
  // ACCESSOR METHODS
  public double getSalary() {
    return this.salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  
  public String toString() {
    return "SalariedEmployee [name=" + this.getName() + ", hireDate=" + this.getHireDate() +
      ", salary=" + this.getSalary() + "]";
  }
}