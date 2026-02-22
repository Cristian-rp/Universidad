package accesoaleatorio_2;

import java.io.IOException;  // Importa la clase IOException para manejar errores de entrada/salida
import java.io.RandomAccessFile;  // Importa la clase RandomAccessFile para el acceso aleatorio

public class AccesoAleatorio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ruta del archivo donde se almacenan los registros de empleados
        String archivo = "empleados.dat";
        
        try {
            // Crear un objeto RandomAccessFile en modo lectura y escritura (rw)
            RandomAccessFile raf = new RandomAccessFile(archivo, "rw");

            // Escribir 3 registros de empleados en el archivo
            raf.writeUTF("Empleado 1");  // Escribe el nombre del empleado
            raf.writeInt(30);  // Escribe la edad del empleado
            raf.writeDouble(35000.50);  // Escribe el salario del empleado

            raf.writeUTF("Empleado 2");
            raf.writeInt(25);
            raf.writeDouble(27000.75);

            raf.writeUTF("Empleado 3");
            raf.writeInt(40);
            raf.writeDouble(42000.80);

            // Modificar el salario del "Empleado 2" (el puntero debe moverse a la posición adecuada)
            raf.seek(34);  // Mover al inicio de la segunda sección de "Empleado 2" (después del nombre y la edad)
            raf.writeDouble(29000.00);  // Cambiar el salario del "Empleado 2"

            // Leer todos los registros para verificar la modificación
            raf.seek(0);  // Volver al inicio del archivo para leer los registros completos

            // Leer y mostrar todos los registros de empleados
            for (int i = 0; i < 3; i++) {
                String nombre = raf.readUTF();  // Leer el nombre del empleado
                int edad = raf.readInt();  // Leer la edad
                double salario = raf.readDouble();  // Leer el salario
                // Mostrar los datos del empleado
                System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
            }

            raf.close();  // Cerrar el archivo después de realizar las operaciones
        } catch (IOException e) {
            // Manejo de excepciones si ocurre un error de I/O al leer o escribir en el archivo
            e.printStackTrace();
        }
    } 
}
