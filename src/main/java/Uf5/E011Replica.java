/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Uf5;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Alumno
 */
public class E011Replica extends javax.swing.JPanel {

    /**
     * Creates new form E011Replica
     */
    public E011Replica() {
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

        Pregunta = new javax.swing.JLabel();
        Campo = new javax.swing.JTextField();
        BotonResponder = new javax.swing.JButton();
        Respuesta = new javax.swing.JLabel();

        Pregunta.setText("¿Como te llamas?");

        Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoActionPerformed(evt);
            }
        });

        BotonResponder.setText("Contestar");
        BotonResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResponderActionPerformed(evt);
            }
        });

        Respuesta.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Respuesta)
                    .addComponent(BotonResponder)
                    .addComponent(Campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pregunta))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Pregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonResponder)
                .addGap(18, 18, 18)
                .addComponent(Respuesta)
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoActionPerformed

    
    private void BotonResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResponderActionPerformed
        Respuesta.setText("¡Hola "+ Campo.getText()+"!");  
    }//GEN-LAST:event_BotonResponderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonResponder;
    private javax.swing.JTextField Campo;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JLabel Respuesta;
    // End of variables declaration//GEN-END:variables
}