package com.hr.personnel;

public class FoodException
extends Exception {

  public FoodException() {
  }

  public FoodException(String message) {
    super(message);
  }

  public FoodException(Throwable cause) {
    super(cause);
  }

  public FoodException(String message, Throwable cause) {
    super(message, cause);
  }
}