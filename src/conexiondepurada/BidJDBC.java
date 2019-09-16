package conexiondepurada;
//Se importan los paquetes y clases para poder hacer uso de ellos

import BID_MAIN.IngresoLogica;
import BID_MAIN.RegistrarLogica;
import B_I_D.PantallaAdministrador;
import com.panamahitek.ArduinoException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import domain.Alumno;
import domain.Registros;
import javax.swing.JOptionPane;
import jssc.SerialPortException;


public class BidJDBC {

    public static IngresoLogica IngLog = new IngresoLogica();
    public static RegistrarLogica RegLog = new RegistrarLogica();
    public static PantallaAdministrador PantAdm = new PantallaAdministrador();
    //Variable de conexion

    public Connection usercon;
    //Consultas para la tabla Alumno 
    private static final String SQL_INSERT = "INSERT INTO Alumnos(No_Control, Nombre, Carrera, Contrasena) VALUES(?,?,?,?);";
    private static final String SQL_UPDATE = "UPDATE Alumnos SET Nombre=?, Carrera=?, Contrasena=? WHERE No_Control=?;";
    private static final String SQL_DELETE = "DELETE FROM Alumnos WHERE No_Control=?;";
    private static final String SQL_SELECT = "SELECT No_Control, Nombre, Carrera, Contrasena FROM Alumnos;";

    //Consultas para la tabla Registros
    private static final String SQL_INSERT_REGISTRO = "INSERT INTO Registros(No_Control, Nombre, Carrera, Fecha, Entrada_Salida, CasilleroID) VALUES(?,?,?,GETDATE(),?,?);";
    private static final String SQL_DELETE_REGISTRO = "DELETE FROM Registros WHERE No_Control=?;";
    private static final String SQL_SELECT_REGISTRO = "SELECT No_Control, Nombre, Carrera, Fecha, Entrada_Salida, CasilleroID FROM Registros;";

    //Consultas para la tabla AlumnosITNL
    private static final String SQL_SELECT_ALUMNOSITNL = "SELECT  No_Control, Nombre, Carrera, Semestre  FROM Alumnos WHERE No_Control=?;";

