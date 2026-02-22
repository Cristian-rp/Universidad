package Interfazes;



import SQLconection.dbConection;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;

public class Inicio extends javax.swing.JFrame {
     SQLconection.dbConection con = new dbConection();
     Connection cn = con.conectar();

    public Inicio() {
        initComponents();
        //La colocacion de la ventana es centrada y no es manejable
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        Login_Title = new javax.swing.JLabel();
        Login_SubTitle = new javax.swing.JLabel();
        Login_User = new javax.swing.JLabel();
        Login_Password = new javax.swing.JLabel();
        Txt_Login_password = new javax.swing.JPasswordField();
        Txt_Login_user = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        Exit_Login = new javax.swing.JLabel();
        unconfident_login = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Btn_Login1 = new javax.swing.JLabel();
        Btn_Login_Register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 0, -1, 355));

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 20, 30));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 20, 20));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 20, 20));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 20, 20));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 20, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo_Universidad_de_Cundinamarca Grande.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 355));

        jPanel8.setBackground(new java.awt.Color(0, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 51, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 315, 40, 40));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 295, 60, 60));

        Login_Title.setBackground(new java.awt.Color(255, 255, 255));
        Login_Title.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        Login_Title.setForeground(new java.awt.Color(255, 255, 255));
        Login_Title.setText("Enfermeria");
        jPanel1.add(Login_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 6, 258, -1));

        Login_SubTitle.setBackground(new java.awt.Color(255, 255, 255));
        Login_SubTitle.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        Login_SubTitle.setForeground(new java.awt.Color(255, 255, 255));
        Login_SubTitle.setText("Universidad de cundinamarca");
        jPanel1.add(Login_SubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 33, 200, 31));

        Login_User.setBackground(new java.awt.Color(255, 255, 255));
        Login_User.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        Login_User.setForeground(new java.awt.Color(255, 255, 255));
        Login_User.setText("Usuario:");
        jPanel1.add(Login_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 82, 200, 30));

        Login_Password.setBackground(new java.awt.Color(255, 255, 255));
        Login_Password.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        Login_Password.setForeground(new java.awt.Color(255, 255, 255));
        Login_Password.setText("Contraseña:");
        jPanel1.add(Login_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 154, 200, 30));

        Txt_Login_password.setBackground(new java.awt.Color(0, 0, 0));
        Txt_Login_password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Txt_Login_password.setForeground(new java.awt.Color(0, 51, 51));
        Txt_Login_password.setBorder(null);
        jPanel1.add(Txt_Login_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 190, 200, 30));

        Txt_Login_user.setBackground(new java.awt.Color(0, 0, 0));
        Txt_Login_user.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Txt_Login_user.setForeground(new java.awt.Color(0, 51, 51));
        Txt_Login_user.setBorder(null);
        Txt_Login_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Login_userActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_Login_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 200, 25));

        jPanel11.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 20, 30));

        jPanel12.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 10, 20));

        jPanel13.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 20, 20));

        jPanel14.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 335, 20, 20));

        jPanel15.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 20, 30));

        jPanel16.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 335, 40, 20));

        Exit_Login.setBackground(new java.awt.Color(0, 51, 51));
        Exit_Login.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        Exit_Login.setForeground(new java.awt.Color(0, 51, 51));
        Exit_Login.setText("X");
        Exit_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Exit_LoginMouseClicked(evt);
            }
        });
        jPanel1.add(Exit_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 20, -1));

        unconfident_login.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 36)); // NOI18N
        unconfident_login.setForeground(new java.awt.Color(0, 51, 51));
        unconfident_login.setText("-");
        unconfident_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unconfident_loginMouseClicked(evt);
            }
        });
        jPanel1.add(unconfident_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 20, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 145, 200, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 220, 200, 10));

        Btn_Login1.setBackground(new java.awt.Color(0, 51, 51));
        Btn_Login1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_Login1.setForeground(new java.awt.Color(0, 51, 51));
        Btn_Login1.setText("        Acceder");
        Btn_Login1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Btn_Login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Login1MouseClicked(evt);
            }
        });
        jPanel1.add(Btn_Login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 160, 40));

        Btn_Login_Register.setBackground(new java.awt.Color(0, 51, 51));
        Btn_Login_Register.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_Login_Register.setForeground(new java.awt.Color(0, 51, 51));
        Btn_Login_Register.setText("Registrarse.....");
        Btn_Login_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Login_RegisterMouseClicked(evt);
            }
        });
        jPanel1.add(Btn_Login_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_Login_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Login_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Login_userActionPerformed

    private void unconfident_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unconfident_loginMouseClicked
        // Minimiza la ventana principal cuando se hace clic en jLabel2
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_unconfident_loginMouseClicked

    private void Exit_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_LoginMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        // Muestra un cuadro de diálogo de confirmación antes de cerrar la aplicación
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del Login?", "EXIT",dialogButton);
        // Si el usuario selecciona "Sí", se cierra la aplicación
        if (result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_Exit_LoginMouseClicked

    private void Btn_Login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Login1MouseClicked
        
        /*ANTIGUO INICIO DE SESION*/

        // Definimos un usuario y contraseña preestablecidos
        /*String usuario = "jim alejandro";
        String contraseña = "jimqm";
        // Obtenemos la contraseña ingresada en el campo de texto
        String pass = new String(Txt_Login_password.getPassword());
        // Verificamos si el usuario y la contraseña ingresados son correctos
        if(Txt_Login_user.getText().equals(usuario)&& pass.equals(contraseña)){
            // Si las credenciales son correctas, abrimos la ventana "Principal"
            Principal prin = new Principal();
            prin.setVisible(true); 
            dispose();
        }
        else{
            // Si las credenciales son correctas, abrimos la ventana "Principal"
            JOptionPane.showMessageDialog(this, "Usuario / Contraseña incorrecta");
        }*/
        
        /*INICIO DE SESION CON BASES DE DATOS EN MySQL*/
        
        // Obtenemos el texto ingresado por el usuario y la contraseña desde los campos de texto
        String usuario=Txt_Login_user.getText();
        String pass=Txt_Login_password.getText();
        
        // Verificamos que los campos no estén vacíos
        if(!usuario.equals("")||!pass.equals("")){
            
            try{
                // Creamos una consulta SQL para verificar si existe un usuario con ese nombre y contraseña
                PreparedStatement ps = cn.prepareStatement("select * from usuarios where name='"+usuario+"' and password='"+pass+"';");
                // Ejecutamos la consulta y guardamos el resultado
                ResultSet rs=ps.executeQuery();
                // Si encontramos un resultado, significa que el usuario existe
                if(rs.next()){
                    // Obtenemos el rol del usuario (por ejemplo: Gestor, Cliente, etc.)
                    String rol=rs.getString("rol");
                    // Si el rol del usuario es "Gestor", lo enviamos a la ventana principal
                    if(rol.equalsIgnoreCase("Gestor")){
                        Principal prin = new Principal();
                         prin.setVisible(true); // Mostramos la ventana principal
                         dispose(); // Cerramos la ventana actual (login)
                    }
                }else{
                     // Si no se encontró ningún usuario con esos datos, mostramos mensaje de error
                    JOptionPane.showMessageDialog(null, "USUARIO/CONTRASEÑA INCORRECTOS");
                }
            }catch(Exception ex){
                // Aquí podrías imprimir el error si querés depurar
                ex.printStackTrace();
            }
            
            
        }else{
            // Si el usuario o la contraseña están vacíos, mostramos advertencia
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS DATOS");
            
        }     
    }//GEN-LAST:event_Btn_Login1MouseClicked

    
    
    private void Btn_Login_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Login_RegisterMouseClicked
        //Esto hace que el boton de registrar lo mande a la ventana de registro de usuario. 
        Registro ON = new Registro();
            ON.setVisible(true);
    }//GEN-LAST:event_Btn_Login_RegisterMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Btn_Login1;
    public javax.swing.JLabel Btn_Login_Register;
    public javax.swing.JLabel Exit_Login;
    private javax.swing.JLabel Login_Password;
    private javax.swing.JLabel Login_SubTitle;
    private javax.swing.JLabel Login_Title;
    private javax.swing.JLabel Login_User;
    private javax.swing.JPasswordField Txt_Login_password;
    private javax.swing.JTextField Txt_Login_user;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel unconfident_login;
    // End of variables declaration//GEN-END:variables
}
