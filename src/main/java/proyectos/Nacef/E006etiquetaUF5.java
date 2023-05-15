package proyectos.Nacef;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class E006etiquetaUF5 extends JFrame {
    
    //constructor
    public E006etiquetaUF5(String title) throws HeadlessException {
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
        
        //layout
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        panel.setBackground(Color.blue);
        
        //crear etiqueta
        JLabel etiqueta = new JLabel(); //constructor simple
        //constructor
        //JLabel etiquetaMolona = new JLabel("Etiqueta Molona");
        panel.add(etiqueta);
        
        etiqueta.setText("Etiqueta básica con texto");
        
        etiqueta.setBounds(50,50,250,30);
        
        etiqueta.setForeground(Color.red);
        
    }
    
}
