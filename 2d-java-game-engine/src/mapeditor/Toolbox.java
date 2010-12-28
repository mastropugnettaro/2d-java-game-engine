/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Toolbox.java
 *
 * Created on 15.12.2010, 15:59:10
 */

package mapeditor;

import javax.swing.ImageIcon;
import java.awt.*;
import java.io.*;
import engine.game.*;
import javax.imageio.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Philipp
 */
public class Toolbox extends javax.swing.JFrame {

    public static ObjectChooser tileChooser;
    public static ObjectChooser objectChooser;

    /** Creates new form Toolbox */
    public Toolbox() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToolboxTab = new javax.swing.JTabbedPane();
        TileTabPanel = new javax.swing.JPanel();
        TilesPanel = tileChooser = new ObjectChooser();
        ObjectsPanel = objectChooser = new ObjectChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ObjectCharTextField = new javax.swing.JTextField();
        CharLabel = new javax.swing.JLabel();
        CharLabel1 = new javax.swing.JLabel();
        ObjectNameTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        camPrefHeightSpinner = new javax.swing.JSpinner();
        camPrefHeightSpinner.addChangeListener(cameraSpinnerListener);
        jLabel6 = new javax.swing.JLabel();
        camToleranceSpinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        mapWidthSpinner = new javax.swing.JSpinner();
        mapWidthSpinner.addChangeListener(mapSizeSpinnerListener);
        mapHeightSpinner = new javax.swing.JSpinner();
        mapHeightSpinner.addChangeListener(mapSizeSpinnerListener);
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bg0TextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        browseButtonBG0 = new javax.swing.JButton();
        browseButtonBG1 = new javax.swing.JButton();
        bg1TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        browseButtonFG = new javax.swing.JButton();
        fgTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        browseButtonTileSheet = new javax.swing.JButton();
        tilesheetTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tools");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ToolboxTab.setName("ToolboxTab"); // NOI18N

        TileTabPanel.setName("TileTabPanel"); // NOI18N

        TilesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        TilesPanel.setName("TilesPanel"); // NOI18N
        TilesPanel.setPreferredSize(new java.awt.Dimension(128, 128));

