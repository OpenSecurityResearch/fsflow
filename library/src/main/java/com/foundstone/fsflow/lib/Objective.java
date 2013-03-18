package com.foundstone.fsflow.lib;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.concurrent.Immutable;

/**
 *
 */
@Immutable
public final class Objective {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public static Objective from(String name, Set<Flag> flags) {
    Objective o = new Objective();
    o.flags = Sets.newHashSet(flags);
    o.name = name;
    return o;
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  private volatile String name;
  
  private volatile Set<Flag> flags = Sets.newHashSet();
  
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
  
  public ImmutableSet<Flag> getFlags() {
    return ImmutableSet.copyOf(flags);
  }
}
