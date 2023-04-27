package proyectos.Nacef;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class E005PanelUF5 extends JFrame {
    
    //constructor
    public E005PanelUF5(String title) throws HeadlessException {
        super(title);
        setSize(500,500);
        //podemos un atmaño minimo
        setMinimumSize(new Dimension(200,200));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //llamada a iniciarComponentes
        iniciarComponentes();
    }
    
    //método para inicializar otro componentes
    public void iniciarComponentes(){
        JPanel panel = new JPanel();
        //este panel no está sobre la ventana
        this.getContentPane().add(panel);
        
        panel.setBackground(Color.blue);
    }
    
}