        org.jdesktop.layout.GroupLayout TilesPanelLayout = new org.jdesktop.layout.GroupLayout(TilesPanel);
        TilesPanel.setLayout(TilesPanelLayout);
        TilesPanelLayout.setHorizontalGroup(
            TilesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 234, Short.MAX_VALUE)
        );
        TilesPanelLayout.setVerticalGroup(
            TilesPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 14, Short.MAX_VALUE)
        );

        ObjectsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        ObjectsPanel.setName("ObjectsPanel"); // NOI18N
        ObjectsPanel.setPreferredSize(new java.awt.Dimension(272, 73));

        org.jdesktop.layout.GroupLayout ObjectsPanelLayout = new org.jdesktop.layout.GroupLayout(ObjectsPanel);
        ObjectsPanel.setLayout(ObjectsPanelLayout);
        ObjectsPanelLayout.setHorizontalGroup(
            ObjectsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 234, Short.MAX_VALUE)
        );
        ObjectsPanelLayout.setVerticalGroup(
            ObjectsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 14, Short.MAX_VALUE)
        );

        jLabel8.setText("Tiles");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setText("Objects");
        jLabel9.setName("jLabel9"); // NOI18N

        ObjectCharTextField.setName("ObjectCharTextField"); // NOI18N
        ObjectCharTextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ObjectCharTextFieldInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        ObjectCharTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ObjectCharTextFieldKeyPressed(evt);
            }
        });

        CharLabel.setText("Char:");
        CharLabel.setName("CharLabel"); // NOI18N

        CharLabel1.setText("Name:");
        CharLabel1.setName("CharLabel1"); // NOI18N

        ObjectNameTextField.setName("ObjectNameTextField"); // NOI18N

        org.jdesktop.layout.GroupLayout TileTabPanelLayout = new org.jdesktop.layout.GroupLayout(TileTabPanel);
        TileTabPanel.setLayout(TileTabPanelLayout);
        TileTabPanelLayout.setHorizontalGroup(
            TileTabPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TileTabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(TilesPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
            .add(TileTabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(ObjectsPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
            .add(TileTabPanelLayout.createSequentialGroup()
                .add(9, 9, 9)
                .add(TileTabPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(TileTabPanelLayout.createSequentialGroup()
                        .add(jLabel9)
                        .addContainerGap())
                    .add(TileTabPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(TileTabPanelLayout.createSequentialGroup()
                            .add(jLabel8)
                            .addContainerGap())
                        .add(TileTabPanelLayout.createSequentialGroup()
                            .add(CharLabel1)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(ObjectNameTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(CharLabel)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(ObjectCharTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(11, 11, 11)))))
        );
        TileTabPanelLayout.setVerticalGroup(
            TileTabPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TileTabPanelLayout.createSequentialGroup()
                .add(jLabel8)
                .add(4, 4, 4)
                .add(TilesPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(ObjectsPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 123, Short.MAX_VALUE)
                .add(TileTabPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ObjectNameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(CharLabel1)
                    .add(ObjectCharTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(CharLabel))
                .addContainerGap())
        );

        ToolboxTab.addTab("Draw", TileTabPanel);

        jPanel1.setName("jPanel1"); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Camera"));
        jPanel3.setName("jPanel3"); // NOI18N

        camPrefHeightSpinner.setName("camPrefHeightSpinner"); // NOI18N

        jLabel6.setText("Preferred Height");
        jLabel6.setName("jLabel6"); // NOI18N

        camToleranceSpinner.setName("camToleranceSpinner"); // NOI18N
        camToleranceSpinner.addChangeListener(cameraSpinnerListener);

        jLabel7.setText("Tolerance");
        jLabel7.setName("jLabel7"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel6)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, camToleranceSpinner)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, camPrefHeightSpinner, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(camPrefHeightSpinner))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, camToleranceSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Map Size"));
        jPanel4.setToolTipText("");
        jPanel4.setName("jPanel4"); // NOI18N

        mapWidthSpinner.setName("mapWidthSpinner"); // NOI18N
        mapWidthSpinner.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mapWidthSpinnerPropertyChange(evt);
            }
        });

        mapHeightSpinner.setName("mapHeightSpinner"); // NOI18N
        mapHeightSpinner.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mapHeightSpinnerPropertyChange(evt);
            }
        });

        jLabel4.setText("X");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText("Y");
        jLabel5.setName("jLabel5"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mapWidthSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 14, Short.MAX_VALUE)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mapHeightSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, mapWidthSpinner, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .add(mapHeightSpinner, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ToolboxTab.addTab("Properties", jPanel1);

        jPanel2.setName("jPanel2"); // NOI18N

        bg0TextField.setName("bg0TextField"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel1.setText("Background Layer 0");
        jLabel1.setName("jLabel1"); // NOI18N

        browseButtonBG0.setText("...");
        browseButtonBG0.setName("browseButtonBG0"); // NOI18N
        browseButtonBG0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonBG0ActionPerformed(evt);
            }
        });

        browseButtonBG1.setText("...");
        browseButtonBG1.setName("browseButtonBG1"); // NOI18N
        browseButtonBG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonBG1ActionPerformed(evt);
            }
        });

        bg1TextField.setName("bg1TextField"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel2.setText("Background Layer 1");
        jLabel2.setName("jLabel2"); // NOI18N

        browseButtonFG.setText("...");
        browseButtonFG.setName("browseButtonFG"); // NOI18N

        fgTextField.setName("fgTextField"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel3.setText("Foreground Layer");
        jLabel3.setName("jLabel3"); // NOI18N

        browseButtonTileSheet.setText("...");
        browseButtonTileSheet.setName("browseButtonTileSheet"); // NOI18N
        browseButtonTileSheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonTileSheetActionPerformed(evt);
            }
        });

        tilesheetTextField.setName("tilesheetTextField"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel10.setText("Tilesheet");
        jLabel10.setName("jLabel10"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jLabel3)
                    .add(jLabel2)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(bg0TextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .add(bg1TextField)
                            .add(fgTextField))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(browseButtonFG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(browseButtonBG1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(browseButtonBG0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jLabel10)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(tilesheetTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(browseButtonTileSheet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bg0TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButtonBG0))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel2)
                .add(5, 5, 5)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bg1TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButtonBG1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fgTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButtonFG))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 8, Short.MAX_VALUE)
                .add(jLabel10)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tilesheetTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButtonTileSheet))
                .addContainerGap())
        );

        ToolboxTab.addTab("Images", jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(ToolboxTab, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(ToolboxTab, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MapEditor.toolsCheckBox.setState(false);
    }//GEN-LAST:event_formWindowClosing

    private void browseButtonBG0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonBG0ActionPerformed

        File selectedFile = gameMain.FileOpenDialog("... Browse for Background Image");
        
        try{
           gameMain.background_layer0 = ImageIO.read(selectedFile);
           bg0TextField.setText(selectedFile.getPath());
        }
        catch(Exception e){
        }
        
    }//GEN-LAST:event_browseButtonBG0ActionPerformed

    private void browseButtonBG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonBG1ActionPerformed
        
        File selectedFile = gameMain.FileOpenDialog("... Browse for Background Image");

        try{
           gameMain.background_layer1 = ImageIO.read(selectedFile);
           bg1TextField.setText(selectedFile.getPath());
        }
        catch(Exception e){
        }

    }//GEN-LAST:event_browseButtonBG1ActionPerformed

    private void mapWidthSpinnerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mapWidthSpinnerPropertyChange
        
    }//GEN-LAST:event_mapWidthSpinnerPropertyChange

    private void mapHeightSpinnerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mapHeightSpinnerPropertyChange
        
    }//GEN-LAST:event_mapHeightSpinnerPropertyChange

    private void browseButtonTileSheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonTileSheetActionPerformed
        File selectedFile = gameMain.FileOpenDialog("... Browse for Tilesheet");

        try{
           gameMain.background_layer1 = ImageIO.read(selectedFile);
           tilesheetTextField.setText(selectedFile.getPath());
        }
        catch(Exception e){
        }
        
    }//GEN-LAST:event_browseButtonTileSheetActionPerformed

    private void ObjectCharTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ObjectCharTextFieldKeyPressed
        if(!ObjectChooser.selectedObject.name.equals("WorldTile")){
            objectChooser.editorObject[ObjectChooser.getSelectedObjectNumber()].objectChar = ObjectCharTextField.getText().charAt(0);
            try{
                for(int i = 0; i < objectChooser.objectList.length; i++){
                    if(objectChooser.objectList[i].name.equals(ObjectChooser.selectedObject.name)){
                        objectChooser.objectList[i].objectChar = ObjectCharTextField.getText().charAt(0);
                    }
                }
                for(int i = 0; i < Map.object.length; i++){
                    if(Map.object[i].name.equals(ObjectChooser.selectedObject.name)){
                        Map.object[i].objectChar = ObjectCharTextField.getText().charAt(0);
                    }
                }
            }
            catch(Exception e){
            }
        }
    }//GEN-LAST:event_ObjectCharTextFieldKeyPressed

    private void ObjectCharTextFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ObjectCharTextFieldInputMethodTextChanged

    }//GEN-LAST:event_ObjectCharTextFieldInputMethodTextChanged

    ChangeListener mapSizeSpinnerListener = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
        
            if(Integer.parseInt(mapWidthSpinner.getValue().toString()) < 0){
                mapWidthSpinner.setValue(0);
            }
            if(Integer.parseInt(mapWidthSpinner.getValue().toString()) > 999){
                mapWidthSpinner.setValue(999);
            }
            if(Integer.parseInt(mapHeightSpinner.getValue().toString()) < 0){
                mapHeightSpinner.setValue(0);
            }
            if(Integer.parseInt(mapHeightSpinner.getValue().toString()) > 999){
                mapHeightSpinner.setValue(999);
            }

            MapEditor.map.setMapSize(Integer.parseInt(mapWidthSpinner.getValue().toString())*16,Integer.parseInt(mapHeightSpinner.getValue().toString())*16);
            MapEditor.mapEdit.setMaximumSize(new Dimension(Map.maxWidth + 7,Map.maxHeight + 50));
        }
    };

    ChangeListener cameraSpinnerListener = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {

            if(Integer.parseInt(camPrefHeightSpinner.getValue().toString()) < 0){
                camPrefHeightSpinner.setValue(0);
            }
            if(Integer.parseInt(camToleranceSpinner.getValue().toString()) < 0){
                camToleranceSpinner.setValue(0);
            }

            MapEditor.cameraPrefHeight = Integer.parseInt(camPrefHeightSpinner.getValue().toString());
            MapEditor.cameraTolerance = Integer.parseInt(camToleranceSpinner.getValue().toString());

        }
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CharLabel;
    private javax.swing.JLabel CharLabel1;
    public static javax.swing.JTextField ObjectCharTextField;
    public static javax.swing.JTextField ObjectNameTextField;
    public static javax.swing.JPanel ObjectsPanel;
    public static javax.swing.JPanel TileTabPanel;
    public static javax.swing.JPanel TilesPanel;
    public static javax.swing.JTabbedPane ToolboxTab;
    public static javax.swing.JTextField bg0TextField;
    public static javax.swing.JTextField bg1TextField;
    private javax.swing.JButton browseButtonBG0;
    private javax.swing.JButton browseButtonBG1;
    private javax.swing.JButton browseButtonFG;
    private javax.swing.JButton browseButtonTileSheet;
    public static javax.swing.JSpinner camPrefHeightSpinner;
    public static javax.swing.JSpinner camToleranceSpinner;
    public static javax.swing.JTextField fgTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JSpinner mapHeightSpinner;
    public static javax.swing.JSpinner mapWidthSpinner;
    public static javax.swing.JTextField tilesheetTextField;
    // End of variables declaration//GEN-END:variables

}
