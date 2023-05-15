package Uf5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class E005Panel extends JFrame {

    //constructor
    public E005Panel(String title) throws HeadlessException {
        super(title);
        setSize(500, 500);
        //Podemos configurar un tamaño minimo
        setMinimumSize(new Dimension(200, 200));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //llamada a iniciarComponentes
        iniciarComponentes();
    }

    //método para inicializar otros componentes
    public void iniciarComponentes(){
        JPanel panel = new JPanel();
        //este panel no esta sobre la ventana
        this.getContentPane().add(panel);
        
        panel.setBackground(Color.red);
    }
    
}
