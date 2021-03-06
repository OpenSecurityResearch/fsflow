package com.foundstone.fsflow.lib;

import com.google.common.collect.ImmutableSet;
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
  
  public static CallFlow from(String name, List<String> objectives, List<CallBlock> callBlocks, FlowBlock flowBlock) {
    CallFlow flow = new CallFlow();
    flow.name = name;
    flow.objectives = Lists.newArrayList(objectives);
    flow.callBlocks = Lists.newArrayList(callBlocks);
    flow.flowBlock = flowBlock;
    return flow;
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  private volatile String name;
  
  private volatile List<String> objectives;
  
  private volatile List<CallBlock> callBlocks;
  
  private volatile FlowBlock flowBlock;
  
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
 
  public ImmutableSet<String> getVariables() {
    ImmutableSet.Builder<String> builder = new ImmutableSet.Builder<String>();
    
    for (CallBlock block : callBlocks) {
      Statement s = block.getStatement();
      if (s != null) {
        builder.addAll(s.getVariables());
      }
    }
    
    return builder.build();
  }
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

  public List<String> getObjectives() {
    return objectives;
  }

  public List<CallBlock> getCallBlocks() {
    return callBlocks;
  }

  public FlowBlock getFlowBlock() {
    return flowBlock;
  }
}
