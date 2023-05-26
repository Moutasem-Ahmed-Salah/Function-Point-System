package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import raven.application.Application;

public class FormTCF2 extends javax.swing.JPanel {
int UFP;
double DI;
double TCF;
    public FormTCF2() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        lb.setText("");
    }
      public FormTCF2(int x) {
        initComponents();
        UFP=x;
         String title="UFP";
         String ufp=String.valueOf(UFP);
               
         DefaultTableModel tablemodel1 = (DefaultTableModel) jTable1.getModel();
         tablemodel1.addRow(new String[]{title,ufp});
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Form");
        add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 6, -1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Enter DI Value:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 140, 25));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 175, 110, 30));

        jButton1.setText("Calculate TCF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 200, 45));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Variable", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 395, 231, 46));

        jLabel16.setText("Current Values");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 358, 79, 31));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/icon/png/1732743-200.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setText("TCF Using DI");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DI=Double.parseDouble(jTextField1.getText());

        TCF=0.65+0.01*(DI);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        String FormattedTCF=decimalFormat.format(TCF);
        TCF = Double.parseDouble(FormattedTCF);
        JOptionPane.showMessageDialog(null,"Value of TCF:"+TCF);
         Application.mainForm.showForm(new FP(UFP,TCF));
        
   

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
