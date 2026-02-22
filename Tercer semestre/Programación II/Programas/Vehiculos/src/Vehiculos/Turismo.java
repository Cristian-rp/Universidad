package Vehiculos;


public class Turismo extends Vehiculos {
    //Atributos 
    protected int Numeropuertas;
        
/*Esto hace que la herencia se active 
y Llame al constructor de la CLASE PADRE*/
 public Turismo(){
     super();
 }
 
    /*Acceder a las variables heredadas*/
 public Turismo (String Matricula, String Marca, String Modelo, int Numeropuertas){
     super(Matricula, Marca, Modelo);
     this.Numeropuertas = Numeropuertas;
 }
 /*SOBRESCRITURA DE METODOS*/
    @Override
 public String MostrarDatos(){
    return "Matricula="+this.Matricula+"Marca="+this.Marca+"Modelo="+this.Modelo+"Numero de puertas="+this.Numeropuertas; //RETORNAR LOS DATOS
    }
}
