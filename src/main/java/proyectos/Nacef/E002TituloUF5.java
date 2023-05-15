package proyectos.Nacef;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class E002TituloUF5 extends JFrame{

    //constructores
    
    
    public E002TituloUF5() throws HeadlessException {
        Dimension d = new Dimension(500,500);
        this.setSize(d);
    }

    public E002TituloUF5(String title) throws HeadlessException {
        super(title);
        Dimension d = new Dimension(500,500);
        this.setSize(d);
        //gestion del aspa (X)
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
}
