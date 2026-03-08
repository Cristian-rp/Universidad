package Vehiculos;

public class Vehiculos {
    
    //Creamos los atributos
  protected String Matricula;
  protected String Marca;
  protected String Modelo;
    
    /*Dando los permisos para que accedan a la CLASE PADRE*/
public Vehiculos () {
}
/* Constructor de la clase Vehiculos 
inicializa un objeto de tipo Vehiculos asignando valores  
a los atributos Matricula, Marca y Modelo cuando se crea una 
nueva instancia de la clase.*/  
public Vehiculos(String Matricula, String Marca, String Modelo){
    this.Marca = Marca;
    this.Matricula = Matricula;
    this.Modelo = Modelo;
}

/*Esto sirve para acceder a los atributos protegidos*/
String getMatricula(){
    return this.Matricula;
}
String getMarca(){
    return this.Marca;
}
String getModelo(){
    return this.Modelo;
}


 //Metodos
public String MostrarDatos(){
    return "Matricula="+this.Matricula+"Marca="+this.Marca+"Modelo="+this.Modelo; //RETORNAR LOS DATOS
    }
    
}
