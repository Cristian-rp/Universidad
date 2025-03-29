package Main;
//Importamos el paquete de Inicio
import Interfaces.Inicio;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Creamos una instancia del JFrame Inicio
        para poder llamar metodos*/
        Inicio ON = new Inicio();
        //Hacemos visible la ventana
        ON.setVisible(true);
    }
}
