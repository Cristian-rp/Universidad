
package Interfazes;


import Clases.Productos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import SQLconection.dbConection;


import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal extends javax.swing.JFrame {
    //Llamamos a la clase de my Sql 
    SQLconection.dbConection con = new dbConection();
    Connection cn = con.conectar();
    //Llamamos a ala clase
    Productos p = new Productos();
     //Añadimos el TableModel para poder trabajar con ella
        DefaultTableModel model = new DefaultTableModel();
    
 
    public Principal() {
        initComponents();
        mostrartabla();
        tablaB();
        //La colocacion de la ventana es centrada y no es manejable
        setLocationRelativeTo(null);   
    }
    
    void tablaB(){
     
         
        String sql = "select * from Productos";
        String datos[] = new String [5];
        Statement st;
        try {
            
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5); 
                model.addRow(datos);
            }
            jTable1.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    void mostrartabla(){
       
         //Añadimos las columnas que vamos a tratar
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Producto");
        model.addColumn("Fecha de caducidad");
        model.addColumn("Cantidad");
        //Asignamos el modelo de la tabla
        jTable1.setModel(model);  
        String sql = "select * from Productos";
        
        String datos[] = new String [5];
        
        Statement st;
        try {
            
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5); 
                model.addRow(datos);
            }
            jTable1.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Los datos no se han integrado en la tabla");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        Principal_Titlle1 = new javax.swing.JLabel();
        Btn_Principal_Logout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Principal_Function = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Principal_Explication1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        Principal_Objetives = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        Principal_Explication2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Principal_Partes = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        Principal_Explication3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_inventory_guardar = new javax.swing.JButton();
        btn_inventory_limpiar = new javax.swing.JButton();
        btn_inventory_borrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_inventory_name = new javax.swing.JTextField();
        txt_inventory_Id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_inventory_fecha = new javax.swing.JTextField();
        btn_inventory_modificar = new javax.swing.JButton();
        btn_inventory_actualizar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_inventory_products = new javax.swing.JTextField();
        txt_inventory_cantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("-");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 20, 30));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

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

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 20));

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

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 20, 20));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 10, 10));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 10, 20));

        Principal_Titlle1.setBackground(new java.awt.Color(255, 255, 255));
        Principal_Titlle1.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        Principal_Titlle1.setForeground(new java.awt.Color(255, 255, 255));
        Principal_Titlle1.setText("Enfermeria");
        jPanel2.add(Principal_Titlle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 190, -1));

        Btn_Principal_Logout.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Principal_Logout.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_Principal_Logout.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Principal_Logout.setText("         Cerrar Sesión");
        Btn_Principal_Logout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Btn_Principal_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Principal_LogoutMouseClicked(evt);
            }
        });
        jPanel2.add(Btn_Principal_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 180, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/supplier.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo udec mediano.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jTabbedPane1.setBackground(new java.awt.Color(0, 51, 51));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(0, 51, 51));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setForeground(new java.awt.Color(0, 0, 0));

        Principal_Function.setBackground(new java.awt.Color(255, 255, 255));
        Principal_Function.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        Principal_Function.setForeground(new java.awt.Color(255, 255, 255));
        Principal_Function.setText("Funcion de esta interfaz");

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        Principal_Explication1.setBackground(new java.awt.Color(255, 255, 255));
        Principal_Explication1.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        Principal_Explication1.setForeground(new java.awt.Color(255, 255, 255));
        Principal_Explication1.setText("<html>Explicacion:<p>Esta interfaz permitira a los usuarios o funcionarios de<p>enfermeria un mejor control del inventario, permitiendo tener<p>todos los datos de los consumibles que se usan a diario<html>");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal_Explication1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal_Explication1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Principal_Function, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Principal_Function)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 210));

        jPanel11.setBackground(new java.awt.Color(0, 51, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Principal_Objetives.setBackground(new java.awt.Color(255, 255, 255));
        Principal_Objetives.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        Principal_Objetives.setForeground(new java.awt.Color(255, 255, 255));
        Principal_Objetives.setText("Objetivo:");

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        Principal_Explication2.setBackground(new java.awt.Color(255, 255, 255));
        Principal_Explication2.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        Principal_Explication2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Principal_Explication2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(Principal_Explication2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(Principal_Objetives, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 190, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Principal_Objetives)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 320, 380));

        jPanel12.setBackground(new java.awt.Color(0, 51, 51));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Principal_Partes.setBackground(new java.awt.Color(255, 255, 255));
        Principal_Partes.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        Principal_Partes.setForeground(new java.awt.Color(255, 255, 255));
        Principal_Partes.setText("Partes del software");

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));

        Principal_Explication3.setBackground(new java.awt.Color(255, 255, 255));
        Principal_Explication3.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        Principal_Explication3.setForeground(new java.awt.Color(255, 255, 255));
        Principal_Explication3.setText("Explicacion:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Principal_Explication3, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Principal_Explication3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(Principal_Partes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Principal_Partes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 550, 160));

        jTabbedPane1.addTab("Principal", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "ID del enfermero", "Tipo de producto", "Fecha de caducidad", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 870, 180));

        btn_inventory_guardar.setBackground(new java.awt.Color(0, 51, 51));
        btn_inventory_guardar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btn_inventory_guardar.setForeground(new java.awt.Color(0, 0, 0));
        btn_inventory_guardar.setText("Guardar");
        btn_inventory_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventory_guardarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_inventory_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 100, 30));

        btn_inventory_limpiar.setBackground(new java.awt.Color(0, 51, 51));
        btn_inventory_limpiar.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        btn_inventory_limpiar.setForeground(new java.awt.Color(0, 0, 0));
        btn_inventory_limpiar.setText("Limpiar");
        btn_inventory_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventory_limpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_inventory_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 100, 30));

        btn_inventory_borrar.setBackground(new java.awt.Color(0, 51, 51));
        btn_inventory_borrar.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        btn_inventory_borrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_inventory_borrar.setText("Borrar");
        btn_inventory_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventory_borrarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_inventory_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 100, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID del enfermero/a:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 30));
        jPanel4.add(txt_inventory_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 160, 30));
        jPanel4.add(txt_inventory_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 160, 30));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipo de producto:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 120, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cantidad:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 90, 30));
        jPanel4.add(txt_inventory_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 160, 30));

        btn_inventory_modificar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btn_inventory_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_inventory_modificar.setText("Modificar");
        btn_inventory_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventory_modificarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_inventory_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 100, 30));

        btn_inventory_actualizar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btn_inventory_actualizar.setForeground(new java.awt.Color(0, 0, 0));
        btn_inventory_actualizar.setText("Actualizar");
        btn_inventory_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventory_actualizarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_inventory_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 100, 30));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fecha de caducidad:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 160, 30));
        jPanel4.add(txt_inventory_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 160, 30));

        txt_inventory_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inventory_cantidadActionPerformed(evt);
            }
        });
        jPanel4.add(txt_inventory_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 60, 30));

        jTabbedPane1.addTab("Inventario", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 900, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //Minimiza la ventana
        setState(Principal.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // Muestra un cuadro de diálogo de confirmación antes de cerrar la aplicación
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del principal?", "EXIT",dialogButton);
        // Si el usuario selecciona "Sí", se cierra la aplicación
        if (result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Btn_Principal_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Principal_LogoutMouseClicked
        // Muestra un cuadro de diálogo de confirmación antes de cerrar la aplicación
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea regresar al inicio de sesión?", "RETURN",dialogButton);
        // Si el usuario selecciona "Sí", se cierra la aplicación
        if (result == 0){
            Inicio ON = new Inicio();
         //Esto hace que el boton de cancelar lo mande a la ventana de inicio. 
            ON.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_Btn_Principal_LogoutMouseClicked

    private void btn_inventory_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventory_guardarActionPerformed
              
        //Sirve para captar lo escrito anteriormente
        p.setNombre(this.txt_inventory_name.getText());
        p.setId(this.txt_inventory_Id.getText());
        p.setCantidad(this.txt_inventory_cantidad.getText());
        //Usada para agregar una de las selecciones dadas en el Cmb
        p.setCategoria(this.txt_inventory_products.getText());
        p.setFechaIngreso(this.txt_inventory_fecha.getText());
        // Crea un array de objetos 'datos' con la información de la persona 'p',
        // obteniendo su ID, nombre, edad y género.
        Object [] datos = {p.getId(), p.getNombre(), p.getCategoria(),p.getFechaIngreso(), p.getCantidad()};
        // Agrega una nueva fila a la tabla con los datos almacenados en el array 'datos'.
        model.addRow(datos);
        
        try{
            
            String consulta = "insert into Productos(Nombre, Id, Tipo_producto, Fecha_caducidad, Cantidad) values('"+p.getNombre()+"','"+p.getId()+"','"+p.getCategoria()+"','"+p.getFechaIngreso()+"','"+p.getCantidad()+"')";
             // Prepara la consulta SQL para enviarla a la base de datos de forma segura y eficiente
                PreparedStatement ps = cn.prepareStatement(consulta);
                model.addRow(datos);
                ps.executeUpdate();
                // Mostramos mensaje de éxito
                JOptionPane.showMessageDialog(null, "datos guardados");
            
        }catch(Exception ex){
            // Mostramos mensaje de error si no se pudo guardar
                JOptionPane.showMessageDialog(null, "no se ha podido guardar los datos");    
        }
        
    }//GEN-LAST:event_btn_inventory_guardarActionPerformed

    private void btn_inventory_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventory_borrarActionPerformed
        // Obtenemos el índice de la fila seleccionada en la tabla
        int filaSeleccionada = jTable1.getSelectedRow();
        
        /*Volvemos a llamar a la libreria, despues de eso con removeRow
        (seleccionando la tabla que vamos a usa),  podemos elegir nuestra tabla 
        y con getSelectedRow() podemos seleccionar y eliminar*/
        //modelo.removeRow(jTable1.getSelectedRow());
        
        /*Si no seleccionamos nd nos daldra un error por lo que tenemos que 
        crear una pregunta*/
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun registro en la tabla", "ERROR AL ELIMINAR REGISTRO",JOptionPane.ERROR_MESSAGE);
            
        } else{
            try{
                /*
             * Si hay una fila seleccionada, procedemos a eliminar el registro de la base de datos.
             * Se construye una consulta SQL para eliminar el producto con el ID correspondiente.
             * NOTA: Se asume que 'p.getId()' obtiene el ID del producto que se desea eliminar.
             * Asegúrate de que 'p' sea la instancia correspondiente al producto seleccionado.
             */
                String consulta = "delete from Productos where id = '"+p.getId()+"'";
                PreparedStatement ps = cn.prepareStatement(consulta);
                ps.executeUpdate();// Ejecutamos la consulta
                // Mostramos mensaje de éxito
                JOptionPane.showMessageDialog(null, "Datos Eliminados");
            }catch(Exception ex){
                // Mostramos mensaje de error si no se pudo guardar
                JOptionPane.showMessageDialog(null, "no se ha podido eliminar los datos");    
            }
             // Finalmente, eliminamos la fila seleccionada del modelo de la tabla en la interfaz gráfica
            model.removeRow(filaSeleccionada);
        }
    }//GEN-LAST:event_btn_inventory_borrarActionPerformed

    private void btn_inventory_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventory_limpiarActionPerformed
       limpiarTabla();
    }//GEN-LAST:event_btn_inventory_limpiarActionPerformed

    private void btn_inventory_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventory_modificarActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila>=0){
            txt_inventory_name.setText(jTable1.getValueAt(fila, 0).toString());
            txt_inventory_Id.setText(jTable1.getValueAt(fila, 1).toString());
            txt_inventory_fecha.setText(jTable1.getValueAt(fila, 3).toString());
            txt_inventory_products.setText(jTable1.getValueAt(fila, 2).toString());
            txt_inventory_cantidad.setText(jTable1.getValueAt(fila, 4).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    }//GEN-LAST:event_btn_inventory_modificarActionPerformed

    private void btn_inventory_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventory_actualizarActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement("update Productos set Nombre = '"+txt_inventory_name.getText()+"', Tipo_producto='"+txt_inventory_products.getText()+"',Fecha_caducidad = '"+ txt_inventory_fecha.getText()+"', cantidad = '"+txt_inventory_cantidad.getText()+"' where Id = '"+ txt_inventory_Id.getText()+"'");
            tablaB();
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Los datos se han actualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos no actualizados");
        }

    }//GEN-LAST:event_btn_inventory_actualizarActionPerformed

    private void txt_inventory_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inventory_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inventory_cantidadActionPerformed
   
     //CREACION DE METODOS PARA LOS BOTONES DE LA TABLA
    void limpiarTabla(){
        // sirve para limpiar los campos utilizados en el inventario
        txt_inventory_name.setText("");
        txt_inventory_fecha.setText("");
        txt_inventory_Id.setText("");
        txt_inventory_products.setText("");
        txt_inventory_cantidad.setText("");
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Principal_Logout;
    private javax.swing.JLabel Principal_Explication1;
    private javax.swing.JLabel Principal_Explication2;
    private javax.swing.JLabel Principal_Explication3;
    private javax.swing.JLabel Principal_Function;
    private javax.swing.JLabel Principal_Objetives;
    private javax.swing.JLabel Principal_Partes;
    private javax.swing.JLabel Principal_Titlle1;
    private javax.swing.JButton btn_inventory_actualizar;
    private javax.swing.JButton btn_inventory_borrar;
    private javax.swing.JButton btn_inventory_guardar;
    private javax.swing.JButton btn_inventory_limpiar;
    private javax.swing.JButton btn_inventory_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_inventory_Id;
    private javax.swing.JTextField txt_inventory_cantidad;
    private javax.swing.JTextField txt_inventory_fecha;
    private javax.swing.JTextField txt_inventory_name;
    private javax.swing.JTextField txt_inventory_products;
    // End of variables declaration//GEN-END:variables
}
