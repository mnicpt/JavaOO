package com.hr.personnel;

import gov.irs.Taxpayer;
import java.sql.Date;

public class SalariedEmployee
extends Employee
implements Taxpayer {
  // CLASS CONSTANTS
  public static final double TAX_RATE = 0.30;
  
  // INSTANCE VARIABLES
  private double salary;
  
  // CONSTRUCTORS
  public SalariedEmployee() {
    super();
  }

  public SalariedEmployee(String name, Date hireDate) {
    super(name, hireDate);  // pass common data to superclass ctor
  }
  
  public SalariedEmployee(String name, Date hireDate, double salary) {
    super(name, hireDate);  // pass common data to superclass ctor
    this.setSalary(salary); // deal with subclass data here
  }
  
  // BEHAVIORAL METHODS
  // DONE: implement pay() method by printing message: <name> is paid <value>
  public void pay() {
    System.out.println(this.getName() + " is paid " + this.getSalary());
  }
  
  // from interface Taxpayer
  public void payTaxes() {
    System.out.println(this.getName() + " paid taxes of " + (TAX_RATE * this.getSalary()));
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