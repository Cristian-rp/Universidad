package Clases;

public class Cuenta extends Titular{
    //Creamos los atributos propios
    protected double Cantidad;

    /*Esto hace que la herencia se active     
    y Llame al constructor de la CLASE PADRE*/
    public Cuenta() {
        super();
    }
    //Acceder a variables heredadas 
    public Cuenta(String nombre, int id, double Cantidad) {
        super(nombre, id);
        this.Cantidad = Cantidad;
    }
    //Para leer el atributo
    public double getCantidad() {
        return Cantidad;
    }
    //Para poder cambiar el valor del atributo 
    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    //Sobre escritura de metodos
    @Override
    public String MostrarDatos() {
        return this.nombre + this.id + this.Cantidad ;
    }   
}
