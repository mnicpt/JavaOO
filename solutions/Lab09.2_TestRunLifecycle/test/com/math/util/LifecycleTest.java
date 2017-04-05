package com.math.util;

import junit.framework.TestCase;

public class LifecycleTest
extends TestCase {
  
  public void setUp() {
    System.out.println("setUp");
  }
  
  public void tearDown() {
    System.out.println("tearDown");
  }
  
  public void testOne() {
    System.out.println("testOne");
  }
  
  public void testTwo() {
    System.out.println("testTwo");
  }
}