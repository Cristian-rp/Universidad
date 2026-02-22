package Clases;

public class Titular{
    //Creamos los atributos
    protected String nombre;
    protected int id;

    /*Creamos un contructor vacio para permitir 
    que las clases hijas puedan acceder a la clase padre*/
    public Titular() {
    }
    
    /* Constructor que permite inicializar los atributos 
    de la clase con valores específicos*/

    public Titular(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    //Para leer los atributos 
    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return id;
    }
    
    //Para poder cambiar el valor de los atributos 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    //Metodo
    public String MostrarDatos(){
        //retornar los datos
        return this.nombre + this.id;
    }
        
}
