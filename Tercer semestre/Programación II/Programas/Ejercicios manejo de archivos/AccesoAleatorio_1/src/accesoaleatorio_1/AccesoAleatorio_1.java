package accesoaleatorio_1;

import java.io.IOException;  // Importa la clase IOException para manejar excepciones de entrada/salida
import java.io.RandomAccessFile;  // Importa la clase RandomAccessFile para el acceso aleatorio a archivos

public class AccesoAleatorio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ruta del archivo donde se va a trabajar
        String archivo = "ejemplo.dat";

        try {
            // Crear un objeto RandomAccessFile para leer y escribir en el archivo
            RandomAccessFile raf = new RandomAccessFile(archivo, "rw");

            // Escribir un número entero en la primera posición del archivo
            raf.writeInt(100);  // Escribe un número entero (4 bytes)
            // Escribir un número decimal en la siguiente posición
            raf.writeDouble(3.14);  // Escribe un número de punto flotante (8 bytes)
            // Escribir una cadena de texto (UTF) en la siguiente posición
            raf.writeUTF("Java");  // Escribe una cadena de texto con formato UTF

            // Mover el puntero de lectura/escritura al inicio del archivo para leer los datos
            raf.seek(0);  // Mueve el puntero a la posición 0 (inicio del archivo)

            // Leer los datos desde el archivo
            int numero = raf.readInt();  // Lee un número entero
            double decimal = raf.readDouble();  // Lee un número de punto flotante
            String texto = raf.readUTF();  // Lee una cadena de texto

            // Imprimir los datos leídos
            System.out.println("Numero: " + numero);
            System.out.println("Decimal: " + decimal);
            System.out.println("Texto: " + texto);

            // Modificar el valor en la primera posición del archivo (el número entero)
            raf.seek(0);  // Mueve el puntero nuevamente a la posición 0
            raf.writeInt(200);  // Escribe un nuevo valor en la misma posición

            // Leer y mostrar el valor modificado
            raf.seek(0);  // Mover al inicio para leer el valor modificado
            numero = raf.readInt();  // Leer el nuevo número entero
            System.out.println("Numero modificado: " + numero);

            raf.close();  // Cerrar el archivo después de realizar las operaciones
        } catch (IOException e) {
            // Manejo de excepciones de entrada/salida, si ocurre un error al leer o escribir
            e.printStackTrace();
        }
    }
    
}
