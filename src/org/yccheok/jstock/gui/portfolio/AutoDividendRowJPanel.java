/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yccheok.jstock.gui.portfolio;

/**
 *
 * @author yccheok
 */
public class AutoDividendRowJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AutoDividendRowJPanel
     */
    public AutoDividendRowJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jCheckBox1 = new javax.swing.JCheckBox();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        add(filler1);

        jCheckBox1.setSelected(true);
        add(jCheckBox1);

        jFormattedTextField1.setText("11/09/03");
        jFormattedTextField1.setMinimumSize(new java.awt.Dimension(80, 20));
        jFormattedTextField1.setPreferredSize(new java.awt.Dimension(80, 20));
        add(jFormattedTextField1);

        jFormattedTextField2.setMinimumSize(new java.awt.Dimension(80, 20));
        jFormattedTextField2.setPreferredSize(new java.awt.Dimension(80, 20));
        add(jFormattedTextField2);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    // End of variables declaration//GEN-END:variables
}
