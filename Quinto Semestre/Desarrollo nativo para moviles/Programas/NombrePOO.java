import java.util.Scanner;

class Persona {
    //Atributo
    String nombre;
    
    //Constructor
    public Persona(String nombreRecibido){
        this.nombre = nombreRecibido;
    }
    //Metodo
    public void verificarNombre() {
        System.out.println("Su nombre es: " + this.nombre);
    }
}

public class NombrePOO {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String entrada = scanner.nextLine();
        Persona p1 = new Persona(entrada);
        p1.verificarNombre();
        scanner.close();
    }
}