
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    public static final String  BASE = "tienda";
    public static final String  USERNAME = "root";
    public static final String  PASSWORD = "blayberrybb";
    public static final String  URL = 
            "jdbc:mysql://localhost:3306/tienda";
    private Connection con = null;
    
    
    public Connection getConnection(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection
            (URL, USERNAME, PASSWORD);
        }catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
