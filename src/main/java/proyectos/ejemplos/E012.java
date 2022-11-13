
package proyectos.ejemplos;

import javax.swing.JOptionPane;


public class E012 {

    public static void main(String[] args) {
        //int num = JOptionPane.showInputDialog("Introduce un número:");
        //da error porque por defecto recibe un String
        //hay que hacer una conversión de tipo de dato
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
        System.out.println(num);
       

    }
    
}
