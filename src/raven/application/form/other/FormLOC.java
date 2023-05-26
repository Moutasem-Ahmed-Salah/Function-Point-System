package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FormLOC extends javax.swing.JPanel {
double FP;
double AVC;
double LOC;
double TCF;
int UFP;
    public FormLOC() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        lb.setText("");
    }
    public FormLOC(double x,double a,int b) {
        initComponents();
        FP=x;
        TCF=a;
        UFP=b;
        String title="UFP";
         String title2="TCF";
         String title3="FP";
         String tcf=String.valueOf(TCF);
       String ufp=String.valueOf(UFP);
       String fp=String.valueOf(FP);
               
         DefaultTableModel tablemodel1 = (DefaultTableModel) jTable2.getModel();
         tablemodel1.addRow(new String[]{title,ufp});
         tablemodel1.addRow(new String[]{title2,tcf});
         tablemodel1.addRow(new String[]{title3,fp});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Form");
        add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 6, 7, 0));

        jButton1.setText("Calculate LOC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 187, 53));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Assembly",  new Integer(320)},
                {"C",  new Integer(128)},
                {"COBOL/Fortran",  new Integer(105)},
                {"Pascal",  new Integer(90)},
                {"Ada",  new Integer(70)},
                {"C++",  new Integer(64)},
                {"Visual Basic",  new Integer(32)},
                {"OOP Languages",  new Integer(30)},
                {"SmallTalk",  new Integer(22)},
                {"Code Generators(Power Bulder)",  new Integer(15)},
                {"SQL/Oracle",  new Integer(12)},
                {"Spreadsheets",  new Integer(6)},
                {"Graphical Languages (icon )",  new Integer(4)}
            },
            new String [] {
                " ProgrammingLanguage", "AVC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 846, 306));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 231, 74));

        jLabel16.setText("Current Values");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 79, 31));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setText("Calculate LOC");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/icon/png/1732743-200.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/icon/png/4396623.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tablemodel1 = (DefaultTableModel) jTable1.getModel();

        int row=jTable1.getSelectedRow();
        AVC=Double.parseDouble(jTable1.getValueAt(row, 1).toString());
        LOC=AVC*FP;

        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        String aLOC = decimalFormat.format(LOC);
        LOC = Double.parseDouble(aLOC);
        
        JOptionPane.showMessageDialog(null,"The Final Value:"+LOC);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
