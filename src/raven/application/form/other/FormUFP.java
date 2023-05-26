package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import raven.application.Application;
import javax.swing.JOptionPane;

/**
 *
 * @author Raven
 */
public class FormUFP extends javax.swing.JPanel {
    int externalInterfaceFiles_simple = 0;
    int externalInterfaceFiles_average = 0;
    int externalInterfaceFiles_complex = 0;

    int internalLogicalFiles_simple = 0;
    int internalLogicalFiles_average = 0;
    int internalLogicalFiles_complex = 0;

    int externalInput_simple = 0;
    int externalInput_average = 0;
    int externalInput_complex = 0;

    int externalOutput_simple = 0;
    int externalOutput_average = 0;
    int externalOutput_complex = 0;

    int externalInquiry_simple = 0;
    int externalInquiry_average = 0;
    int externalInquiry_complex = 0;
        int UFP;
    public FormUFP() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 395, 107, -1));
        add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 228, 68, 35));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 284, 68, 35));
        add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 284, 68, 35));
        add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 338, 68, 35));
        add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 338, 68, 35));

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 338, 68, 35));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Simple");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 95, 68, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Complex");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 98, 68, 13));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Average");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 97, 68, 13));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 175, 68, 35));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 284, 68, 35));

        jLabel2.setText("External Interface Files");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 132, 122, -1));

        jLabel3.setText("Internal Logical Files");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 184, -1, -1));

        jLabel4.setText("External Input");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 98, -1));

        jLabel5.setText("External Output");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 296, 98, 20));

        jLabel6.setText("External Inquiry");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 348, 98, -1));

        jButton1.setText("Calculate UFP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 107, 35));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 175, 68, 35));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 175, 68, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Unadjusted Function Points (UFP)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 32, 325, 36));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 124, 68, 33));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 123, 68, 34));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 123, 68, 34));
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 228, 68, 35));
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 228, 68, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (!jTextField1.getText().isEmpty()) {
            externalInterfaceFiles_simple = 5 * Integer.parseInt(jTextField1.getText());
        }
        if (!jTextField2.getText().isEmpty()) {
            externalInterfaceFiles_average = 7 * Integer.parseInt(jTextField2.getText());
        }
        if (!jTextField3.getText().isEmpty()) {
            externalInterfaceFiles_complex = 10 * Integer.parseInt(jTextField3.getText());
        }

        if (!jTextField4.getText().isEmpty()) {
            internalLogicalFiles_simple = 7 * Integer.parseInt(jTextField4.getText());
        }
        if (!jTextField6.getText().isEmpty()) {
            internalLogicalFiles_average = 10 * Integer.parseInt(jTextField6.getText());
        }
        if (!jTextField7.getText().isEmpty()) {
            internalLogicalFiles_complex = 15 * Integer.parseInt(jTextField7.getText());
        }

        if (!jTextField8.getText().isEmpty()) {
            externalInput_simple = 3 * Integer.parseInt(jTextField8.getText());
        }
        if (!jTextField9.getText().isEmpty()) {
            externalInput_average = 4 * Integer.parseInt(jTextField9.getText());
        }
        if (!jTextField10.getText().isEmpty()) {
            externalInput_complex = 6 * Integer.parseInt(jTextField10.getText());
        }

        if (!jTextField11.getText().isEmpty()) {
            externalOutput_simple = 4 * Integer.parseInt(jTextField11.getText());
        }
        if (!jTextField12.getText().isEmpty()) {
            externalOutput_average = 5 * Integer.parseInt(jTextField12.getText());
        }
        if (!jTextField5.getText().isEmpty()) {
            externalOutput_complex = 7 * Integer.parseInt(jTextField5.getText());
        }

        if (!jTextField13.getText().isEmpty()) {
            externalInquiry_simple = 3 * Integer.parseInt(jTextField13.getText());
        }
        if (!jTextField15.getText().isEmpty()) {
            externalInquiry_average = 4 * Integer.parseInt(jTextField15.getText());
        }
        if (!jTextField14.getText().isEmpty()) {
            externalInquiry_complex = 6 * Integer.parseInt(jTextField14.getText());
        }

        int UFP = externalInterfaceFiles_simple + externalInterfaceFiles_average + externalInterfaceFiles_complex
        + internalLogicalFiles_simple + internalLogicalFiles_average + internalLogicalFiles_complex
        + externalInput_simple + externalInput_average + externalInput_complex
        + externalOutput_simple + externalOutput_average + externalOutput_complex
        + externalInquiry_simple + externalInquiry_average + externalInquiry_complex;

        JOptionPane.showMessageDialog(null, "Value of UFP: " + UFP);
                   Application.mainForm.showForm(new FormTCF1(UFP)); 

      
        

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
