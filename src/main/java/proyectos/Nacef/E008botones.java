package proyectos.Nacef;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class E008botones extends JFrame{

    
    public JPanel panel;
    
    public E008botones(String title) throws HeadlessException {
        
        //constructor de ventana
        super(title);
        setVisible(true);
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        crearComponentes();
    }
    
    //crear componentes
    public void crearComponentes(){
        crearPanel();
        crearEtiquetas();
        crearBotones();
    }
    
    public void crearPanel(){
       // JPanel panel = new JPanel();
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(189,223,179));
         this.getContentPane().add(panel); 
    }
    
    public void crearEtiquetas(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Butones molones");
        etiqueta.setBounds(20, 20, 150, 30);
        etiqueta.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(etiqueta);
    }
    
    //Crear Botones
    public void crearBotones(){
        JButton boton = new JButton("Botón brutal");
        //también se ouede establecer el texto con setText("blabla");
        
        //si el diseño del panel está desactivado, damos coordenadas al botón
        boton.setBounds(20,50,150,50);
        
        //otros métodos especificos de botones
        boton.setEnabled(true);//con false, está inactivo, no es clicable
        boton.setMnemonic('q');//permite clica con ALT + tecla
        
        //color fuente
        boton.setForeground(Color.orange);
        //fuente
        boton.setFont(new Font("calibri", Font.PLAIN, 20));
        
        panel.add(boton);
        
        //BOTÓN IMAGEN!!!
        ImageIcon img = new ImageIcon("1.jpg");
        JButton pic = new JButton(img);
        panel.add(pic);
        pic.setBackground(Color.CYAN);
        pic.setIcon(new ImageIcon(img.getImage().getScaledInstance(100, 60, Image.SCALE_SMOOTH)));
        pic.setBounds(20, 120, 100, 60);
        
    }
}
