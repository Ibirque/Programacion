
package proyectos.ejemplos;

import javax.swing.JOptionPane;


public class E011 {

    public static void main(String[] args) {
        String mensaje = JOptionPane.showInputDialog("Introduce tu mensaje:");
        System.out.println(mensaje);
        JOptionPane.showMessageDialog(null, "Este es tu mensaje: " + mensaje);
    }
    
}
