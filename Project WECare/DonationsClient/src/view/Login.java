/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import connector.ServerConnector;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.UserModel;
import other.Validation;

/**
 *
 * @author Extreme
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        Font font = signUpBtn.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        signUpBtn.setFont(font.deriveFont(attributes));
        animate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        img0 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nicTx = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pwTx = new javax.swing.JPasswordField();
        loginBt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/logoHeaderIcon.png"))); // NOI18N
        jLabel1.setText("WECare");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        img0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/img0.png"))); // NOI18N
        jPanel2.add(img0);
        img0.setBounds(0, 0, 350, 350);

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/img1.png"))); // NOI18N
        jPanel2.add(img1);
        img1.setBounds(0, -350, 350, 350);

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/img2.png"))); // NOI18N
        jPanel2.add(img2);
        img2.setBounds(350, 0, 350, 350);

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/img3.png"))); // NOI18N
        jPanel2.add(img3);
        img3.setBounds(0, 350, 350, 350);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login/SignUp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setText("NIC number : ");

        nicTx.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        nicTx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nicTxKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setText("Password : ");

        pwTx.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        pwTx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwTxKeyReleased(evt);
            }
        });

        loginBt.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        loginBt.setText("Login");
        loginBt.setEnabled(false);
        loginBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setText("or");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setText("New to Relief.lk ? ");

        signUpBtn.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(0, 0, 255));
        signUpBtn.setText("Sign-Up");
        signUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pwTx)
                    .addComponent(loginBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nicTx, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nicTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(13, 13, 13)
                .addComponent(pwTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(loginBt)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nicTxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicTxKeyReleased
        Validation.validateNIC(nicTx);
        enableLoginBtn();
    }//GEN-LAST:event_nicTxKeyReleased

    private void pwTxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwTxKeyReleased
        enableLoginBtn();
    }//GEN-LAST:event_pwTxKeyReleased

    private void signUpBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMouseEntered
        signUpBtn.setFont(signUpBtn.getFont().deriveFont(25));
    }//GEN-LAST:event_signUpBtnMouseEntered

    private void signUpBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMouseExited
        signUpBtn.setFont(signUpBtn.getFont().deriveFont(16));
    }//GEN-LAST:event_signUpBtnMouseExited

    private void signUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMouseClicked
        new UserAccount().setVisible(true);
    }//GEN-LAST:event_signUpBtnMouseClicked

    private void loginBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtActionPerformed
        String nic = nicTx.getText();
        if(nic.length() < 10){
            JOptionPane.showMessageDialog(this, "NIC number shoud contain 9 numbers and one character", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                UserModel user = ServerConnector.getServerConnector().getUserController().getUser(nic);
                if(user == null){
                    JOptionPane.showMessageDialog(this, "There is no member with given NIC number", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(!user.getPassword().equals(new String(pwTx.getPassword()))){
                    JOptionPane.showMessageDialog(this, "Wrong Password", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    new Home(user).setVisible(true);
                    dispose();
                }
            } catch (NotBoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_loginBtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
            //</editor-fold>
            
            UIManager.setLookAndFeel(new GraphiteLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img0;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginBt;
    private javax.swing.JTextField nicTx;
    private javax.swing.JPasswordField pwTx;
    private javax.swing.JLabel signUpBtn;
    // End of variables declaration//GEN-END:variables

    private void enableLoginBtn() {
        loginBt.setEnabled(nicTx.getText().length() > 0 && pwTx.getPassword().length>0);
    }

    private void animate() {
        new Thread(){
            @Override
            public void run(){
                while(true){
                    try {
                        Thread.sleep(1500);
                        for (int i = 0; i <= 350; i+=10) {
                            img0.setLocation(-i, 0);
                            img1.setLocation(0,-350 + i);
                            Thread.sleep(50);
                        }
                        
                        Thread.sleep(1500);
                        for (int i = 0; i <= 350; i+=10) {
                            img1.setLocation(0,-i);
                            img2.setLocation(350-i, 0);
                            Thread.sleep(50);
                        }
                        
                        Thread.sleep(1500);
                        for (int i = 0; i <= 350; i+=10) {
                            img2.setLocation(i, 0);
                            img3.setLocation(0,350-i);
                            Thread.sleep(50);
                        }
                        
                        Thread.sleep(1500);
                        for (int i = 0; i <= 350; i+=10) {
                            img3.setLocation(0,i);
                            img0.setLocation(-350+i, 0);
                            Thread.sleep(50);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }
}
