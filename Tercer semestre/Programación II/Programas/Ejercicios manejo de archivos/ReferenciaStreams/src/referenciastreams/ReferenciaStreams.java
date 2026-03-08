package referenciastreams;

import java.io.FileReader; // Importamos la clase FileReader para leer archivos de texto.
import java.io.FileWriter; // Importamos la clase FileWriter para escribir archivos de texto.
import java.io.IOException; // Importamos IOException para manejar excepciones durante las operaciones de archivo.

public class ReferenciaStreams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primero, escribimos un archivo de texto utilizando FileWriter
        try (FileWriter writer = new FileWriter("archivo.txt")) { // 'try-with-resources' asegura que el archivo se cierre automáticamente.
            String data = "Este es un archivo de texto de ejemplo.\n"; //Aquí puedes ver cómo funciona la escritura en archivos.
            writer.write(data); // Escribimos el contenido en el archivo de texto.
            System.out.println("Datos escritos en el archivo.");
        } catch (IOException e) { // Capturamos cualquier excepción que pueda ocurrir al escribir el archivo.
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Luego, leemos el archivo de texto utilizando FileReader
        try (FileReader reader = new FileReader("archivo.txt")) { // 'try-with-resources' asegura que el archivo se cierre automáticamente.
            int charData; // Variable para almacenar cada carácter leído del archivo.
            System.out.println("\nLeyendo datos del archivo:");
            while ((charData = reader.read()) != -1) { // Leemos el archivo carácter por carácter hasta llegar al final.
                System.out.print((char) charData); // Imprimimos cada carácter leído en la consola.
            }
        } catch (IOException e) { // Capturamos cualquier excepción que pueda ocurrir al leer el archivo.
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
}
