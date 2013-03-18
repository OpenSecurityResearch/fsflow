package com.foundstone.fsflow.lib;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.File;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class Test {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

  public static void main(String[] args) {

    XStream x = CallSerializer.createStream();
    
    Set<Flag> flags = Sets.newHashSet(Flag.from("WebsiteURL"), Flag.from("Username"), Flag.from("Password"));
    Objective objective = Objective.from("VisitWebsite", flags);
    List<CallBlock> blocks = Lists.newArrayList(CallBlock.from("My Callblock", Statement.from("My Callblock statement")),
            CallBlock.from("My Callblock2", Statement.from("My Callblock statement2")));
    
    
    
//    CallBlockFlow flow1 = CallBlockFlow.from("Caller Pickup", Response.from("Introduction"), Response.from("RecoveryResponse"), Response.from("RecoveryResponse"));
//    CallBlockFlow flow2 = CallBlockFlow.from("Introduction", Response.from("Website Problems"), Response.from("RecoveryResponse"), Response.from("RecoveryResponse"));
//    CallBlockFlow flow3 = CallBlockFlow.from("Website Problems", Response.from("Successful Login"), Response.from("RecoveryResponse"), Response.from("RecoveryResponse"));
//    Response bustedResponse = Response.from("Busted");
//    FlowBlock flowBlock = FlowBlock.from("FlowBlock1", Lists.newArrayList(flow1, flow2, flow3), bustedResponse);
//    
//    CallFlow flow = CallFlow.from("UserCantLogIntoWebsite", Lists.newArrayList(objective), blocks, flowBlock);    
//        
//    String xml = x.toXML(flow);
    CallFlow flow = CallFlow.class.cast(x.fromXML(new File("test.xml")));
    System.out.println("Break");
    
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  //------------------------ Implements:
  
  //------------------------ Overrides:
  
  //---------------------------- Abstract Methods -----------------------------
  
  //---------------------------- Utility Methods ------------------------------
  
  //---------------------------- Property Methods -----------------------------     
}
