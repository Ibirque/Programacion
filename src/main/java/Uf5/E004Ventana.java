
package Uf5;

import java.awt.HeadlessException;
import javax.swing.JFrame;


public class E004Ventana extends JFrame{

    public E004Ventana(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //dimension + posicion
        this.setBounds(300, 300, 500, 500);
        
        //centrar la ventana en el navegador
        this.setLocationRelativeTo(null);
        //el componente null es el padre
    }
    
    
}
