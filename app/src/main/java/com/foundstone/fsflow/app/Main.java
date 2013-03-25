package com.foundstone.fsflow.app;

import com.foundstone.fsflow.lib.CallFlow;
import com.foundstone.fsflow.lib.CallMachine;
import com.foundstone.fsflow.lib.CallSerializer;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import javax.annotation.concurrent.NotThreadSafe;
import javax.swing.JFileChooser;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.html.HTMLDocument;

/**
 */
@NotThreadSafe
public class Main extends javax.swing.JFrame {
       
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    negativeResponseButton = new javax.swing.JButton();
    positiveResponseButton = new javax.swing.JButton();
    recoveryModeButton = new javax.swing.JButton();
    bustedButton = new javax.swing.JButton();
    callBlockTitle = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    textPane = new javax.swing.JEditorPane();
    jToolBar1 = new javax.swing.JToolBar();
    openButton = new javax.swing.JButton();
    reloadButton = new javax.swing.JButton();
    logButton = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    flowNameLabel = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    variablesTable = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    clearButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(60, 60, 60));

    jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("FSFlow - Social Engineering Call Flow");

    org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel1Layout.createSequentialGroup()
        .add(14, 14, 14)
        .add(jLabel1)
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel1Layout.createSequentialGroup()
        .add(20, 20, 20)
        .add(jLabel1)
        .addContainerGap(24, Short.MAX_VALUE))
    );

    negativeResponseButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
    negativeResponseButton.setForeground(new java.awt.Color(204, 0, 51));
    negativeResponseButton.setText("Negative Response");
    negativeResponseButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        negativeResponseButtonActionPerformed(evt);
      }
    });

    positiveResponseButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
    positiveResponseButton.setForeground(new java.awt.Color(0, 153, 0));
    positiveResponseButton.setText("Positive Response");
    positiveResponseButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        positiveResponseButtonActionPerformed(evt);
      }
    });

    recoveryModeButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
    recoveryModeButton.setForeground(new java.awt.Color(204, 0, 51));
    recoveryModeButton.setText("Recovery Mode");
    recoveryModeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        recoveryModeButtonActionPerformed(evt);
      }
    });

    bustedButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
    bustedButton.setForeground(new java.awt.Color(51, 51, 51));
    bustedButton.setText("Busted!");
    bustedButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bustedButtonActionPerformed(evt);
      }
    });

    callBlockTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
    callBlockTitle.setText("jLabel2");

    textPane.setEditable(false);
    textPane.setMargin(new java.awt.Insets(20, 20, 20, 20));
    jScrollPane2.setViewportView(textPane);

    jToolBar1.setRollover(true);

    openButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open.png"))); // NOI18N
    openButton.setText("Open");
    openButton.setFocusable(false);
    openButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    openButton.setMargin(new java.awt.Insets(5, 5, 5, 5));
    openButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    openButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        openButtonActionPerformed(evt);
      }
    });
    jToolBar1.add(openButton);

    reloadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reload.png"))); // NOI18N
    reloadButton.setText("Reload");
    reloadButton.setFocusable(false);
    reloadButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    reloadButton.setMargin(new java.awt.Insets(5, 5, 5, 5));
    reloadButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    reloadButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        reloadButtonActionPerformed(evt);
      }
    });
    jToolBar1.add(reloadButton);

    logButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/log.png"))); // NOI18N
    logButton.setText("Call Log");
    logButton.setFocusable(false);
    logButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    logButton.setMargin(new java.awt.Insets(5, 5, 5, 5));
    logButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    logButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        logButtonActionPerformed(evt);
      }
    });
    jToolBar1.add(logButton);

    jPanel2.setBackground(new java.awt.Color(60, 60, 60));

    flowNameLabel.setForeground(new java.awt.Color(255, 255, 255));
    flowNameLabel.setText("jLabel2");

    org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .add(flowNameLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .add(flowNameLabel)
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    variablesTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    variablesTable.setRowHeight(24);
    jScrollPane1.setViewportView(variablesTable);

    jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
    jLabel2.setText("Call Variables");

    clearButton.setText("Clear");
    clearButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        clearButtonActionPerformed(evt);
      }
    });

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
          .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .add(layout.createSequentialGroup()
            .add(0, 0, Short.MAX_VALUE)
            .add(clearButton))
          .add(layout.createSequentialGroup()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(callBlockTitle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                .add(org.jdesktop.layout.GroupLayout.LEADING, recoveryModeButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(org.jdesktop.layout.GroupLayout.LEADING, bustedButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                  .add(negativeResponseButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 348, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                  .add(positiveResponseButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 332, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(jLabel2)
              .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 324, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap())
    );

    layout.linkSize(new java.awt.Component[] {negativeResponseButton, positiveResponseButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
          .add(callBlockTitle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
          .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
          .add(layout.createSequentialGroup()
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
              .add(negativeResponseButton)
              .add(positiveResponseButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(bustedButton)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(recoveryModeButton))
          .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(clearButton)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 12, Short.MAX_VALUE)
        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void positiveResponseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positiveResponseButtonActionPerformed
    machine.positiveResponse();
    setCurrentState(machine);
  }//GEN-LAST:event_positiveResponseButtonActionPerformed

  private void negativeResponseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeResponseButtonActionPerformed
    machine.negativeResponse();
    setCurrentState(machine);
  }//GEN-LAST:event_negativeResponseButtonActionPerformed

  private void recoveryModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoveryModeButtonActionPerformed
    machine.recoveryResponse();
    setCurrentState(machine);
  }//GEN-LAST:event_recoveryModeButtonActionPerformed

  private void bustedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bustedButtonActionPerformed
    machine.busted();
    setCurrentState(machine);
  }//GEN-LAST:event_bustedButtonActionPerformed

  private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
    final JFileChooser fc = new JFileChooser();
    fc.setFileFilter(new FileFilter(){

      @Override
      public boolean accept(File f) {
        return f.getName().toUpperCase().endsWith(".XML") || f.isDirectory();
      }

      @Override
      public String getDescription() {
        return "FSFLow XML Configurations";
      }
    });
    if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
      File f  = fc.getSelectedFile();
      try {
        CallFlow flow = CallFlow.class.cast(X.fromXML(f));
        initCall(flow);
      } catch (Throwable t) {
        flowNameLabel.setText("Couldn't open " + f.getName() + " : " + t.getMessage());
      }
    }
  }//GEN-LAST:event_openButtonActionPerformed

  private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
    if (machine != null) {
      initCall(machine.getCallFlow());    
    }
  }//GEN-LAST:event_reloadButtonActionPerformed

  private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
    logDialog.setVisible(!logDialog.isVisible());
  }//GEN-LAST:event_logButtonActionPerformed

  private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    tableModel.clearVariables();
  }//GEN-LAST:event_clearButtonActionPerformed

  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
 
  private static final XStream X = CallSerializer.createStream();
 
  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  public static void main(String args[]) throws IOException {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        Main main = new Main();                
        //CallFlow flow = CallFlow.class.cast(X.fromXML(Main.class.getResourceAsStream("/testFlow.xml")));
        main.initCall(null);
        main.setVisible(true);
      }
    });
  }
  
  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  

  private final HTMLDocument textDoc = new HTMLDocument();
  
  private CallMachine machine = null;
  
  private final CallLogDialog logDialog = new CallLogDialog(this, false);
  
  private final VariableTableModel tableModel = new VariableTableModel();
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton bustedButton;
  private javax.swing.JLabel callBlockTitle;
  private javax.swing.JButton clearButton;
  private javax.swing.JLabel flowNameLabel;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JToolBar jToolBar1;
  private javax.swing.JButton logButton;
  private javax.swing.JButton negativeResponseButton;
  private javax.swing.JButton openButton;
  private javax.swing.JButton positiveResponseButton;
  private javax.swing.JButton recoveryModeButton;
  private javax.swing.JButton reloadButton;
  private javax.swing.JEditorPane textPane;
  private javax.swing.JTable variablesTable;
  // End of variables declaration//GEN-END:variables
     
  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  

  public Main() {
    initComponents();    
    textPane.setDocument(textDoc);
    textPane.setContentType("text/html");
    setTitle("FSFlow");
    variablesTable.setModel(tableModel);
    tableModel.addTableModelListener(new TableModelListener(){

      public void tableChanged(TableModelEvent e) {
        setCurrentState(machine);
      }
    });
    
  }
  
  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
  /**
   * Set the UI to the state existing in the provided state machine.
   * @param machine The state machine to set the UI to.
   */
  public void setCurrentState(CallMachine machine) {    
    updateState();    
    if (machine != null) {
      logDialog.log("Moved to state " + machine.getCurrentCallBlock().getName());
    }
  }
  
  public void initCall(CallFlow callFlow) {
    if (callFlow == null) {
      machine = null;
      logDialog.clearLog();
      logDialog.log("No flow specified");
      setCurrentState(null);
      setTitle("FSFlow");
    } else {
      machine = new CallMachine(callFlow);
      logDialog.clearLog();
      logDialog.log("Loading new flow: " + callFlow.getName());
      setCurrentState(machine);
      flowNameLabel.setText("Using flow named: " + callFlow.getName());
      setTitle("FSFlow - " + callFlow.getName());
      tableModel.addVariables(callFlow.getVariables());
    }
  }
  
  //------------------------ Implements:
  
  //------------------------ Overrides:
  
  //---------------------------- Abstract Methods -----------------------------
  
  //---------------------------- Utility Methods ------------------------------
  
  private void updateState() {

    updateText();
    
    if (machine == null) {
      negativeResponseButton.setEnabled(false);  
      positiveResponseButton.setEnabled(false);
      recoveryModeButton.setEnabled(false);
      bustedButton.setEnabled(false);
    } else {
    
      boolean busted = machine.isBusted();
      negativeResponseButton.setEnabled(!busted && machine.getNegativeResponse() != null);
      positiveResponseButton.setEnabled(!busted && machine.getPositiveResponse() != null);
      recoveryModeButton.setEnabled(!busted && machine.getRecoveryResponse() != null);
      bustedButton.setEnabled(!busted);    
    }
  }
  
  private void updateText() {
    
    if (machine == null) {
      callBlockTitle.setText("");
      return;
    } else if(machine.isBusted()) {
      callBlockTitle.setText("Busted!");            
    } else {
      callBlockTitle.setText(machine.getCurrentCallBlock().getName());
    }
    
    
    // Text
    if (machine.isBusted() && machine.getBustedCallBlock() != null && machine.getBustedCallBlock().getStatement() != null) {
      setText(machine.getBustedCallBlock().getStatement().getValue());
    } else if (machine.getCurrentCallBlock() != null && machine.getCurrentCallBlock().getStatement() != null) {
      setText(machine.getCurrentCallBlock().getStatement().getValue());    
    } else {
      setText("[No statement provided]");      
    }
    
  }
  
  private void setText(String text) {
    
    // Replace varialbes in text with their substituted value
    for (Entry<String,String> entry : tableModel.getVariableMap().entrySet()) {
      text = text.replaceAll("\\[" + entry.getKey() + "\\]", entry.getValue());
    }
    
    textPane.setText("<html><center>" + text + "</center></html>");
  }
  
  //---------------------------- Property Methods -----------------------------
}
