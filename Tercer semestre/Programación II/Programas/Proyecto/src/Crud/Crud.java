
package Crud;


// Importamos la clase para conectarnos a la base de datos MySQL
import SQLconection.dbConection;
import java.sql.*;// Importamos las clases necesarias para trabajar con SQL en Java

public class Crud {
    // Creamos el primer método del CRUD: insertarDato
    // Este método recibe dos parámetros: name, password, email  y id, que se insertarán en la base de datos
    public void insertarDato(String name, String password, int id,String email){
        
        // Definimos la consulta SQL usando parámetros (?) para evitar inyecciones SQL
        String query="insert into usuarios (name,password,id,email, rol) values(?,?,?,?,'Gestor')";
        try
        {
            // Establecemos la conexión a la base de datos llamando al método conectar() de la clase dbConection
            Connection con=dbConection.conectar();
            
            // Preparamos la consulta SQL para enviarla a la base de datos de forma segura y eficiente
            PreparedStatement ps=con.prepareStatement(query);
            // Reemplazamos los signos de interrogación (?) con los valores recibidos por el método
            ps.setString(1, name);// Asignamos el valor del nombre
            ps.setString(2, password);// Asignamos el valor de la contraseña
            ps.setInt(3, id);//asignamos el valor del id
            ps.setString(4, email);//asignamos el valor del email
            
             // Ejecutamos la consulta para insertar los datos en la tabla
            ps.executeUpdate();
            // Mostramos mensaje de éxito en la consola
            System.out.println("dato insertado con exito");
            
        }
        catch(SQLException ex){
            // Si ocurre un error al insertar los datos, mostramos un mensaje en consola
            System.out.println("Error al insertar dato");
            
            // Imprimimos el detalle del error para depuración
            ex.printStackTrace();                  
        }
    }
    
}
