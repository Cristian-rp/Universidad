/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccionfutbol;

/**
 *
 * @author Estudiante
 */
public class Masajista extends SeleccionColombia{
    // Creación de atributos propios
    private String titulacion;
    private int aniosExperiencia;
    
    // Para acceder a metodos y atributos de la clase padre
    public Masajista(){
    super();
    }
    
    //Para acceder a variables heredadas
    public Masajista(int id, String nombre, String apellido, int edad,  String titulacion, int aniosExperiencia){
        super(id, nombre, apellido, edad);
        this.titulacion=titulacion;
        this.aniosExperiencia=aniosExperiencia;
    }
    //Crear metodos propios
    public void darMasaje(){
    
    }
}
