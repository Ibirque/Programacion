package proyectos.Nacef;

import java.awt.HeadlessException;
import javax.swing.JFrame;


public class E004VentanaUF5 extends JFrame {

    //constructor
    
    public E004VentanaUF5(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //dimensión + posición
        //this.setBounds(300,300,500,500);
        //centrar la ventana en ele navegador
        this.setLocationRelativeTo(null);
        //el componente null es el padre
    }
    
    
    
    
}
