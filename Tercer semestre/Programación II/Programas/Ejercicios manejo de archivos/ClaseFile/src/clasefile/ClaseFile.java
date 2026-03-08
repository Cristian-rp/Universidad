package clasefile;

import java.io.File; // Importamos la clase File

public class ClaseFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto File que representa un archivo
        File archivo = new File("ejemplo.txt");

        // Verificar si el archivo existe
        if (!archivo.exists()) {
            try {
                // Crear un nuevo archivo vacío
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado: " + archivo.getName());
                } else {
                    System.out.println("El archivo ya existe.");
                }
            } catch (Exception e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }

        // Obtener información del archivo
        System.out.println("Nombre del archivo: " + archivo.getName());
        System.out.println("Ruta absoluta del archivo: " + archivo.getAbsolutePath());
        System.out.println("¿Es un archivo? " + archivo.isFile());
        System.out.println("¿Es un directorio? " + archivo.isDirectory());
        System.out.println("Tamaño del archivo en bytes: " + archivo.length());

        // Crear un objeto File que representa un directorio
        File directorio = new File("miDirectorio");

        // Verificar si el directorio existe, si no, crearlo
        if (!directorio.exists()) {
            if (directorio.mkdir()) {
                System.out.println("Directorio creado: " + directorio.getName());
            } else {
                System.out.println("No se pudo crear el directorio.");
            }
        }

        // Listar los archivos dentro de un directorio (si es un directorio)
        if (directorio.isDirectory()) {
            String[] archivos = directorio.list(); // Lista los nombres de los archivos en el directorio
            System.out.println("Archivos en el directorio:");
            for (String archivoNombre : archivos) {
                System.out.println(archivoNombre);
            }
        }

        // Eliminar el archivo (si existe)
        if (archivo.exists() && archivo.delete()) {
            System.out.println("Archivo eliminado.");
        } else {
            System.out.println("El archivo no pudo ser eliminado o no existe.");
        }

        // Eliminar el directorio (si está vacío)
        if (directorio.exists() && directorio.delete()) {
            System.out.println("Directorio eliminado.");
        } else {
            System.out.println("El directorio no pudo ser eliminado o no está vacío.");
        }
    }
    
}
