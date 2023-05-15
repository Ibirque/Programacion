package proyectos.Nacef;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class E011ListenersUF5 extends JFrame{
    
    private JPanel panel;
    private JTextField caja;

    public E011ListenersUF5(String title) throws HeadlessException {
        super(title);
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        crearComponentes();
    }
    
    private void crearComponentes(){
        crearPanel();
        crearLabel();
        crearCajaTexto();
        crearBoton();
    }
    
    private void crearPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void crearLabel(){
        JLabel texto = new JLabel("Como te llamas ?");
        texto.setBounds(20, 20, 2000, 30);
        texto.setFont((new Font("Calibri", Font.BOLD, 20)));
        panel.add(texto);
        
    }
    
    private void crearCajaTexto(){
            caja = new JTextField();
            panel.add(caja);
            caja.setBounds(20,60,200,30);
        }
    
    private void crearBoton(){
        JButton boton = new JButton("Contestar");
        panel.add(boton);
        boton.setBounds(20, 100, 100, 30);
        
        JLabel respuesta = new JLabel();
        panel.add(respuesta);
        respuesta.setBounds(20, 150, 200, 30);
        respuesta.setFont((new Font("Calibri", Font.BOLD, 20)));
        
        //añadir evento
        //listanea al botón
        //necesito un parametro action listener
        //creo el objeto
        ActionListener ejemmploListener = new ActionListener() {
            //esta instancia no es posible po ser interfaz
            //hay que implementar todos los métodos abstractos de interfaz
            @Override
            public void actionPerformed(ActionEvent e) {
                //lo que quiero que pase al pulsar el boton
                respuesta.setText(("Hola " + caja.getText()));
            }
        };
        //falta el parámetro
        boton.addActionListener(ejemmploListener);
    }
    
}
