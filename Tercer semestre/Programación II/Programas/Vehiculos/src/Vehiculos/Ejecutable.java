package Vehiculos;
// Importamos la libreria ArrayList
import java.util.ArrayList;

public class Ejecutable {
// Declaramos la lista    
public static ArrayList<Vehiculos> tipos = new ArrayList<>();
    public static void main(String[] args) {
        //Se crean listas de los tipos de vehiculo que contendran los datos
        Deportivo McLaren720S = new Deportivo ("LF63 RUR", "Mclaren","720S",8);
        Furgoneta MercedesBenzSprinter = new Furgoneta ("EM 508AW","Mercedes-Benz","Sprinter",3000);
        Turismo ToyotaCorolla = new Turismo ("GLV 751", "Toyota", "Corolla", 4);
        tipos.add(McLaren720S);
        tipos.add(MercedesBenzSprinter);
        tipos.add(ToyotaCorolla);
        
        //Se muestran los metodos
        //Mostrar los datos
        //Matricula, Marca, Modelo
        System.out.println("Todos los vehiculos muestran sus datos:\n");
        for(Vehiculos tipo : tipos){
            System.out.print(tipo.getMatricula()+" "+tipo.getMarca()+" "+tipo.getModelo()+" -> ");
            tipo.MostrarDatos();
        }
        System.out.println("");
        //Cilindros
        System.out.println("Cilindraje: solamente el vehiculo deportivo muestra su cilindraje:");
        System.out.print(McLaren720S.Cilindros);
        McLaren720S.MostrarDatos();
        System.out.println("");
        //Carga
        System.out.println("Carga: solamente la furgoneta muestra su carga:");
        System.out.println(MercedesBenzSprinter.Carga + " kg");
        MercedesBenzSprinter.MostrarDatos();
        System.out.println("");
        //Puertas
        System.out.println("Puertas: solamente el vehiculo de turismo muestra el numero de puertas:");
        System.out.println(ToyotaCorolla.Numeropuertas);
        ToyotaCorolla.MostrarDatos();
        System.out.println("");
    }
    
}
