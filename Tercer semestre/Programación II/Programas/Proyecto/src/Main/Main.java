package Main;

import Crud.Crud;
import Interfazes.Inicio;
import SQLconection.dbConection;


public class Main {
    public static void main(String[] args) {
        
        dbConection dbc= new dbConection();
        dbc.conectar();
        //hacer el ejecutable del login
        Inicio login = new Inicio();
        //hacer visible el login
        login.setVisible(true);      
        
    }
    
}
