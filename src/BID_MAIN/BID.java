package BID_MAIN;

import B_I_D.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class BID {

    public static void main(String[] args) {
//    PantallaPrincipal PP = new PantallaPrincipal();
//  PP.setVisible(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SplashScreen SS = new SplashScreen();
            SS.setSize(660, 376);
            SS.setLocationRelativeTo(null);
            SS.setVisible(true);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar programa");
        }

    }
    
}
