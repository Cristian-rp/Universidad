package Clases;

public class Productos {
    //Creamos los atributos 
    protected int id;
    protected int cantidad;
    protected String nombre;
    protected String categoria;
    protected String FechaIngreso;
    
    /*Creamos un contructor vacio para permitir 
    que las clases hijas puedan acceder a la clase padre*/
    public Productos() {
    }
    /*Se crea un constructor para inicializar los atributos
    de la clase con valores especificos*/
    public Productos(int id, int cantidad, String nombre, String categoria, String FechaIngreso) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.categoria = categoria;
        this.FechaIngreso = FechaIngreso;
    }
    
    //Leer los atributos

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }
    
    //Para poder cambiar el nombre de los atributos

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    
    //Creamos el metodo 
    public String MostrarDatos() {
        return this.id + this.cantidad + this.nombre + this.categoria + this.FechaIngreso;
    }    
}
