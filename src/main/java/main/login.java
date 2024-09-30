package main;

import Modelos.Controladora;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Font;
import javax.swing.UIManager;

public class login extends javax.swing.JFrame {

    Controladora controladora;
    
    public login() {
        controladora = new Controladora();
        initComponents();
        usuarioField.setBackground(new java.awt.Color(0,0,0,1));
        passField.setBackground(new java.awt.Color(0,0,0,1));
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        ocultar = new javax.swing.JLabel();
        mostrar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        alertaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(79, 78, 78));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodrigo\\Downloads\\logon12-removebg-preview(1).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 370, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 29));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 420, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bienvenido al Sistema De Rojas Market (Desktop Version :D)");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 420, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(30, 30, 30));
        jLabel5.setText("Nombre de Usuario");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 123, 341, -1));

        usuarioField.setFont(usuarioField.getFont().deriveFont(usuarioField.getFont().getSize()+2f));
        usuarioField.setForeground(new java.awt.Color(255, 255, 255));
        usuarioField.setBorder(null);
        jPanel2.add(usuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 140, 310, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 330, 39));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 40, 39));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contraseña");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 192, 341, -1));

        passField.setFont(passField.getFont().deriveFont(passField.getFont().getSize()+2f));
        passField.setForeground(new java.awt.Color(255, 255, 255));
        passField.setBorder(null);
        passField.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 310, 30));

        ocultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_invisible_20px_1.png"))); // NOI18N
        ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        jPanel2.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 40, 40));

        mostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_eye_20px_1.png"))); // NOI18N
        mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarMouseClicked(evt);
            }
        });
        jPanel2.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 40, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setText("LOGIN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 341, 40));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("_________________________________________");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 147, 340, 39));

        alertaLabel.setForeground(new java.awt.Color(102, 0, 0));
        jPanel2.add(alertaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 420, 440));

        setSize(new java.awt.Dimension(916, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        passField.setEchoChar((char)0);
        ocultar.setVisible(false);
        ocultar.setEnabled(false);
        mostrar.setEnabled(true);
        mostrar.setEnabled(true);
    }//GEN-LAST:event_ocultarMouseClicked

    private void mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMouseClicked
        passField.setEchoChar((char)8226);
        ocultar.setVisible(true);
        ocultar.setEnabled(true);
        mostrar.setEnabled(false);
        mostrar.setEnabled(false);
    }//GEN-LAST:event_mostrarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String usuario = usuarioField.getText();
        String password = new String(passField.getPassword());
        
        if(controladora.autenticarUsuario(usuario, password)){
          this.dispose();
           Main main = new Main();
           main.setVisible(true);
        }{
            alertaLabel.setText("Error al autentificar sus credenciales, ingrese de nuevo!");
            usuarioField.setText("");
            passField.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
                FlatRobotoFont.install();
                FlatLaf.registerCustomDefaultsSource("payment.themes");
                FlatMacDarkLaf.setup();
                UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mostrar;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextField usuarioField;
    // End of variables declaration//GEN-END:variables
}
