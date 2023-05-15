
package Uf5;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class E001Ventana extends JFrame{

    public E001Ventana() throws HeadlessException {
        //dar medidas a la ventana
        Dimension d = new Dimension(500, 500);
        this.setSize(d);
    }
    
}
