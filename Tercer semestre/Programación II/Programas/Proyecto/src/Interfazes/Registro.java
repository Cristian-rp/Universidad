/* antes de hacer todo debemos importar el .jar de sql para poder hacer la conectar con MySQL*/
package Interfazes;
//importaamos el paquete de la conexion con MySQL
import SQLconection.dbConection;
import java.sql.Connection;
import javax.swing.JOptionPane;
//importamos los paquetes de sql para poder usarlos  
import java.sql.*;

public class Registro extends javax.swing.JFrame {
    // Se crea una instancia de la clase dbConection, encargada de gestionar la conexión a la base de datos.
     SQLconection.dbConection con = new dbConection();
     // Se obtiene un objeto Connection llamando al método conectar() de la clase dbConection
     Connection cn = con.conectar();
     
     
    public Registro() {
        initComponents();
         this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        Register_email = new javax.swing.JLabel();
        Register_Tittle1 = new javax.swing.JLabel();
        Register_nombre1 = new javax.swing.JLabel();
        Register_ID1 = new javax.swing.JLabel();
        Register_contraseña2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Btn_Register_Cancel = new javax.swing.JLabel();
        Btn_Register_Confirm = new javax.swing.JLabel();
        Register_ClosedWindow = new javax.swing.JLabel();
        Txt_Register_user = new javax.swing.JTextField();
        Txt_Register_Id = new javax.swing.JTextField();
        Txt_Register_Email = new javax.swing.JTextField();
        Txt_Register_Password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 30, 50));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 20));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));

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

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 20, 20));

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 20, 30));

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 50, 60));

        jPanel8.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 30, 30));

        jPanel9.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 30, 30));

        jPanel10.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 20, 20));

        jPanel11.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 20, 40));

        jPanel12.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 20, 10));

        Register_email.setBackground(new java.awt.Color(255, 255, 255));
        Register_email.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        Register_email.setForeground(new java.awt.Color(255, 255, 255));
        Register_email.setText("Correo Institucional:");
        jPanel1.add(Register_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 258, -1));

        Register_Tittle1.setBackground(new java.awt.Color(255, 255, 255));
        Register_Tittle1.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        Register_Tittle1.setForeground(new java.awt.Color(255, 255, 255));
        Register_Tittle1.setText("Registro");
        jPanel1.add(Register_Tittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 258, -1));

        Register_nombre1.setBackground(new java.awt.Color(255, 255, 255));
        Register_nombre1.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        Register_nombre1.setForeground(new java.awt.Color(255, 255, 255));
        Register_nombre1.setText("Nombre Completo:");
        jPanel1.add(Register_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 258, 60));

        Register_ID1.setBackground(new java.awt.Color(255, 255, 255));
        Register_ID1.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        Register_ID1.setForeground(new java.awt.Color(255, 255, 255));
        Register_ID1.setText("Contraseña:");
        jPanel1.add(Register_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 258, -1));

        Register_contraseña2.setBackground(new java.awt.Color(255, 255, 255));
        Register_contraseña2.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        Register_contraseña2.setForeground(new java.awt.Color(255, 255, 255));
        Register_contraseña2.setText("Id:");
        jPanel1.add(Register_contraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 258, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 310, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 310, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 310, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 310, 10));

        Btn_Register_Cancel.setBackground(new java.awt.Color(0, 51, 51));
        Btn_Register_Cancel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_Register_Cancel.setForeground(new java.awt.Color(0, 51, 51));
        Btn_Register_Cancel.setText("       Cancelar");
        Btn_Register_Cancel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Btn_Register_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Register_CancelMouseClicked(evt);
            }
        });
        jPanel1.add(Btn_Register_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 160, 40));

        Btn_Register_Confirm.setBackground(new java.awt.Color(0, 51, 51));
        Btn_Register_Confirm.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_Register_Confirm.setForeground(new java.awt.Color(0, 51, 51));
        Btn_Register_Confirm.setText("       Confirmar");
        Btn_Register_Confirm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Btn_Register_Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Register_ConfirmMouseClicked(evt);
            }
        });
        jPanel1.add(Btn_Register_Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 160, 40));

        Register_ClosedWindow.setBackground(new java.awt.Color(0, 51, 51));
        Register_ClosedWindow.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        Register_ClosedWindow.setForeground(new java.awt.Color(0, 51, 51));
        Register_ClosedWindow.setText("X");
        Register_ClosedWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Register_ClosedWindowMouseClicked(evt);
            }
        });
        jPanel1.add(Register_ClosedWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 20, -1));

        Txt_Register_user.setBackground(new java.awt.Color(0, 0, 0));
        Txt_Register_user.setForeground(new java.awt.Color(0, 51, 51));
        Txt_Register_user.setBorder(null);
        Txt_Register_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_Register_userMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_Register_userMouseExited(evt);
            }
        });
        Txt_Register_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Register_userActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_Register_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 310, 25));

        Txt_Register_Id.setBackground(new java.awt.Color(0, 0, 0));
        Txt_Register_Id.setForeground(new java.awt.Color(0, 51, 51));
        Txt_Register_Id.setBorder(null);
        Txt_Register_Id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_Register_IdMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_Register_IdMouseExited(evt);
            }
        });
        Txt_Register_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Register_IdActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_Register_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 310, 25));

        Txt_Register_Email.setBackground(new java.awt.Color(0, 0, 0));
        Txt_Register_Email.setForeground(new java.awt.Color(0, 51, 51));
        Txt_Register_Email.setBorder(null);
        Txt_Register_Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_Register_EmailMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_Register_EmailMouseExited(evt);
            }
        });
        Txt_Register_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Register_EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_Register_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 310, 25));

        Txt_Register_Password.setBackground(new java.awt.Color(0, 0, 0));
        Txt_Register_Password.setForeground(new java.awt.Color(0, 51, 51));
        Txt_Register_Password.setBorder(null);
        Txt_Register_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_Register_PasswordMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_Register_PasswordMouseExited(evt);
            }
        });
        Txt_Register_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Register_PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_Register_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 310, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Register_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Register_CancelMouseClicked
         Inicio ON = new Inicio();
         //Esto hace que el boton de cancelar lo mande a la ventana de inicio. 
            ON.setVisible(true);
            dispose();
    }//GEN-LAST:event_Btn_Register_CancelMouseClicked

    private void Register_ClosedWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_ClosedWindowMouseClicked
           //salir de la pestaña
           Inicio ON = new Inicio();
         //Esto hace que el boton de cancelar lo mande a la ventana de inicio. 
            ON.setVisible(true);
            dispose();
        
    }//GEN-LAST:event_Register_ClosedWindowMouseClicked

    private void Txt_Register_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Register_userMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_userMouseClicked

    private void Txt_Register_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Register_userMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_userMouseExited

    private void Txt_Register_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Register_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_userActionPerformed

    private void Txt_Register_IdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Register_IdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_IdMouseClicked

    private void Txt_Register_IdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Register_IdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_IdMouseExited

    private void Txt_Register_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Register_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_IdActionPerformed

    private void Txt_Register_EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Register_EmailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_EmailMouseClicked

    private void Txt_Register_EmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Register_EmailMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_EmailMouseExited

    private void Txt_Register_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Register_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_EmailActionPerformed

    private void Txt_Register_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Register_PasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_PasswordMouseClicked

    private void Txt_Register_PasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Register_PasswordMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_PasswordMouseExited

    private void Txt_Register_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Register_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Register_PasswordActionPerformed

    private void Btn_Register_ConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Register_ConfirmMouseClicked
        // Obtenemos los datos ingresados por el usuario desde los campos de texto
        String name=Txt_Register_user.getText();
        String id=Txt_Register_Id.getText();
        String email=Txt_Register_Email.getText();
        String password=Txt_Register_Password.getText();
        // Verificamos si los campos obligatorios (nombre y contraseña) están vacíos
        if(name.isEmpty()||id.isEmpty()||email.isEmpty()||password.isEmpty()){
            JOptionPane.showMessageDialog(null, "debe Completar los datos");
            
        }else{
             // Usamos try-catch para intentar guardar los datos en la base de datos
            try{
                String consulta="insert into usuarios(name, password, email, id, rol) values('"+name+"','"+id+"','"+email+"','"+password+"','Gestor')";
                // Prepara la consulta SQL para enviarla a la base de datos de forma segura y eficiente
                PreparedStatement ps = cn.prepareStatement(consulta);
                ps.executeUpdate();
                // Limpiamos los campos después de guardar
                limpiar();
                // Mostramos mensaje de éxito
                JOptionPane.showMessageDialog(null, "datos guardados");
                
            }catch(Exception e){
                 // Mostramos mensaje de error si no se pudo guardar
                JOptionPane.showMessageDialog(null, "no se ha podido guardar los datos");
            }
        }
        
     
        
       // Volvemos a la ventana de inicio
        Inicio ON = new Inicio();        
            ON.setVisible(true);
            dispose();
    }//GEN-LAST:event_Btn_Register_ConfirmMouseClicked
       // Método para limpiar los campos del formulario
        void limpiar(){
             Txt_Register_user.setText("");
             Txt_Register_Password.setText("");
             Txt_Register_Id.setText("");
             Txt_Register_Email.setText("");
             
    }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Register_Cancel;
    public javax.swing.JLabel Btn_Register_Confirm;
    private javax.swing.JLabel Register_ClosedWindow;
    private javax.swing.JLabel Register_ID1;
    private javax.swing.JLabel Register_Tittle1;
    private javax.swing.JLabel Register_contraseña2;
    private javax.swing.JLabel Register_email;
    private javax.swing.JLabel Register_nombre1;
    private javax.swing.JTextField Txt_Register_Email;
    private javax.swing.JTextField Txt_Register_Id;
    private javax.swing.JTextField Txt_Register_Password;
    private javax.swing.JTextField Txt_Register_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
