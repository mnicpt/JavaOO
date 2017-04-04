package com.hr.personnel;

import java.sql.Date;

public class HourlyEmployee
extends Employee {
  // INSTANCE VARIABLES
  private double rate;
  private double hours;
  
  // CONSTRUCTORS
  public HourlyEmployee() {
  }
  
  public HourlyEmployee(String name, Date hireDate) {
    this.setName(name);
    this.setHireDate(hireDate);
  }
  
  public HourlyEmployee(String name, Date hireDate, double rate, double hours) {
    this.setName(name);
    this.setHireDate(hireDate);
    this.setRate(rate);
    this.setHours(hours);
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