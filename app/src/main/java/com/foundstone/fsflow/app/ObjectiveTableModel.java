package com.foundstone.fsflow.app;

import com.foundstone.fsflow.lib.Flag;
import com.foundstone.fsflow.lib.Objective;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.concurrent.NotThreadSafe;
import javax.swing.table.AbstractTableModel;

/**
 *
 */
@NotThreadSafe
public final class ObjectiveTableModel extends AbstractTableModel {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  private static final String[] COLUMN_NAMES= {"Objective", "Value"};
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  private final Map<Flag,String> map = Maps.newLinkedHashMap();
  
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public void setObjective(Objective objective) {
    map.clear();
    
    for (Flag f : objective.getFlags()) {
      map.put(f, "[Empty]");
    }
  }
  
  //------------------------ Implements:
  
  //------------------------ Overrides: AbstractTableModel
  
  @Override
  public void setValueAt(Object value, int rowIndex, int columnIndex) {
    Flag[] flags = map.keySet().toArray(new Flag[0]);
    map.put(flags[rowIndex], value.toString());
    super.fireTableCellUpdated(rowIndex, columnIndex);
  }
  
  @Override
  public String getColumnName(int columnIndex) {
    return COLUMN_NAMES[columnIndex];
  }
  
  public int getRowCount() {
    return map.size();
  }

  public int getColumnCount() {
    return COLUMN_NAMES.length;
  }

  public Object getValueAt(int rowIndex, int columnIndex) {
    Flag[] flags = map.keySet().toArray(new Flag[0]);
    
    if (columnIndex == 0) {
      return flags[rowIndex].getValue();
    } else {
      return map.get(flags[rowIndex]);
    }
  }  
  
  @Override
  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return columnIndex == 1;  // Only the value column can be edited.
    
  }
  
  
  //---------------------------- Abstract Methods -----------------------------
  
  //---------------------------- Utility Methods ------------------------------
  
  //---------------------------- Property Methods -----------------------------     
}
