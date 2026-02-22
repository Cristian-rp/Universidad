/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccionfutbol;

/**
 *
 * @author Estudiante
 */
public class SeleccionColombia {
    // Esta va a ser la clase padre
    // Crear atributos en comun
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    
    //Para que las clases hija puedan acceder a los atributos
    public SeleccionColombia(){
    }
    public SeleccionColombia(int id, String nombre, String apellido, int edad){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    // Para obtener acceso a las variables privadas
    String getnombre(){ 
        return this.nombre;       
    }
    String getapellidos(){
        return this.apellido;
    }
    int getedad(){
        return this.edad;
    }
    int getid(){
        return this.id;
    }
    // Crear metodos en comun
    public void concentrarse(){  
    
    }
    public void viajar(){
        
    }
    
}
