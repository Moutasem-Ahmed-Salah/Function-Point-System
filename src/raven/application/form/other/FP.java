package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import raven.application.Application;


public class FP extends javax.swing.JPanel {
int UFP;
double TCF;
double FP;
    public FP() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        lb.setText("ASD");
    }
    public FP(int x,double y) {
        initComponents();
        UFP=x;
        TCF=y;
         String title="UFP";
         String title2="TCF";
         String tcf=String.valueOf(TCF);
       String ufp=String.valueOf(UFP);
               
           DefaultTableModel tablemodel1 = (DefaultTableModel) jTable1.getModel();
         tablemodel1.addRow(new String[]{title,ufp});
         tablemodel1.addRow(new String[]{title2,tcf});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Form");
        add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 6, 50, 0));

        jButton2.setText("Calculate FP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 210, 167, 48));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 397, 231, 65));

        jLabel16.setText("Current Values");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 79, 31));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel5.setText("Calculate Function Point");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/icon/png/1732743-200.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double DoublUFP=Double.valueOf(UFP);
        FP=DoublUFP*TCF;
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        String FormattedFP=decimalFormat.format(FP);
        
        FP = Double.parseDouble(FormattedFP);
        JOptionPane.showMessageDialog(null,"Value of FP:"+FP);
        Application.mainForm.showForm(new FormLOC(FP,TCF,UFP));
        
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
