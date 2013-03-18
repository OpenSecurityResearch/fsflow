package com.foundstone.fsflow.lib;

import javax.annotation.concurrent.Immutable;

/**
 *
 */
@Immutable
public final class CallBlockFlow {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public static CallBlockFlow from(String value, Response positiveResponse,
          Response negativeResponse, Response recoveryResponse) {
    
    CallBlockFlow flow = new CallBlockFlow();
    flow.value = value;
    flow.positiveResponse = positiveResponse;
    flow.negativeResponse = negativeResponse;
    flow.recoveryResponse = recoveryResponse;
    
    return flow;
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  private volatile String value;
  
  private volatile Response positiveResponse;
  
  private volatile Response negativeResponse;
  
  private volatile Response recoveryResponse;
  
  
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
  
  public Response getPositiveResponse() {
    return positiveResponse;
  }

  public Response getNegativeResponse() {
    return negativeResponse;
  }

  public Response getRecoveryResponse() {
    return recoveryResponse;
  }

}
