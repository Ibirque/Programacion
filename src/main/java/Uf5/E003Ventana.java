
package Uf5;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class E003Ventana extends JFrame{

    public E003Ventana(String title) throws HeadlessException {
        super(title);
        Dimension d = new Dimension(500,500);
        this.setSize(d);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Posicionamos
        this.setLocation(300, 300);
    }
    
    
}
