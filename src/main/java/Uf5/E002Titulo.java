package Uf5;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class E002Titulo extends JFrame {

    //constructor
    public E002Titulo() throws HeadlessException {
        Dimension d = new Dimension(500, 500);
        this.setSize(d);
    }

    public E002Titulo(String title) throws HeadlessException {
        super(title);
        //tambien hacemos algo mas
        Dimension d = new Dimension(500, 500);
        this.setSize(d);
        //gestion del aspa (X)
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
