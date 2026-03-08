package properties;

import java.io.FileInputStream;  // Importa la clase FileInputStream para leer archivos.
import java.io.FileOutputStream; // Importa la clase FileOutputStream para escribir archivos.
import java.io.IOException;      // Importa la clase IOException para manejar errores de entrada/salida.
import java.util.Properties;     // Importa la clase Properties para trabajar con propiedades clave-valor.


public class properties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Properties para manejar las propiedades clave-valor
        Properties propiedades = new Properties();

        // Intentar cargar propiedades desde un archivo de configuración
        try (FileInputStream input = new FileInputStream("config.properties")) {
            // Cargar las propiedades desde el archivo especificado
            propiedades.load(input); // Carga el archivo de propiedades en el objeto Properties
            System.out.println("Propiedades cargadas:");
            // Imprimir todas las propiedades cargadas en la consola
            propiedades.list(System.out); // Este método imprime las propiedades en formato legible
        } catch (IOException e) {
            // Si ocurre un error al cargar el archivo, se captura la excepción y se muestra el mensaje de error
            System.out.println("Error al cargar el archivo de propiedades: " + e.getMessage());
        }

        // Modificar o agregar nuevas propiedades al objeto Properties
        propiedades.setProperty("usuario", "admin"); // Agregar una propiedad con clave 'usuario' y valor 'admin'
        propiedades.setProperty("clave", "12345");   // Agregar una propiedad con clave 'clave' y valor '12345'

        // Mostrar las propiedades modificadas en la consola
        System.out.println("\nPropiedades modificadas:");
        // Imprimir las propiedades actualizadas en la consola
        propiedades.list(System.out); // Muestra las propiedades modificadas

        // Intentar guardar las propiedades modificadas en el mismo archivo de configuración
        try (FileOutputStream output = new FileOutputStream("config.properties")) {
            // Guardar las propiedades en el archivo especificado. El segundo parámetro es un comentario opcional.
            propiedades.store(output, "Archivo de configuración actualizado"); // Almacena las propiedades en el archivo
            System.out.println("\nPropiedades almacenadas en el archivo.");
        } catch (IOException e) {
            // Si ocurre un error al guardar el archivo, se captura la excepción y se muestra el mensaje de error
            System.out.println("Error al guardar el archivo de propiedades: " + e.getMessage());
        }
    }
    
}
