package conexiondepurada;

import java.util.logging.Level;
import java.util.logging.Logger;

import jssc.SerialPort;
import jssc.SerialPortException;

public class BidArduino {
    
    public  void activateBluetooth() {
        String str;

        //In the constructor pass the name of the port with which we work
        try {
            SerialPort serialPort = new SerialPort("COM8");
            //Open port
            serialPort.openPort();
            //We expose the settings. You can also use this line - serialPort.setParams(9600, 8, 1, 0);
            
            serialPort.setParams(9600, 8, 1, 0);        
            serialPort.writeBytes("2".getBytes());
            System.err.println("abierto");        
            Thread.sleep(1000);//Very important !!!
    
            //Closing the port
            serialPort.closePort();        
          //  cerrarPuerta();
 
       } catch (SerialPortException | InterruptedException ex) {
            System.out.println("Falló conexión a Bluetooth HC-05s");
        }
    }

    private void cerrarPuerta() {
        try {
            SerialPort serialPort = new SerialPort("COM8");
            serialPort.openPort();
            serialPort.setParams(9600, 8, 1, 0);
             serialPort.writeBytes("1".getBytes());       
             System.out.println("cerrao"); 
            Thread.sleep(500);//Very important !!!
            
             serialPort.closePort();
         } catch (Exception e) {
            System.out.println(e);
         }
}

}