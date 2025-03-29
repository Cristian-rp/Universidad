package Clases;

public class Productos {
    //Creamos los atributos 
    protected int id;
    protected String nombre;
    protected String categoria;
    protected float PrecioCompra;
    
    /*Se crea un constructor para inicializar los atributos
    de la clase con valores especificos*/
    public Productos(int id, String nombre, String categoria, float PrecioCompra) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.PrecioCompra = PrecioCompra;        
    }
    
    //Leer los atributos

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPrecioCompra() {
        return PrecioCompra;
    }
    
    //Para poder cambiar el nombre de los atributos

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecioCompra(float PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }
    
    //Creamos el metodo 
    public String MostrarDatos() {
        return this.id + this.nombre + this.categoria + this.PrecioCompra;
    }    
}
