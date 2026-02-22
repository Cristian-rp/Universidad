
package Controladores;


import Interfazes.Inicio;
import Interfazes.Principal;
import Interfazes.Registro;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class Custom implements MouseListener{
    
    private Inicio Custom1;
    private Principal Custom2;
    private Registro Custom3;
    
    // Constructor para inicializar el objeto con el JFrame
    public Custom (Inicio Custom1){
        this.Custom1 = Custom1;
        
         // Agregamos los listeners a los botones en el constructor
        Custom1.Btn_Login1.addMouseListener(this);
        Custom1.Btn_Login_Register.addMouseListener(this);
        Custom1.Exit_Login.addMouseListener(this);
        Custom1.unconfident_login.addMouseListener(this);
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    
}

