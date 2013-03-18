package com.foundstone.fsflow.lib;

import javax.annotation.concurrent.Immutable;

/**
 *
 */
@Immutable
public final class Response {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public static Response from(String value) {
    Response r = new Response();
    r.value = value;
    return r;
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  private volatile String value;
  
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  //------------------------ Implements:
  
  //------------------------ Overrides:
  
  //---------------------------- Abstract Methods -----------------------------
  
  //---------------------------- Utility Methods ------------------------------
  
  //---------------------------- Property Methods -----------------------------     
  
  public String getValue() {
    return value;
  }
}
