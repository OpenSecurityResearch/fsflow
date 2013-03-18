package com.foundstone.fsflow.lib;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.concurrent.Immutable;


/**
 *
 */
@Immutable
public final class CallFlow {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public static CallFlow from(String name, List<Objective> objectives, List<CallBlock> callBlocks, FlowBlock flowBlock) {
    CallFlow flow = new CallFlow();
    flow.name = name;
    flow.objectives = Lists.newArrayList(objectives);
    flow.callBlocks = Lists.newArrayList(callBlocks);
    flow.flowBlock = flowBlock;
    return flow;
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  private volatile String name;
  
  private volatile List<Objective> objectives;
  
  private volatile List<CallBlock> callBlocks;
  
  private volatile FlowBlock flowBlock;
  
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

  public void setName(String name) {
    this.name = name;
  }

  public List<Objective> getObjectives() {
    return objectives;
  }

  public List<CallBlock> getCallBlocks() {
    return callBlocks;
  }

  public FlowBlock getFlowBlock() {
    return flowBlock;
  }
}
