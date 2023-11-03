package com.view.main;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Hello
 */
public class MessageFrame extends javax.swing.JFrame {

    private String dir = null;
    /**
     * Creates new form MessageFrame
     */
    public MessageFrame() {
        String path = "src\\main\\java\\com\\view\\icon\\";
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        dir = absolutePath;
        initComponents();
        setLocationRelativeTo(null);
    }

    public void setMessage(String message) {
        lblThongBao.setText(message);
    }

    public void setButtonOK(ActionListener actionListener){
        btnOk.addActionListener(actionListener);
    }
    
    public void setButtonCancel(ActionListener actionListener){
        btnCancel.addActionListener(actionListener);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        lblThongBao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOk = new com.k33ptoo.components.KButton();
        btnCancel = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setBackground(new java.awt.Color(153, 204, 255));
        kGradientPanel1.setForeground(new java.awt.Color(153, 204, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        lblThongBao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblThongBao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ImageIcon imgIcon  = new javax.swing.ImageIcon(dir+"\\logout.png");
        Image image = imgIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        ImageIcon imageIcon = new ImageIcon(newimg);
        jLabel2.setIcon(imageIcon);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnOk.setBorder(null);
        btnOk.setText("OK");
        btnOk.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnOk.setkBorderRadius(20);
        btnOk.setkEndColor(new java.awt.Color(0, 51, 255));
        btnOk.setkForeGround(new java.awt.Color(0, 0, 0));
        btnOk.setkHoverEndColor(new java.awt.Color(0, 102, 204));
        btnOk.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnOk.setkHoverStartColor(new java.awt.Color(102, 153, 255));
        btnOk.setkSelectedColor(new java.awt.Color(255, 255, 255));
        btnOk.setkStartColor(new java.awt.Color(0, 102, 255));

        btnCancel.setBorder(null);
        btnCancel.setText("Cancel");
        btnCancel.setkBorderRadius(20);
        btnCancel.setkEndColor(new java.awt.Color(153, 153, 153));
        btnCancel.setkForeGround(new java.awt.Color(0, 0, 0));
        btnCancel.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnCancel.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnCancel.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btnCancel.setkStartColor(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MessageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new MessageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnCancel;
    private com.k33ptoo.components.KButton btnOk;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblThongBao;
    // End of variables declaration//GEN-END:variables
}