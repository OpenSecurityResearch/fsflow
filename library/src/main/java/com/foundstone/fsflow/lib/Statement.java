package com.foundstone.fsflow.lib;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.Immutable;

/**
 *
 */
@Immutable
public final class Statement {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  private static final Pattern VARIABLE_PATTERN = Pattern.compile("\\[(.+?)\\]");
  

  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public static Statement from(String value) {
    Statement s = new Statement();
    s.value = value;
    return s;
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  private volatile String value;
  
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public ImmutableSet<String> getVariables() {
    
    ImmutableSet.Builder<String> builder = new ImmutableSet.Builder<String>();
    
    Matcher m = VARIABLE_PATTERN.matcher(value);
    while (m.find()) {
      String g = m.group(1);
      builder.add(g);
    }
    return builder.build();
  }
  
  //------------------------ Implements:
  
  //------------------------ Overrides:
  
  //---------------------------- Abstract Methods -----------------------------
  
  //---------------------------- Utility Methods ------------------------------
  
  //---------------------------- Property Methods -----------------------------     
  
  public String getValue() {
    return value;
  }
}
