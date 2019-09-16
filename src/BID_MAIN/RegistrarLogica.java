package BID_MAIN;

import com.panamahitek.ArduinoException;
import conexiondepurada.BidArduino;
import conexiondepurada.BidJDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jssc.SerialPortException;

public class RegistrarLogica {

    public static BidJDBC objeto = new BidJDBC();
    public  static BidArduino arduino = new BidArduino();

    static ResultSet resultadoSet;

    public void extraerDatos(int usuario, int contrasena) throws SQLException {
        int usuarioVar = usuario;
        int contrasenaVar = contrasena;
        objeto.selectAlumnoITNL(usuarioVar, contrasenaVar);
    }

    public void RegistrarAlu(int usuario, String nombre, String carrera, int contrasena) throws SQLException {
        objeto.insertAlumno(usuario, nombre, carrera, contrasena);
    }

    public void RegistrarIngreso(int usuario, String nombre, String carrera, String estado, int casillero) throws SQLException, ArduinoException, SerialPortException {
 int casilleroID = casillero;
 String estadoCasillero = estado;
        
         
        objeto.insertRegistro(usuario, nombre, carrera, estado, casillero);//realiza el registro final
        
        objeto.actualizarEstado(casilleroID, estadoCasillero);//actualiza el estado del casillero 
        
    //    arduino.activateBluetooth();
    }

    //_________________________________________________________//
    ///////////////////////////////////////////////////////// M E N S A J E S //////////////////////////////////////////////
    //-------------------------------------------------------------------------------------------------
    public void mensajeRegistrado() {
        JOptionPane.showMessageDialog(null, "Usted fue registrado con exito");
    }

    public void mensajeNoExisteEnAlumnosITNL() {
        JOptionPane.showMessageDialog(null, "Usted no existe en  la base de datos del Instituto Tecnologico de Nuevo Leon");
    }

}
