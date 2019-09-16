package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class conexion {
    static Connection contacto = null;
    
    public static Connection getConexion() throws SQLException{
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Biblioteca";
      try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      }catch (ClassNotFoundException e){
          JOptionPane.showMessageDialog(null, "No se establece la conexión: error 1"
                  + e.getMessage(), "Error de Conexión",JOptionPane.ERROR_MESSAGE);
      }
     
      try{
          contacto = DriverManager.getConnection(url,"sa","1234");
      }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "No se establece la conexión: error 2"
                  + e.getMessage(), "Error de Conexión",JOptionPane.ERROR_MESSAGE);
      }
        return contacto;
    }
    
    public static ResultSet Consulta(String consulta) throws SQLException{
        Connection con = getConexion();
        Statement declara;
        try{
            declara= con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch(SQLException e){
             JOptionPane.showMessageDialog(null, "No se establece la conexión error 3 "
                  + e.getMessage(), "Error de Conexión",JOptionPane.ERROR_MESSAGE);
        }
        
        return null;
    }
      
}
