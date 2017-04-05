package com.company;

import gov.irs.Taxpayer;

public class Corporation
implements Taxpayer {
  
  // from interface Taxpayer
  public void payTaxes() {
    System.out.println("Corporation paid no taxes - we lobbied hard and it worked");
  }
}