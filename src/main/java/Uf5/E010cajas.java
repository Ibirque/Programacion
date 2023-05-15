
package Uf5;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class E010cajas extends JFrame{
    public JPanel panel;

    public E010cajas(String title) throws HeadlessException {
        super(title);
        //setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        crearComponentes();        
    }

    private void crearComponentes() {
        crearPanel();
        crearCajas();
        crearAreaTexto();
        crearListas();
    }
    
    private void crearPanel(){
        panel = new JPanel();
        //desactivar el layout del panel si procede
        panel.setLayout(null);
        panel.setBackground(new Color(189,223,179));
        this.getContentPane().add(panel);
    }
    
    private void crearCajas(){
        //crear caja de texto de una sola linea
        JTextField caja = new JTextField();
        //introducir texto
        caja.setText("Texto molón de una línea");
        
        //obtener el valor de la caja de texto
        System.out.println("La caja de texto dice: " + caja.getText());
        panel.add(caja);
        caja.setBounds(50, 50, 200, 30);
    }
    
    private void crearAreaTexto(){
        JTextArea area = new JTextArea();
        panel.add(area);
        area.setText("Introduce un texto:");
        //si pongo otro, sobreescribo el anterior        
        //area.setText("intro otro txt:");
        area.append("\nOtro dexto distinto");
        //editar el contenido
        area.setEditable(true);
        System.out.println("El texto del area es: "+area.getText());
        area.setBounds(50, 100, 200, 200);
    }
    
    private void crearListas(){
        //JComboBox lista = new JComboBox();
        //crear array con los elementos de la lista
        String[] ciudades = {"Barcelona", "Madrid", "Valenica"};        
        JComboBox ciudad = new JComboBox(ciudades);
        
        ciudad.setBounds(50, 350, 300, 25);
        //añadir elementos a la lista
        ciudad.addItem("Bilbao");
        //cambiar el objeto por defecto
        ciudad.setSelectedItem("Bilbao");
        panel.add(ciudad);
    }
    
}
