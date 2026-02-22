/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccionfutbol;

/**
 *
 * @author Estudiante
 */
public class Entrenador extends SeleccionColombia{
    // Crear atributos propios
    private String federacion;
    
    // Para acceder a metodos y atributos de la clase padre
    public Entrenador(){
    super();
    }
    
    //Accerder a variables heredadas
    public Entrenador(int id, String nombre, String apellido, int edad, String federacion){
        super(id, nombre, apellido, edad);
        this.federacion=federacion;
    }
    // Crear metodos propios
    public void dirigirPartido(){
        
    }
    public void dirigirEntrenamiento(){
        
    }

    void dirigirEntreno() {
        
    }
}
