package Uf5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class E007Etiqueta extends JFrame {

    //constructor
    public E007Etiqueta(String title) throws HeadlessException {
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
        
        //layout
        panel.setLayout(null);
        
        
        this.getContentPane().add(panel); 
        
        panel.setBackground(Color.CYAN);
        
        //crear etiqueta
        //JLabel etiqueta = new JLabel(); //Constructor simple
        //constructor parametrizado
        //panel.add(etiqueta);
        
        
        //Crear etiqueta con otro constructor
        JLabel etiqueta = new JLabel("Etiqueta alineada", SwingConstants.CENTER);
        panel.add(etiqueta);
        
        etiqueta.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        
        //JLabel etiquetaMolona = new JLabel("Etiqueta Molona");
        etiqueta.setText("Etiqueta básica con texto");
        //desabilitar el layout del panel para controlar las etiquetas
        etiqueta.setBounds(50, 50, 250, 30);
        //cambiar el color del texto
        etiqueta.setForeground(Color.YELLOW);
        //desactivar el layout de la etiqueta
        etiqueta.setOpaque(true); //por defecto tiene el valor false
        //cambiar fondo etiqueta
        etiqueta.setBackground(Color.PINK); //no funciona porque hay que desactivar el layour por defecto de la etiqueta
        
        //fuente y tamaño de la fuente
        etiqueta.setFont(new Font("arial", Font.ITALIC, 20));
    }
    
}
