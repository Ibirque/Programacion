package proyectos.ibirque;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;

/**
 * OBJETIVOS: Introducir artículo, precio y se da a "siguiente articulo"
 * (boton1) Al pulsar el boton el articulo pasa al area de texto de "articulos
 * comprados" y el precio acumulado pasa al label de "importe parcial" Con cada
 * nuevo articulo se añade al area de texto el nuevo nombre, pero el importe
 * acumulado se sobreescribe Cuando se introduzca el ultimo articulo, se da a
 * "Total" y en el area de texto aparece la lista de artículos, el precio total,
 * el IVA y el precio con IVA resaltado de alguna forma PROPUESTA DE MEJORA:
 * Eliminar un articulo antes de dar al total Añadir un Combobox y un Boton Los
 * articulos que se van añadiendo al TextArea se añaden al ComboBox Si se
 * selecciona un articulo del Combo y se da a Eliminar, debe desaparecer el
 * articulo del area de texto y el combo, y el precio debe restarse del
 * acumulado
 */
public class PardoIbirqueTienda extends javax.swing.JFrame {

    //Creamos un arrayList para almacenar todos los datos
    //Vamos a reutilizar una public class creada para un ejercicio anterior
    ArrayList<PardoIbirqueFac> lista = new ArrayList();
    float precioTotal =  0.0f;

    public PardoIbirqueTienda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Etiqueta1 = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        Boton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        Etiqueta3 = new javax.swing.JLabel();
        Etiqueta2 = new javax.swing.JLabel();
        TextField2 = new javax.swing.JTextField();
        Boton1 = new javax.swing.JButton();
        ComboBox1 = new javax.swing.JComboBox<>();
        Boton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Etiqueta1.setText("Artículo:");

        Boton2.setBackground(new java.awt.Color(51, 255, 204));
        Boton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Boton2.setText("Total");

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        TextArea1.setText("Artículos comprados:");
        jScrollPane1.setViewportView(TextArea1);

        Etiqueta3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Etiqueta3.setText("...importe parcial");

        Etiqueta2.setText("Precio");

        Boton1.setBackground(new java.awt.Color(0, 255, 204));
        Boton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Boton1.setText("Siguiente Artículo");
        Boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton1MouseClicked(evt);
            }
        });

        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        Boton3.setBackground(new java.awt.Color(255, 153, 153));
        Boton3.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Etiqueta2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Etiqueta3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(Etiqueta1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Boton1)
                        .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Etiqueta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(Etiqueta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton3)
                .addGap(41, 41, 41)
                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Etiqueta1)
                        .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Boton1)
                            .addGap(0, 227, Short.MAX_VALUE)))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseClicked
        // Boton 1 se encarga de registrar todos los datos
        TextArea1.setText("");
        Registrar();
        Imprimir();        
        

    }//GEN-LAST:event_Boton1MouseClicked

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed

    }//GEN-LAST:event_ComboBox1ActionPerformed

    public void Registrar() {
        //Variables
        String Area1 = TextField1.getText();
        String Area2 = TextField2.getText();
        PardoIbirqueFac x = new PardoIbirqueFac("", 1, 0); //Cantidad a 1 ya que no hace falta para este ejercicio
        //Variables

        if (Area2.isBlank() || Area1.isBlank()) {
            TextArea1.setText("Introduce valores correctos para cada campo");
        } else {
            try {
                float Area2Num = Float.parseFloat(Area2);
                //Ahora tenemos los dos valores, llamamos a nuestro array list
                x.setItem(Area1);
                x.setPrecio(Area2Num);    
                lista.add(x);
                ComboBox1.addItem(Area1);
                
                /*TEMPORAL*/
                //De momento guardamos el total en una variable glboal, ams adelante
                //usaremos un bucle para recorrer todos los precios y cambiarlos
                precioTotal = precioTotal + Area2Num;
                
            } catch (NumberFormatException e) {
                TextArea1.setText("El valor de Area2 debe ser un número valido");
            }
        }
    }

    public void Imprimir() {
        System.out.println("" + lista.size());
        for (int i = 0; i < lista.size(); i++) {
            TextArea1.append(lista.get(i).toString() + "\n");
            System.out.println("xdxd"+ ComboBox1.getItemAt(i));
        }
        
        Etiqueta3.setText("Total: "+precioTotal);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PardoIbirqueTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PardoIbirqueTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PardoIbirqueTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PardoIbirqueTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PardoIbirqueTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JLabel Etiqueta1;
    private javax.swing.JLabel Etiqueta2;
    private javax.swing.JLabel Etiqueta3;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
