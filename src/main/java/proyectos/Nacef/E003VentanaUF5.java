package proyectos.Nacef;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class E003VentanaUF5 extends JFrame {
    
    //constructor

    public E003VentanaUF5(String title) throws HeadlessException {
        super(title);
        Dimension d = new Dimension(500,500);
        this.setSize(d);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //posicionamos
        this.setLocation(300,300);
    }
    
}
