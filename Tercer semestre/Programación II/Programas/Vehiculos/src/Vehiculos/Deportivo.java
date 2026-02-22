package Vehiculos;


public class Deportivo extends Vehiculos {
    //Atributos 
    protected int Cilindros;
    
    /*Esto hace que la herencia se active 
    y Llame al constructor de la CLASE PADRE*/
    public Deportivo(){
        super();
    }
    
    /*Acceder a las variables heredadas*/
    public Deportivo(String Matricula, String Marca, String Modelo, int Cilindros){
        super(Matricula, Marca, Modelo);
        this.Cilindros = Cilindros;
    }
     /*SOBRESCRITURA DE METODOS*/
     @Override
 public String MostrarDatos(){
    return super.MostrarDatos() + "Cilindros = " + this.Cilindros ; //RETORNAR LOS DATOS
    }
}
