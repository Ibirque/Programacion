/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectos.Nacef;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class OueslatiNacefTienda extends javax.swing.JFrame {

    ArrayList<String> items = new ArrayList();
    ArrayList<Double> precios = new ArrayList();
    double importeAcumulado;

    public OueslatiNacefTienda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        articulo = new javax.swing.JLabel();
        textfieldArticulo = new javax.swing.JTextField();
        textfieldPrecio = new javax.swing.JTextField();
        precio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        button = new javax.swing.JButton();
        buttonTotal = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        buttonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        articulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        articulo.setForeground(new java.awt.Color(255, 255, 255));
        articulo.setText("Artículo:");

        precio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        precio.setForeground(new java.awt.Color(255, 255, 255));
        precio.setText("Precio: ");

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setText("Artículos comprados: ");
        jScrollPane1.setViewportView(textArea);
        textArea.getAccessibleContext().setAccessibleName("");
        textArea.getAccessibleContext().setAccessibleDescription("");

        button.setBackground(new java.awt.Color(19, 243, 243));
        button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Siguiente Artículo");
        button.setToolTipText("");
        button.setActionCommand("button");
        button.setBorder(null);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        buttonTotal.setBackground(new java.awt.Color(19, 243, 243));
        buttonTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonTotal.setForeground(new java.awt.Color(255, 255, 255));
        buttonTotal.setText("Total");
        buttonTotal.setToolTipText("");
        buttonTotal.setActionCommand("button");
        buttonTotal.setBorder(null);
        buttonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTotalActionPerformed(evt);
            }
        });

        label1.setForeground(new java.awt.Color(172, 207, 222));
        label1.setText("...importa parcial");

        buttonEliminar.setBackground(new java.awt.Color(255, 153, 153));
        buttonEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminar.setText("Eliminar");
        buttonEliminar.setToolTipText("");
        buttonEliminar.setActionCommand("button");
        buttonEliminar.setBorder(null);
        buttonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEliminarMouseClicked(evt);
            }
        });
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(articulo)
                        .addGap(18, 18, 18)
                        .addComponent(textfieldArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(precio)
                        .addGap(18, 18, 18)
                        .addComponent(textfieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(articulo)
                    .addComponent(textfieldArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio)
                    .addComponent(textfieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(buttonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(55, 55, 55))
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

    private void buttonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTotalActionPerformed
        mostrarTotal();

    }//GEN-LAST:event_buttonTotalActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        agregarArticulo();
    }//GEN-LAST:event_buttonActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void buttonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarMouseClicked
        //Queremos borroar todos

        int id = comboBox.getSelectedIndex();
        importeAcumulado = importeAcumulado - precios.get(id);
        label1.setText("Total:" + importeAcumulado);
        comboBox.removeItemAt(id);
        items.remove(id);
        precio.remove(id);
        
        mostrarTotal();
    }//GEN-LAST:event_buttonEliminarMouseClicked

    private void imrprimir() {
        for (int i = 0; i < items.size(); i++) {
            textArea.append(items.get(i).toString() + "\n");
        }

        importeAcumulado = 0;
        for (int i = 0; i < precios.size(); i++) {
            importeAcumulado = importeAcumulado + precios.get(i);
        }
        label1.setText("Total:" + importeAcumulado);
    }

    private void agregarArticulo() {
        String nombreArticulo = textfieldArticulo.getText();
        double precioArticulo = Double.parseDouble(textfieldPrecio.getText());

        items.add(nombreArticulo);
        precios.add(precioArticulo);

        //textArea.append("Nombre: " + nombreArticulo + " Precio: " + precioArticulo + "\n");
        textArea.append("\nArticulo: " + nombreArticulo);

        textfieldArticulo.setText("");
        textfieldPrecio.setText("");
        comboBox.addItem(nombreArticulo);
        textArea.setText("");
        imrprimir();
    }

    private void mostrarTotal() {
        textArea.setText("");
        textArea.append("\n--- Total ---\n");
        for (int i = 0; i < items.size(); i++) {
            //textArea.append("Nombre: " + articulo + " Precio: " + precio + "\n");
            textArea.append(items.get(i) + "\n");
        }

        double iva = importeAcumulado * 0.16;
        double precioTotal = importeAcumulado + iva;

        textArea.append("\nImporte total: " + importeAcumulado);
        textArea.append("\nIVA: " + iva);
        textArea.append("\nPrecio con IVA: " + precioTotal);

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
            java.util.logging.Logger.getLogger(OueslatiNacefTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OueslatiNacefTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OueslatiNacefTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OueslatiNacefTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OueslatiNacefTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel articulo;
    private javax.swing.JButton button;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonTotal;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel precio;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textfieldArticulo;
    private javax.swing.JTextField textfieldPrecio;
    // End of variables declaration//GEN-END:variables
}
