
package SQLconection;


// Importamos las clases necesarias para trabajar con la base de datos
import java.sql.*;

public class dbConection {
    // Definimos la URL de conexión, el usuario (root) y la contraseña de MySQL
    // "usuarios" es el nombre de la base de datos a la que nos vamos a conectar
   static String url="jdbc:mysql://localhost:3306/usuarios";
   static String user="root";
   static String pass="jim,alejandro,2022";
    
    // Método estático que devuelve un objeto Connection para conectarse a la base de datos
    public static Connection conectar()
    {
        Connection con=null;// Declaramos el objeto que almacenará la conexión
        //Se crea un trY para poder manejar alguna excepcion 
        try
        {
            // Intentamos establecer la conexión con los datos definidos (url, user, pass)
            con=DriverManager.getConnection(url,user,pass);
            // Si la conexión fue exitosa, mostramos un mensaje en la consola
            System.out.println("Coneccion exitosa");
            
        }catch(SQLException e){
            // Si ocurre algún error, lo mostramos en la consola para depuración
            e.printStackTrace();
            // La depuración (debugging) es el proceso de identificar y corregir errores en el código.
            // En este caso, `e.printStackTrace()` se usa para imprimir detalles del error en la consola,
            // lo que nos ayuda a conocer la causa y la ubicación exacta del problema, facilitando su corrección.
        }
        // Retornamos la conexión (si fue exitosa, tendrá valor; si falló, será null)
        return con;
    }

    
}
