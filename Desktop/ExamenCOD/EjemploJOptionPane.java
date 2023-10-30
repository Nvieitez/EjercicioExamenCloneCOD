package ejemplojoptionpane;

import javax.swing.JOptionPane;

public class EjemploJOptionPane {

public static void main(String[] args) {
    
// Pedir datos
    float dato = Float.parseFloat(JOptionPane.showInputDialog("teclea el número deseado"));
    //System.out.println(dato);
    
// Mostramos con JOptionPane
    JOptionPane.showMessageDialog(null, "El dato es = "+ dato);
    
    }
}
