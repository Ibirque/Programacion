package Uf5;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class E013Listeners extends JFrame {

    private JPanel panel;
    private JTextArea area;
    private JLabel respuesta;
    private JButton boton;
    private JTextField caja;

    public E013Listeners(String title) throws HeadlessException {
        super(title);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        crearComponentes();
    }

    private void crearComponentes() {
        crearPanel();
        crearCajaTexto();
        crearAreaTexto();
        crearBoton();
    }

    private void crearPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

    }

    private void crearAreaTexto() {
        area = new JTextArea();
        panel.add(area);
        area.setBounds(200, 20, 250, 300);
    }

    /*
    private void crearLabel() {
        JLabel texto = new JLabel("¿Como te llamas?");
        texto.setBounds(20, 20, 200, 30);
        texto.setFont(new Font("Calibri", Font.BOLD, 20));
        panel.add(texto);
    }
     */
    private void crearCajaTexto() {
        caja = new JTextField();
        panel.add(caja);
        caja.setBounds(20, 20, 150, 30);

        //Aqui ocurrira el evento de teclado
        listenerTeclado();
    }

    private void crearBoton() {
        boton = new JButton("Contestar");
        panel.add(boton);
        boton.setBounds(20, 400, 100, 30);

        respuesta = new JLabel();
        panel.add(respuesta);
        respuesta.setBounds(20, 300, 100, 30);
        respuesta.setFont(new Font("Calibri", Font.BOLD, 20));

        // eventListener();
        eventoRaton();
    }

    /*
    private void eventListener(){
        
        ActionListener ejemploListener = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               
                respuesta.setText("Hola "+caja.getText());
            }
        };
        //falta el parametro
        boton.addActionListener(ejemploListener);
    }
     */
    private void eventoRaton() {
        //sobre quien va a suceder el evento?
        MouseListener listenerRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                area.append("Has hecho un mouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                area.append("Has hecho un Pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                area.append("Has hecho un mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                area.append("Has hecho un mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                area.append("Has hecho un mouseExited\n");
            }
        };
        boton.addMouseListener(listenerRaton);
    }

    private void listenerTeclado() {
        //Pasar objeto del tipo keylistener
        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //presionar caracteres unicode (letras, numeros y simbolos)
                area.append("Has presionado alguna tecla unicode - keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Presionar cualquier tecla
                area.append("Has presionado alguna tecla - keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //Liberar cualquier tecla
                area.append("Has liberado alguna tecla - keyReleased\n");
                if(e.getKeyChar()=='p'){
                    area.append("Letra p\n");
                }
                if(e.getKeyChar()==' '){
                    area.append("Espacio\n");
                }
                    
            }
        };
        caja.addKeyListener(eventoTeclado);
    }
}
