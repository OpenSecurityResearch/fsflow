package com.foundstone.fsflow.app;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.LinkedHashMap;
import javax.annotation.concurrent.NotThreadSafe;
import javax.swing.table.AbstractTableModel;

/**
 *
 */
@NotThreadSafe
public class VariableTableModel extends AbstractTableModel {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  private static String[] COLUMN_NAMES = {"Variable", "Value"};
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  private final LinkedHashMap<String,String> data = Maps.newLinkedHashMap();
  
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public void addVariables(Collection<String> variables) {
  
    for (String var : variables) {
      if (!data.containsKey(var)) {
        data.put(var, "[" + var + "]");
      }
    }
  }
  
  public void clearVariables() {
    data.clear();
    fireTableDataChanged();
  }
  
  //------------------------ Implements:
  
  //------------------------ Overrides: AbstracTableModel
  
  @Override
  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return columnIndex == 1;
  }
  
  @Override
  public String getColumnName(int columnIndex) {
    return COLUMN_NAMES[columnIndex];
  }
  
  public int getRowCount() {
    return data.size();
  }

  public int getColumnCount() {
    return COLUMN_NAMES.length;
  }

  public Object getValueAt(int rowIndex, int columnIndex) {
    String[] keys = data.keySet().toArray(new String[0]);
    
    String key = keys[rowIndex];
    if (columnIndex == 0) {
      return key;
    } else {
      return data.get(key);
    }
  }  
  
  @Override
  public void setValueAt(Object value, int rowIndex, int columnIndex) {
    String[] keys = data.keySet().toArray(new String[0]);
    String key = keys[rowIndex];
    data.put(key, value.toString());
    
    super.fireTableCellUpdated(rowIndex, columnIndex);
  }
  
  //---------------------------- Abstract Methods -----------------------------
  
  //---------------------------- Utility Methods ------------------------------
  
  //---------------------------- Property Methods -----------------------------   
  
  public ImmutableMap<String,String> getVariableMap() {
    return ImmutableMap.copyOf(data);
  }
}
