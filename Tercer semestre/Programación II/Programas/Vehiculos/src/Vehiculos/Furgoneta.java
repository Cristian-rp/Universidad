package Vehiculos;


public class Furgoneta extends Vehiculos  {
    //Atributos 
    protected int Carga;
    
/*Esto hace que la herencia se active     
y Llame al constructor de la CLASE PADRE*/
 public Furgoneta(){
     super();
 }
 
   /*Acceder a las variables heredadas*/
 public Furgoneta(String Matricula, String Marca, String Modelo, int Carga){
     super(Matricula, Marca, Modelo);
     this.Carga=Carga;        
 }
    /*SOBRESCRITURA DE METODOS*/
    @Override
 public String MostrarDatos(){
    return "Matricula="+this.Matricula+"Marca="+this.Marca+"Modelo="+this.Modelo+"Carga"+this.Carga; //RETORNAR LOS DATOS
    }
}
