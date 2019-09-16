package BID_MAIN;

import com.panamahitek.ArduinoException;
import conexiondepurada.BidJDBC;
import java.sql.*;
import javax.swing.JOptionPane;
import jssc.SerialPortException;

/**
 *
 * Esta clase contiene los metodos para ingresar (ya sea mediante una entrada o
 * una salida) al casillero. se determina si el ingreso es una entrada o una
 * salida. si es una entrada se asigna un casillero random, si es una salida se
 * registra el mismo casillero que la entrada
 *
 * @author: José G. Aguilar
 *
 * @version: 08/05/2018
 *
 */
public class IngresoLogica {

    static ResultSet resultadoSet;
    public static BidJDBC objeto = new BidJDBC();

    /**
     * IniciasSesionAdm: METODO QUE DETERMINA SI ES UNA ENTRADA O UNA SALIDA
     *
     * @param usuario; el numero de usuario ingresado por el administrador
     * @param contrasena; la contraseña ingresada por el administrador
     * @return resultado; determina si el administrador existe en la tabla
     * "Coordinador"
     * @throws java.sql.SQLException
     */
    public boolean iniciarSesionAdm(String usuario, String contrasena) throws SQLException {
        boolean resultado = false;

        try {
            resultadoSet = Conexiones.conexion.Consulta(
                    "Select * from Coordinador where AdminID ='" + usuario + "' and Contraseña ='" + contrasena + "'");

            if (resultadoSet.next()) {
                resultado = true;
            } else {
                JOptionPane.showMessageDialog(null, "Usiario y/o contraseña incorrecta ");
                resultado = false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se establece la conexión"
                    + e.getMessage(), "Error de Conexión", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }//Cierre del método iniciarSesionAdm

    public void mensajeNoExisteEnAlumnosBID() {
        JOptionPane.showMessageDialog(null, "Usiario y/o contraseña incorrecta");
    }

    /**
     * AsignarEntradaOSalidaLogica: METODO QUE BUSCA EN LA TABLA REGISTROS EL
     * NUMERO DE REGISTROS QUE HA DADO UN USUARIO Y DETERMINA SI ES UNA ENTRADA
     * O UNA SALIDA
     *
     * @param usuario numero de control ingresado por el estudiante; usado para
     * buscar sus registros anteriores
     * @throws java.sql.SQLException
     * @throws com.panamahitek.ArduinoException
     * @throws jssc.SerialPortException
     */
    public void AsignarEntradaOSalidaLogica(int usuario) throws SQLException, ArduinoException, SerialPortException {
        int usuarioVar = usuario;
        String estado = null;

        if (objeto.BuscarEnRegistro(usuarioVar) == true) {//Busca anteriores registros del alumno en la tabla(Registros) si no tiene alguno se le asigna la primer entrada

            estado = objeto.AsignarEsntradaOSalida(usuarioVar); //a la variabe estado se le asigna el método que regresa un string("E" ó "S")
            //System.out.println("se registró una " + estado);
        } else {
            //primer entrada
            estado = "E";
        }

        if ("E".equals(estado)) {  //si se detecta una entrada se asigna un casillero random  con el metodo AsignarCasilleroRandom(usuarioVar, estado);
            AsignarCasilleroRandom(usuarioVar, estado);
        } else if ("S".equals(estado)) {    //si se detecta una salida se desocupa el casillero  con el metodo  DesocuparCasillero(usuarioVar, estado);
            DesocuparCasillero(usuarioVar, estado);
        }
    }//Cierre del método AsignarEntradaOSalidaLogica

    /**
     * AsignarCasilleroRandom: METODO QUE GENERA UN NUMERO RANDOM LO IGUALA AL
     * ID DEL CASILLERO Y POSTERIORMENTE VERIFICA QUE ESTÉ DISPONIBLE SI ESTA
     * DISPONIBLE SE ASIGNA ESE CASILLERO SI NO ESTA DISPONIBLE SE VUELVE A
     * LLAMAR AL METODO
     *
     * @param usuarioVar numero de control ingresado por el estudiante;
     * @param estado estado en el que se encontrará el siguiente casillero (entrada)
     * @throws java.sql.SQLException
     */
    public void AsignarCasilleroRandom(int usuarioVar, String estado) throws SQLException, ArduinoException, SerialPortException {
        int usuarioFinal = usuarioVar;
        String estadoFinal = estado;
        int maxCasilleros = 0;
        int numeroDeCasillero = 0;

        if (objeto.casillerosDesocupados() == true){
            
        
        
        
        maxCasilleros = objeto.TotalCasillero();//llama a metodo que regresa un int del total de casilleros
        numeroDeCasillero = (int) Math.floor(Math.random() * (maxCasilleros) + 1);//crea un numero random entre el 1 y el maxCasilleros( 10 )

        if (objeto.DisponibilidadDeCasillero(numeroDeCasillero) == true) {//si el casillero está disponible se inserta un nuevo registro con los parametros establecidos

            //casillero desocupado
                 
            JOptionPane.showMessageDialog(null, "Bienvenido " + usuarioFinal + " su casillero es el " + numeroDeCasillero, "BID", JOptionPane.INFORMATION_MESSAGE);
            objeto.insertarNuevoRegistro(usuarioFinal, estadoFinal, numeroDeCasillero);//llama al metodo que inserta un nuevo registro (entrada)
       
        } else {//si el casillero no está disponible se vuelve a llamar a este método, para generar un nuevo numero random
            System.out.println("el casillero " + numeroDeCasillero + " estaba ocupado, espere...");
            //casillero ocupado
            AsignarCasilleroRandom(usuarioVar, estado);
        }
        
        }else {
            JOptionPane.showMessageDialog(null, "todos los casilleros estan ocupados");
        }

    }//Cierre del método AsignarCasilleroRandom

    /**
     * DesocuparCasillero: METODO QUE BUSCA EL CASILLERO OCUPADO POR EL ESTUDIANTE,
     * QUE INSGRESÓ SU MATRICULA, Y LO DESOCUPA
     *
     * @param usuarioVar numero de control ingresado por el estudiante;
     * @param estado estado en el que se encontrará el siguiente casillero (salida)
     * @throws java.sql.SQLException
     */
    private void DesocuparCasillero(int usuarioVar, String estado) throws SQLException, ArduinoException, SerialPortException {
        int usuarioFinal = usuarioVar;
        String estadoFinal = estado;
        int numeroDeCasilleroADesocupar = 0;

        numeroDeCasilleroADesocupar = objeto.BuscarCasilleroOcupado(usuarioFinal, estadoFinal);//metodo que busca el numero del casillero ocupado

        JOptionPane.showMessageDialog(null, "Gracias por usar BID, desocupó el casillero " + numeroDeCasilleroADesocupar, "BID", JOptionPane.INFORMATION_MESSAGE);

        objeto.insertarNuevoRegistro(usuarioFinal, estadoFinal, numeroDeCasilleroADesocupar);//llama al método que inserta un nuevo registro (salida)
    }//Cierre del método DesocuparCasillero

} //Cierre de la clase

