package com.math.util;

import junit.framework.TestCase;

public class CalculatorTest
extends TestCase {
  
  public void testAdd() {
    assertEquals(5.0, Calculator.add(2, 3));
  }
  
  public void testSubtract(){
    assertEquals(3.0, Calculator.subtract(5, 2));
  }
  
  public void testMultiply() {
    assertEquals(45.0, Calculator.multiply(15, 3));
  }
  
  public void testDivide() {
    assertEquals(5.0, Calculator.divide(15, 3));
  }
  
  public void testSquareRoot() {
    assertEquals(4.0, Calculator.squareRoot(16));
  }
}