    public int insertAlumno(int no_control, String nombre, String carrera, int contrasena) throws SQLException {
        PreparedStatement st = null;
        Connection conn = null;
        int rows = 0;
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(SQL_INSERT);
            int indice = 1;
            st.setInt(indice++, no_control);
            st.setString(indice++, nombre);
            st.setString(indice++, carrera);
            st.setInt(indice, contrasena);
            rows = st.executeUpdate();
            System.out.println("Registros insertados en tabla Alumnos(INSERT): " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    public int insertRegistro(int no_control, String nombre, String carrera,
            String entrada_salida, int idcasillero)
            throws SQLException {
        PreparedStatement st = null;
        Connection conn = null;
        int rows = 0;
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(SQL_INSERT_REGISTRO);
            int indice = 1;
            st.setInt(indice++, no_control);
            st.setString(indice++, nombre);
            st.setString(indice++, carrera);
            st.setString(indice++, entrada_salida);
            st.setInt(indice++, idcasillero);
            rows = st.executeUpdate();
            System.out.println("Registros insertados en tabla Registros(INSERT): " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        
        return rows;
        
        
    }

    public int updateAlumno(int no_control, String nombre, String carrera, int contrasena)
            throws SQLException {
        PreparedStatement st = null;
        Connection conn = null;
        int rows = 0;
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(SQL_UPDATE);
            int indice = 1;
            st.setString(indice++, nombre);
            st.setString(indice++, carrera);
            st.setInt(indice++, contrasena);
            st.setInt(indice, no_control);
            rows = st.executeUpdate();
            System.err.println("Registros actualizados en tabla Alumnos(UPDATE): " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    public int deleteAlumno(int no_control) throws SQLException {
        PreparedStatement st = null;
        Connection conn = null;
        int rows = 0;
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(SQL_DELETE);
            st.setInt(1, no_control);
            rows = st.executeUpdate();
            System.err.println("Registros eliminados en tabla Alumnos(DELETE): " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    public int deleteRegistro(int no_control) throws SQLException {
        PreparedStatement st = null;
        Connection conn = null;
        int rows = 0;
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(SQL_DELETE_REGISTRO);
            int indice = 1;
            st.setInt(indice, no_control);
            rows = st.executeUpdate();
            System.err.println("Registros eliminados en tabla Registros(DELETE): " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    //METODOS PARA REGISTRAR UN ALUMNO DE BASE DE DATOS ORIGINAL (AlumnoITNL) A BASE DE DATOS DE BID (Alumno)
    public void selectAlumnoITNL(int usuarioVar, int contrasenaVar) throws SQLException {
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        String nombre;
        String carrera;
        int usuario = usuarioVar;
        int contrasena = contrasenaVar;

        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(
                    "SELECT  No_Control, Nombre, Carrera, Semestre  FROM AlumnosITNL WHERE No_Control=" + usuario + ";"
            );
            rs = st.executeQuery();
            while (rs.next()) {
                nombre = rs.getString(2);
                carrera = rs.getString(3);
                RegLog.RegistrarAlu(usuario, nombre, carrera, contrasena);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "debugear 2");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
    }
    
    
//METODO PARA BUSCAR SI EL ALUMNO YA ESTA REGISTRADO EN LA TABLA Alumno BID
    public boolean BuscarAnteriorRegistro(int usuarioVar) throws SQLException {
        boolean resultado = true;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        int usuario = usuarioVar;
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(
                    "Select * from Alumno where No_control =' " + usuario + " ' "
            );

            rs = st.executeQuery();
            if (rs.next()) {
                resultado = false;

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "debugear 1");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        return resultado;
    }

    //MÉTODO QUE DETERMINA SI EL ALUMNO NO SE ENCUENTRA REGISTRADO EN LA BASE DE DATOS DE LA ESCUELA
    public boolean BuscarEnAlumnosITNL(int usuarioVar) throws SQLException {
        boolean resultado = false;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        int usuario = usuarioVar;

        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(
                    "Select * from AlumnosITNL where No_control =' " + usuario + " ' "
            );

            rs = st.executeQuery();
            if (rs.next()) {
                resultado = true;

            } else {
                RegLog.mensajeNoExisteEnAlumnosITNL();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "debugear 1");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }

        return resultado;
    }

    /// METODOS PARA INGRESAR (Alumno)
    public boolean BuscarEnAlumnos(int usuarioVar, int contrasenaVar) throws SQLException {
        boolean resultado = false;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        int usuario = usuarioVar;
        int contrasena = contrasenaVar;

        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(
                    "Select * from Alumno where No_Control ='" + usuario + "' and Contrasena ='" + contrasena + " ' "
            );
            rs = st.executeQuery();
            if (rs.next()) {
                resultado = true;
            } else {
                IngLog.mensajeNoExisteEnAlumnosBID();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }

        return resultado;
    }

     /// METODOS PARA INGRESAR (ADMINISTRADOR)
    public boolean BuscarEnCoordinador(int usuarioVar, int contrasenaVar) throws SQLException {
        boolean resultado = false;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        int usuario = usuarioVar;
        int contrasena = contrasenaVar;

        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(    
                    "Select * from Coordinador where AdminID ='" + usuario + "' and Contraseña ='" + contrasena + " ' "
            );
            rs = st.executeQuery();
            if (rs.next()) {
                resultado = true;
            } else {
                IngLog.mensajeNoExisteEnAlumnosBID();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        return resultado;
    }

          
      //METODOS PARA INGRESAR AL CASILLERO
      
      //METODO PARA BUSCAR SI YA EXISTE UN ANTERIOR REGISTRO DEL ALUMNO EN LOS CASILLEROS
      public boolean BuscarEnRegistro(int usuarioVar) throws SQLException {
        boolean resultado = false;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        int usuario = usuarioVar;
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(    
                    "Select * from Registros where No_Control =' " + usuario + " '  ORDER BY Fecha  " 
            );
            rs = st.executeQuery();
            if (rs.next()) { 
                resultado = true;
            } 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar registro en la tabla Registros");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        return resultado;
    }
  
      //METODO PARA ASIGNAR SI ES UNA ENTRADA O UNA SALIDA
      public String AsignarEsntradaOSalida(int usuarioVar) throws SQLException{
        String resultado = null;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null; 
        int usuario = usuarioVar;
        int vecesRepetidas = 0 ;
        
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
     
            st = conn.prepareStatement(
                 "SELECT COUNT(No_Control) FROM Registros WHERE No_Control = ' " + usuario + " ' "
            );
            
            rs = st.executeQuery();
         if(rs.next()) {
             vecesRepetidas = rs.getInt(1);
         }
         
         if(vecesRepetidas == 1){
              //primer salida
             resultado =  "S";
         }else if(vecesRepetidas % 2 == 0){//si el numero de registros es par la siguiente será una entrada
             
                resultado = "E";
                
            }else{//si el numero de registros es impar la siguiente será una salida
             
                resultado = "S";       
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en  AsignarEsntradaOSalida");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        return resultado;
      }
      
      //METODO PARA INSERTAR UN REGISTRO
       public void insertarNuevoRegistro(int usuarioVar, String entrada_salida, int idcasillero) throws SQLException, ArduinoException, SerialPortException {
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;
        String nombre;
        String carrera;
        int usuario = usuarioVar;
        String estado = entrada_salida;
        int casillero = idcasillero;

        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            st = conn.prepareStatement(
                    "SELECT  No_Control, Nombre, Carrera FROM Alumno WHERE No_Control=" + usuario + ";"
            );
            rs = st.executeQuery();
            while (rs.next()) {
                nombre = rs.getString(2);
                carrera = rs.getString(3);
                RegLog.RegistrarIngreso(usuario, nombre, carrera, estado, casillero);
                        }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "debugear 2");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        } 
    }

       //regresa el total de casilleros registrados en la tabla Casilleros
    public int TotalCasillero() {
      int resultado = 0;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null; 

        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
     
            st = conn.prepareStatement(
                 "SELECT COUNT(CasilleroID) FROM Casilleros"
            );
            rs = st.executeQuery();
      
              if(rs.next()) {
            resultado = rs.getInt(1);
         }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en  TotalCasillero");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        
        return resultado;
    }

    public boolean DisponibilidadDeCasillero(int numeroDeCasillero) {
         boolean resultado = false;
         String estadoDeCasillero = null;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null; 
        int casilleroID = numeroDeCasillero;

        
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
     
            st = conn.prepareStatement(
                 "select TOP 1  Entrada_Salida from Registros where CasilleroID = ' " + casilleroID + " ' ORDER  BY Fecha  DESC"
            );
            rs = st.executeQuery();
      
              if(rs.next()) {
            estadoDeCasillero = rs.getString(1);
         }
              
              if("E".equals(estadoDeCasillero)){
                  resultado = false;
              
              }else if ("S".equals(estadoDeCasillero)){
                  resultado = true;
              } else if (estadoDeCasillero == null){
                    resultado = true;
              }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en  TotalCasillero");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        
        return resultado;
    }

    public int BuscarCasilleroOcupado(int usuarioFinal, String estado) {
        int usuarioVar  = usuarioFinal;
        String estadoVar = estado;
         int resultado = 0;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null; 

        
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
     
            st = conn.prepareStatement(
                 "select TOP 1  CasilleroID from Registros where No_Control = " + usuarioVar+
                 " and Entrada_Salida = 'E' ORDER  BY Fecha  DESC"
            );
            rs = st.executeQuery();
      
              if(rs.next()) {
            resultado = rs.getInt(1);
         }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en  TotalCasillero");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        
        return resultado;
    }

    
    //ACTUALIZA EL ESTADO DEL CASILLERO
    public void actualizarEstado(int casilleroID, String estadoCasillero) {
        int casillero  = casilleroID;
        String estado = estadoCasillero;
        String estadoFinal = null;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null; 
        
        if("E".equals(estado)){
        estadoFinal = "ocupado";
        }else if("S".equals(estado)){
        estadoFinal = "desocupado";    
        }
        
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
            
            st = conn.prepareStatement(
               " UPDATE Casilleros SET estado = '"+estadoFinal+"' WHERE CasilleroID =  '" +casillero+ "'"
            );
            st.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al actualizar estado de casillero");
        } finally {
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
    }
    
    public boolean casillerosDesocupados() {      
        boolean resultado = false;
        PreparedStatement st = null;
        Connection conn = null;
        ResultSet rs = null;  
        
        try {
            conn = (this.usercon != null) ? this.usercon : Conexion.getConexion();
     
            st = conn.prepareStatement(
                    "select * from Casilleros where estado = 'desocupado' "
            );
            rs = st.executeQuery();
         if(rs.next()) {
             resultado  = true;
         }else{
             resultado = false;
         }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al buscar casilleros desocupados");
        } finally {
            Conexion.close(rs);
            Conexion.close(st);
            if (this.usercon != null) {
                Conexion.close(conn);
            }
        }
        return resultado;
    }
    
}
    
