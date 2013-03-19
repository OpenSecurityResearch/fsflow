package com.foundstone.fsflow.lib;

import javax.annotation.concurrent.Immutable;

/**
 *
 */
@Immutable
public final class CallBlock {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public static CallBlock from(String name, Statement statement) {
    CallBlock c = new CallBlock();
    c.name = name;
    c.statement = statement;
    return c;
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  private volatile String name;
  
  private volatile Statement statement;
  
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  //------------------------ Implements:
  
  //------------------------ Overrides:
  
  //---------------------------- Abstract Methods -----------------------------
  
  //---------------------------- Utility Methods ------------------------------
  
  //---------------------------- Property Methods -----------------------------     

  public String getName() {
    return name;
  }

  public Statement getStatement() {
    return statement;
  }
}
