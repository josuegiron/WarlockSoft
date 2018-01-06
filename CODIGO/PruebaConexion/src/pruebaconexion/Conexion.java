/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconexion;
import java.sql.*;

/**
 *
 * @author josue
 */
public class Conexion {
    
    public Conexion(){
        
    }
    
    public Connection getConexion(){
        Connection con = null;
        try{
            //  INSTANCIAR EL DRIVER DE LA BD
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            //  REALIZAR LA CONEXION A LA BD
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ws", "root", "Benjamin6ir0n3");
        }catch(Exception e){
            
        }
        return con;
    }
}
