package com.foundstone.fsflow.app;

import com.google.common.collect.Lists;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 */
public class ObjectivesTableModel extends AbstractTableModel {
  
  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  private static final String[] COLUMN_NAMES = {"Objective", "Value"};
  
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
  private final List<String> objectives = Lists.newArrayList();
  
  private final List<String> values = Lists.newArrayList();
  
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public void setObjectives(List<String> objectives) {
    this.objectives.clear();
    this.values.clear();
    
    this.objectives.addAll(objectives);
    for (String obj : this.objectives) {
      values.add("");
    }
    
    fireTableDataChanged();
  }
  
  //------------------------ Implements:
  
  //------------------------ Overrides: AbstractTableModel
  
  public int getRowCount() {
    return objectives.size();
  }

  public int getColumnCount() {
    return COLUMN_NAMES.length;
  }

  @Override
  public String getColumnName(int columnIndex) {
    return COLUMN_NAMES[columnIndex];
  }
  
  public String getValueAt(int rowIndex, int columnIndex) {
    return (columnIndex == 0 ? objectives.get(rowIndex) : values.get(rowIndex));
  }  
  
  @Override
  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return columnIndex == 1;
  }

  @Override
  public void setValueAt(Object object, int rowIndex, int columnIndex) {
    values.remove(rowIndex);
    values.add(rowIndex, object.toString());
    fireTableCellUpdated(rowIndex, columnIndex);
  }
  
  
  //---------------------------- Abstract Methods -----------------------------
  
  //---------------------------- Utility Methods ------------------------------
  
  //---------------------------- Property Methods -----------------------------     
}
