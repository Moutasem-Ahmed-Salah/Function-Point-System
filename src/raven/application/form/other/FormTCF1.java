package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import raven.application.Application;

/**
 *
 * @author Raven
 */
public class FormTCF1 extends javax.swing.JPanel {
int UFP;
    String F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14;
    int f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14;
    double TCF;

    public FormTCF1() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }
     public FormTCF1(int x) {
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
        jLabel4 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Read");
        add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 6, 134, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Heavily Utilized Hardware");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });
        add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 118, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("High Trancsaction Rates");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 154, 21));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });
        add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 118, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Online Data Entry");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 111, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Online Updating");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 111, -1));

        jButton1.setText("Calculate TCF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 180, 36));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox15ActionPerformed(evt);
            }
        });
        add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 118, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("End User Efficency");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 159, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Complex Computations");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 164, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Reusability");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 164, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Ease of installation");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 147, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Ease Of Operation");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 164, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Portability");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 164, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Maintability");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 106, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 118, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 118, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 118, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 118, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 118, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 118, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 118, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 118, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Data Communication");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 181, 40));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });
        add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 118, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Distributed Data Processing");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 24));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });
        add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 118, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Performance Criteria");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 21));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Nofluence", "Incidental", "Moderate", "Average", "Significal", "Essential", " " }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 118, -1));

        jButton2.setText("Enter DI as Input");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, -1, 40));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 231, 46));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Current Values");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 100, 31));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/icon/png/1732743-200.png"))); // NOI18N
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/icon/png/4734469.png"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, -1));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel18.setText("TCF Using 14 Factors");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        F1 = jComboBox1.getSelectedItem().toString();
        F2 = jComboBox3.getSelectedItem().toString();
        F3 = jComboBox4.getSelectedItem().toString();
        F4 = jComboBox5.getSelectedItem().toString();
        F5 = jComboBox6.getSelectedItem().toString();
        F6 = jComboBox7.getSelectedItem().toString();
        F7 = jComboBox8.getSelectedItem().toString();
        F8 = jComboBox9.getSelectedItem().toString();
        F9 = jComboBox10.getSelectedItem().toString();
        F10 = jComboBox11.getSelectedItem().toString();
        F11 = jComboBox12.getSelectedItem().toString();
        F12 = jComboBox13.getSelectedItem().toString();
        F13 = jComboBox14.getSelectedItem().toString();
        F14 = jComboBox15.getSelectedItem().toString();

        if (F1 == "No Nofluence") {
            f1 = 0;
        } else if (F1 == "Incidental") {
            f1 = 1;
        } else if (F1 == "Moderate") {
            f1 = 2;
        } else if (F1 == "Average") {
            f1 = 3;
        } else if (F1 == "Significal") {
            f1 = 4;
        } else if (F1 == "Essential") {
            f1 = 5;
        }

        if (F2 == "No Nofluence") {
            f2 = 0;
        } else if (F2 == "Incidental") {
            f2 = 1;
        } else if (F2 == "Moderate") {
            f2 = 2;
        } else if (F2 == "Average") {
            f2 = 3;
        } else if (F2 == "Significal") {
            f2 = 4;
        } else if (F2 == "Essential") {
            f2 = 5;
        }

        if (F3 == "No Nofluence") {
            f3 = 0;
        } else if (F3 == "Incidental") {
            f3 = 1;
        } else if (F3 == "Moderate") {
            f3 = 2;
        } else if (F3 == "Average") {
            f3 = 3;
        } else if (F3 == "Significal") {
            f3 = 4;
        } else if (F3 == "Essential") {
            f3 = 5;
        }

        if (F4 == "No Nofluence") {
            f4 = 0;
        } else if (F4 == "Incidental") {
            f4 = 1;
        } else if (F4 == "Moderate") {
            f4 = 2;
        } else if (F4 == "Average") {
            f4 = 3;
        } else if (F4 == "Significal") {
            f4 = 4;
        } else if (F4 == "Essential") {
            f4 = 5;
        }
        if (F5.equals("No Nofluence")) {
            f5 = 0;
        } else if (F5.equals("Incidental")) {
            f5 = 1;
        } else if (F5.equals("Moderate")) {
            f5 = 2;
        } else if (F5.equals("Average")) {
            f5 = 3;
        } else if (F5.equals("Significal")) {
            f5 = 4;
        } else if (F5.equals("Essential")) {
            f5 = 5;
        }

        if (F6.equals("No Nofluence")) {
            f6 = 0;
        } else if (F6.equals("Incidental")) {
            f6 = 1;
        } else if (F6.equals("Moderate")) {
            f6 = 2;
        } else if (F6.equals("Average")) {
            f6 = 3;
        } else if (F6.equals("Significal")) {
            f6 = 4;
        } else if (F6.equals("Essential")) {
            f6 = 5;
        }

        if (F7.equals("No Nofluence")) {
            f7 = 0;
        } else if (F7.equals("Incidental")) {
            f7 = 1;
        } else if (F7.equals("Moderate")) {
            f7 = 2;
        } else if (F7.equals("Average")) {
            f7 = 3;
        } else if (F7.equals("Significal")) {
            f7 = 4;
        } else if (F7.equals("Essential")) {
            f7 = 5;
        }
        if (F8.equals("No Nofluence")) {
            f8= 0;
        } else if (F8.equals("Incidental")) {
            f8 = 1;
        } else if (F8.equals("Moderate")) {
            f8 = 2;
        } else if (F8.equals("Average")) {
            f8 = 3;
        } else if (F8.equals("Significal")) {
            f8 = 4;
        } else if (F8.equals("Essential")) {
            f8 = 5;
        }
        if (F9.equals("No Nofluence")) {
            f9 = 0;
        } else if (F9.equals("Incidental")) {
            f9 = 1;
        } else if (F9.equals("Moderate")) {
            f9 = 2;
        } else if (F9.equals("Average")) {
            f9 = 3;
        } else if (F9.equals("Significal")) {
            f9 = 4;
        } else if (F9.equals("Essential")) {
            f9 = 5;
        }

        if (F10.equals("No Nofluence")) {
            f10 = 0;
        } else if (F10.equals("Incidental")) {
            f10 = 1;
        } else if (F10.equals("Moderate")) {
            f10 = 2;
        } else if (F10.equals("Average")) {
            f10 = 3;
        } else if (F10.equals("Significal")) {
            f10 = 4;
        } else if (F10.equals("Essential")) {
            f10 = 5;
        }

        if (F11.equals("No Nofluence")) {
            f11 = 0;
        } else if (F11.equals("Incidental")) {
            f11 = 1;
        } else if (F11.equals("Moderate")) {
            f11 = 2;
        } else if (F11.equals("Average")) {
            f11 = 3;
        } else if (F11.equals("Significal")) {
            f11 = 4;
        } else if (F11.equals("Essential")) {
            f11 = 5;
        }

        if (F12.equals("No Nofluence")) {
            f12 = 0;
        } else if (F12.equals("Incidental")) {
            f12 = 1;
        } else if (F12.equals("Moderate")) {
            f12 = 2;
        } else if (F12.equals("Average")) {
            f12 = 3;
        } else if (F12.equals("Significal")) {
            f12 = 4;
        } else if (F12.equals("Essential")) {
            f12 = 5;
        }

        if (F13.equals("No Nofluence")) {
            f13 = 0;
        } else if (F13.equals("Incidental")) {
            f13 = 1;
        } else if (F13.equals("Moderate")) {
            f13 = 2;
        } else if (F13.equals("Average")) {
            f13 = 3;
        } else if (F13.equals("Significal")) {
            f13 = 4;
        } else if (F13.equals("Essential")) {
            f13 = 5;
        }

        if (F14.equals("No Nofluence")) {
            f14 = 0;
        } else if (F14.equals("Incidental")) {
            f14 = 1;
        } else if (F14.equals("Moderate")) {
            f14 = 2;
        } else if (F14.equals("Average")) {
            f14 = 3;
        } else if (F14.equals("Significal")) {
            f14 = 4;
        } else if (F14.equals("Essential")) {
            f14 = 5;
        }

        int di = f1 + f2 + f3 + f4 + f5 + f6 + f7 + f8 + f9 + f10 + f11 + f12 + f13 + f14;
        JOptionPane.showMessageDialog(null, "Value of DI:" + di);
        double DI = Double.valueOf(di);
        TCF = 0.65 + 0.01 * (DI);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        String formattedTCF = decimalFormat.format(TCF);
        TCF = Double.parseDouble(formattedTCF);

        JOptionPane.showMessageDialog(null, "Value of TCF:" + TCF);
        
        
       Application.mainForm.showForm(new FP(UFP,TCF));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Application.mainForm.showForm(new FormTCF2(UFP));
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
