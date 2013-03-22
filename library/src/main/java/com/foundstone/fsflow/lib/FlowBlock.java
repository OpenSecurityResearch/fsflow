package com.foundstone.fsflow.lib;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.concurrent.Immutable;

/**
 *
 */
@Immutable
public class FlowBlock {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public static FlowBlock from(String name, List<CallBlockFlow> flows) {
    FlowBlock flow = new FlowBlock();
    flow.name = name;
    flow.flows = Lists.newArrayList(flows);
    return flow;
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  private volatile String name;
  
  private volatile List<CallBlockFlow> flows = Lists.newArrayList(); 
  
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

  public List<CallBlockFlow> getFlows() {
    return ImmutableList.copyOf(flows);
  }
}
