package seleccionfutbol;
// Importamos la libreria ArrayList
import java.util.ArrayList;

public class SeleccionFutbol {
// Declaramos la lista
public static ArrayList<SeleccionColombia> integrantes = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crean listas de los integrantes que contendran los datos
        Entrenador delBosque = new Entrenador (1, "Vicente", "Del Bosque", 60, "284EZ89");
        Futbolista iniesta = new Futbolista (2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        Masajista raulMartines = new Masajista (3, "Raul", "Martines", 41, "Licenciado en Fisioterapia", 18);
        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartines);
        
        // Se hacen los metodos
        //Concentracion 
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecuntan el mismo metodo)\n");
        for (SeleccionColombia integrante : integrantes){
            System.out.print(integrante.getnombre()+" "+integrante.getapellidos()+" -> ");          
            integrante.concentrarse();
        }
        System.out.println("");
        //Viaje
        System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecuntan el mismo metodo)");
        for(SeleccionColombia integrante : integrantes){
            System.out.print(integrante.getnombre()+" "+integrante.getapellidos()+" -> ");
            integrante.viajar();
        }
        System.out.println("");
        //Entrenamiento
        System.out.println("Entrenamiento: Solamente el entrenador y el futbolista tienen metodos para entrenar:");
        System.out.print(delBosque.getnombre()+" "+delBosque.getapellidos()+" ->");
        delBosque.dirigirEntreno();
        System.out.print(iniesta.getnombre()+" "+iniesta.getapellidos()+" -> ");
        iniesta.entrenar();
        System.out.println("");
        //Masaje
        System.out.println("Masaje: Solo el masajista tiene el metodo para dar un masaje:");
        System.out.print(raulMartines.getnombre()+" "+raulMartines.getapellidos());
        raulMartines.darMasaje();
        System.out.println("");
        //Partido de futbol
        System.out.println("Partido de futbol: Solamente el entrenador y el futbolista tiene metodos para el partido de futbol:");
        System.out.print(delBosque.getnombre()+" "+delBosque.getapellidos()+" ->");
        delBosque.dirigirPartido();
        System.out.print (iniesta.getnombre()+" "+iniesta.getapellidos()+" -> ");
        iniesta.jugarPartido();
        System.out.println("");
    }
    
    
}


