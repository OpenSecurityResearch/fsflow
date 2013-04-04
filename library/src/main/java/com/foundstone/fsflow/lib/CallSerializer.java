package com.foundstone.fsflow.lib;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * Utility class for instantiating and setting up XStream instances.
 */
public final class CallSerializer {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public static XStream createStream() {
    
    XStream x = new XStream(new StaxDriver());
    
    // Flags
    x.alias("flag", Flag.class);
    x.useAttributeFor(Flag.class, "value");    

    // CallFlow
    x.aliasField("Name", CallFlow.class, "name");
    x.useAttributeFor(CallFlow.class, "name");    
    x.aliasField("FlowBlock", CallFlow.class, "flowBlock");
    x.alias("CallFlow", CallFlow.class);
    
    // Objective
    x.aliasField("Objectives", CallFlow.class, "objectives");
    x.addImplicitCollection(CallFlow.class, "objectives", "Objective", String.class);
    //x.addImplicitCollection(CallFlow.class, "objectives");
    
    
    // CallBlocks
    x.alias("CallBlock", CallBlock.class);
    x.addImplicitCollection(CallFlow.class, "callBlocks");
    x.useAttributeFor(CallBlock.class, "name");
    
    // Statements
    x.useAttributeFor(Statement.class, "value");

    // FlowBlock
    x.alias("FlowBlock", FlowBlock.class);
    x.useAttributeFor(FlowBlock.class, "name");
    x.addImplicitCollection(FlowBlock.class, "flows");
    x.aliasField("BustedResponse", FlowBlock.class, "bustedResponse");
    
    // CallBlockFlow
    x.alias("CallBlockFlow", CallBlockFlow.class);
    x.useAttributeFor(CallBlockFlow.class, "value");
    x.aliasField("PositiveResponse", CallBlockFlow.class, "positiveResponse");
    x.aliasField("NegativeResponse", CallBlockFlow.class, "negativeResponse");
    x.aliasField("RecoveryResponse", CallBlockFlow.class, "recoveryResponse");
    
    // Responses
    x.useAttributeFor(Response.class, "value");
    
    return x;
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
  private CallSerializer() {}
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  //------------------------ Implements:
  
  //------------------------ Overrides:
  
  //---------------------------- Abstract Methods -----------------------------
  
  //---------------------------- Utility Methods ------------------------------
  
  //---------------------------- Property Methods -----------------------------     
}
