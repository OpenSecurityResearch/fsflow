package com.foundstone.fsflow.lib;

import javax.annotation.concurrent.ThreadSafe;

/**
 * State machine for moving between CallBlocks.
 */
@ThreadSafe
public class CallMachine {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  private final CallFlow callFlow;
  
  private CallBlockFlow currentCallBlockFlow;
  
  private boolean busted = false;
  
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
  public CallMachine(CallFlow callFlow) {
    this.callFlow = callFlow;
    synchronized(this) {
      currentCallBlockFlow = callFlow.getFlowBlock().getFlows().get(0);
    }
  }
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public synchronized CallBlockFlow  currentCallBlockFlow() {
    return currentCallBlockFlow;
  }
  
  /**
   * Returns (but does not move to) the CallBlockFlow associated with a positive
   * response.
   * 
   * @return The CallBlockFlow, or null if none has been defined.
   */
  public synchronized CallBlockFlow getPositiveResponse() {
    if (busted) {
      throw new IllegalStateException("CallMachine is in the busted state.");
    }
    
    return findFlowFromResponse(currentCallBlockFlow.getPositiveResponse());
  }
  
  /**
   * Returns (but does not move to) the CallBlockFlow associated with a negative
   * response.
   * 
   * @return The CallBlockFlow, or null if none has been defined.
   */  
  public synchronized CallBlockFlow getNegativeResponse() {
    if (busted) {
      throw new IllegalStateException("CallMachine is in the busted state.");
    }
    
    return findFlowFromResponse(currentCallBlockFlow.getNegativeResponse());
  }

  /**
   * Returns (but does not move to) the CallBlockFlow associated with a recovery
   * response.
   * 
   * @return The CallBlockFlow, or null if none has been defined.
   */  
  public synchronized CallBlockFlow getRecoveryResponse() {
    if (busted) {
      throw new IllegalStateException("CallMachine is in the busted state.");
    }
    
    return findFlowFromResponse(currentCallBlockFlow.getRecoveryResponse());
  }  
  
  /**
   * Moves to and returns the CallBlockFlow associated with a positive response.
   */
  public synchronized CallBlockFlow positiveResponse() {
    if (busted) {
      throw new IllegalStateException("CallMachine is in the busted state.");
    }
    
    CallBlockFlow flow = getPositiveResponse();     
    if (flow == null) {
      throw new IllegalStateException("No positive response is defined for this CallBlockFlow.");
    }
    
    currentCallBlockFlow = flow;
    
    return currentCallBlockFlow;
  }
  
  public synchronized CallBlockFlow negativeResponse() {
    if (busted) {
      throw new IllegalStateException("CallMachine is in the busted state.");
    }
    
    CallBlockFlow flow = getNegativeResponse();     
    if (flow == null) {
      throw new IllegalStateException("No negative response is defined for this CallBlockFlow.");
    }
    
    currentCallBlockFlow = flow;
    
    return currentCallBlockFlow;
  }
  
  public synchronized CallBlockFlow recoveryResponse() {
    if (busted) {
      throw new IllegalStateException("CallMachine is in the busted state.");
    }
    
    CallBlockFlow flow = getRecoveryResponse();     
    if (flow == null) {
      throw new IllegalStateException("No recovery response is defined for this CallBlockFlow.");
    }
    
    currentCallBlockFlow = flow;
    
    return currentCallBlockFlow;
  }  
  
  public synchronized Response busted() {
    busted = true;
    return callFlow.getFlowBlock().getBustedResponse();
  }
  
  //------------------------ Implements:
  
  //------------------------ Overrides:
  
  //---------------------------- Abstract Methods -----------------------------
  
  //---------------------------- Utility Methods ------------------------------
  
  private CallBlockFlow findFlowFromResponse(Response response) {
    
    if (response == null) {
      return null;
    }
    
    CallBlockFlow next = null;
    for (CallBlockFlow f : callFlow.getFlowBlock().getFlows()) {
      if (f.getValue().equalsIgnoreCase(response.getValue())) {
        next = f;
        break;
      }
    }
    
    return next;        
  }
  
  //---------------------------- Property Methods -----------------------------     
  
  public CallFlow getCallFlow() {
    return callFlow;
  }
}
