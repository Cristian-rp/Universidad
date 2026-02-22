import java.util.Scanner;

public class imprimirNombre {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, escribe tu nombre: ");
        String nombre = scanner.nextLine(); // Variable para guardar el nombre
        System.out.println("Su es nombre: "+nombre);
    }
}