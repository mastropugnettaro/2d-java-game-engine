/*
 * MainDebugMode.java
 *
 * Created on 12.12.2010, 03:45:47
 */

package game;

import java.io.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 *
 * @author Philipp
 */
public class MainDebugMode extends javax.swing.JFrame {


    public static javax.swing.JFrame changeRes;

    /** Creates new form MainDebugMode */
    public MainDebugMode() {
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

        gameRenderPanel = new gameMain();
        gameMain.width = gameRenderPanel.getWidth();
        gameMain.height = gameRenderPanel.getHeight();
        setLocationRelativeTo(null);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        OpenMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        resetMarioMenuItem = new javax.swing.JMenuItem();
        resetLevelMenuItem = new javax.swing.JMenuItem();
        spritePosCheckBox = new javax.swing.JCheckBoxMenuItem();
        spriteNumCheckBox = new javax.swing.JCheckBoxMenuItem();
        cameraCheckBox = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        changeResMenuItem = new javax.swing.JMenuItem();
        antiAliasingCheckBox = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2D Game Engine (Debug Mode)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        gameRenderPanel.setName("gameRenderPanel"); // NOI18N

        org.jdesktop.layout.GroupLayout gameRenderPanelLayout = new org.jdesktop.layout.GroupLayout(gameRenderPanel);
        gameRenderPanel.setLayout(gameRenderPanelLayout);
        gameRenderPanelLayout.setHorizontalGroup(
            gameRenderPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        gameRenderPanelLayout.setVerticalGroup(
            gameRenderPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 287, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setBorder(null);
        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setBackground(new java.awt.Color(153, 153, 153));
        jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu1.setText("File");
        jMenu1.setName("jMenu1"); // NOI18N

        OpenMenuItem.setText("Open ...");
        OpenMenuItem.setToolTipText("Open a .level file");
        OpenMenuItem.setName("OpenMenuItem"); // NOI18N
        OpenMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenMenuItemMouseClicked(evt);
            }
        });
        OpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(OpenMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(153, 153, 153));
        jMenu2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu2.setText("Engine");
        jMenu2.setName("jMenu2"); // NOI18N

        resetMarioMenuItem.setText("Reset Mario");
        resetMarioMenuItem.setName("resetMarioMenuItem"); // NOI18N
        resetMarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMarioMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(resetMarioMenuItem);

        resetLevelMenuItem.setText("Reset Level");
        resetLevelMenuItem.setName("resetLevelMenuItem"); // NOI18N
        resetLevelMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetLevelMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(resetLevelMenuItem);

        spritePosCheckBox.setText("Display sprite positions");
        spritePosCheckBox.setName("SpritePosMenuCheck"); // NOI18N
        spritePosCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spritePosCheckBoxActionPerformed(evt);
            }
        });
        spritePosCheckBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spritePosCheckBoxPropertyChange(evt);
            }
        });
        jMenu2.add(spritePosCheckBox);

        spriteNumCheckBox.setText("Display sprite numbers");
        spriteNumCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteNumCheckBoxActionPerformed(evt);
            }
        });
        jMenu2.add(spriteNumCheckBox);

        cameraCheckBox.setText("Display camera");
        cameraCheckBox.setName("cameraCheckBox"); // NOI18N
        cameraCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cameraCheckBoxActionPerformed(evt);
            }
        });
        jMenu2.add(cameraCheckBox);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(153, 153, 153));
        jMenu3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu3.setText("Graphics");
        jMenu3.setName("jMenu3"); // NOI18N

        changeResMenuItem.setText("Change Resolution");
        changeResMenuItem.setName("changeResMenuItem"); // NOI18N
        changeResMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeResMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(changeResMenuItem);

        antiAliasingCheckBox.setSelected(true);
        antiAliasingCheckBox.setText("Anti-Aliasing");
        antiAliasingCheckBox.setName("antiAliasingCheckBox"); // NOI18N
        antiAliasingCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antiAliasingCheckBoxActionPerformed(evt);
            }
        });
        jMenu3.add(antiAliasingCheckBox);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, gameRenderPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(gameRenderPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenMenuItemMouseClicked
    }//GEN-LAST:event_OpenMenuItemMouseClicked

    private void OpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuItemActionPerformed
        //gameMain.loadLevel();
    }//GEN-LAST:event_OpenMenuItemActionPerformed

    private void resetMarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetMarioMenuItemActionPerformed
        gameMain.mario.sprite.setPosition(new Point(gameMain.mario.spawn.x, gameMain.mario.spawn.y));
        System.out.println("resetting mario to spawn point: " + gameMain.mario.spawn.x + ", " + gameMain.mario.spawn.y);
        gameMain.camera.forceSetPosition(new Point(gameMain.mario.spawn.x, gameMain.mario.spawn.y));
    }//GEN-LAST:event_resetMarioMenuItemActionPerformed

    private void spritePosCheckBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spritePosCheckBoxPropertyChange
    }//GEN-LAST:event_spritePosCheckBoxPropertyChange

    private void spritePosCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spritePosCheckBoxActionPerformed
        gameMain.showSpritePos = spritePosCheckBox.getState();
    }//GEN-LAST:event_spritePosCheckBoxActionPerformed

    private void spriteNumCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteNumCheckBoxActionPerformed
        gameMain.showSpriteNum = spriteNumCheckBox.getState();
    }//GEN-LAST:event_spriteNumCheckBoxActionPerformed

    private void resetLevelMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetLevelMenuItemActionPerformed
        // -- load the already loaded level again:

        try{
            gameMain.loadLevel(new File(gameMain.loadedLevel.levelArchive));
        }
        catch(Exception e){
        }

        gameMain.camera.forceSetPosition(new Point(gameMain.mario.spawn.x, gameMain.mario.spawn.y));

    }//GEN-LAST:event_resetLevelMenuItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void cameraCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cameraCheckBoxActionPerformed
        gameMain.showCamera = cameraCheckBox.getState();
    }//GEN-LAST:event_cameraCheckBoxActionPerformed

    private void changeResMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeResMenuItemActionPerformed
        changeRes.setVisible(true);
    }//GEN-LAST:event_changeResMenuItemActionPerformed

    private void antiAliasingCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antiAliasingCheckBoxActionPerformed
        gameMain.antialiasing = antiAliasingCheckBox.getState();
    }//GEN-LAST:event_antiAliasingCheckBoxActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainDebugMode frame = new MainDebugMode();
                frame.setVisible(true);
                frame.addComponentListener(resizeListener);
            }
        });

        changeRes = new ChangeRes();
        changeRes.setVisible(false);

    }


    public static ComponentListener resizeListener = new ComponentAdapter(){

        @Override
        public void componentResized(ComponentEvent evt) {

            gameMain.width = gameRenderPanel.getWidth();
            gameMain.height = gameRenderPanel.getHeight();

        }

        @Override
        public void componentMoved(ComponentEvent e) {

            gameMain.width = gameRenderPanel.getWidth();
            gameMain.height = gameRenderPanel.getHeight();

        }
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem OpenMenuItem;
    private javax.swing.JCheckBoxMenuItem antiAliasingCheckBox;
    public static javax.swing.JCheckBoxMenuItem cameraCheckBox;
    private javax.swing.JMenuItem changeResMenuItem;
    public static javax.swing.JPanel gameRenderPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem resetLevelMenuItem;
    private javax.swing.JMenuItem resetMarioMenuItem;
    private javax.swing.JCheckBoxMenuItem spriteNumCheckBox;
    private javax.swing.JCheckBoxMenuItem spritePosCheckBox;
    // End of variables declaration//GEN-END:variables

}