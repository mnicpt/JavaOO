package com.hr.personnel;

import java.sql.Date;

public class HourlyEmployee
extends Employee {
  // INSTANCE VARIABLES
  private double rate;
  private double hours;
  
  // CONSTRUCTORS
  public HourlyEmployee() {
    super();
  }
  
  public HourlyEmployee(String name, Date hireDate) {
    super(name, hireDate);  // pass common data to superclass ctor
  }
  
  public HourlyEmployee(String name, Date hireDate, double rate, double hours) {
    super(name, hireDate);  // pass common data to superclass ctor
    this.setRate(rate);     // deal with subclass data here
    this.setHours(hours);
  }
  
  // BEHAVIORAL METHODS
  // DONE: implement pay() method by printing message: <name> is paid <value>
  public void pay() {
    System.out.println(this.getName() + " is paid " + (this.getRate() * this.getHours()));
  }
  
  // ACCESSOR METHODS
  public double getRate() {
    return this.rate;
  }
  public void setRate(double rate) {
    this.rate = rate;
  }
  
  public double getHours() {
    return this.hours;
  }
  public void setHours(double hours) {
    this.hours = hours;
  }
  
  public String toString() {
    return "HourlyEmployee [name=" + this.getName() + ", hireDate=" + this.getHireDate() +
    	", rate=" + this.getRate() + ", hours=" + this.getHours() + "]";
  }  
}