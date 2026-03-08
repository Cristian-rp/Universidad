/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccionfutbol;

/**
 *
 * @author Estudiante
 */
public class Futbolista extends SeleccionColombia{
    // Creación de atributos propios
    private int dorsal;
    private String demarcacion;
    
    /* 
    Para acceder a metodos y atributos de la clase padre
    sin esto la herencia no funciona
    */  
    public Futbolista(){
    super();
    }

    // Acceder a las variables heredadas
    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion){
        super(id, nombre, apellido, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    // Creacion de metodos propios
    public void jugar(){
    
    }
    void entrenar(){
        
    }

    void jugarPartido() {
       
    }
}
