package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;

public class DescriptionForm extends javax.swing.JPanel {

    public DescriptionForm() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        lb.setText("");
        String paragraph = "<html>" +
                    "<p><b>Alan Albright</b> while working for IBM, recognized the problem in size measurement in the 1970s, " +
                    "and developed a technique (which he called <i>Function Point Analysis</i>), " +
                    "which appeared to be a solution to the size measurement problem.</p>" +
                    "The technique introduced by Albright focused on quantifying the functionality delivered by the software system." +
                    "By considering various types of functionality, such as inputs, outputs, inquiries, files, and interfaces, Function Point Analysis provided a more comprehensive and accurate measure of software size." +
                    "</html>";

        jLabel1.setText(paragraph);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 6, 106, 15));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 168, 471, 255));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 252, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/icon/png/albrightalanbracewell_750xx1200-1600-0-38.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel4.setText("Alan Albright");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel5.setText("Function Point History");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
