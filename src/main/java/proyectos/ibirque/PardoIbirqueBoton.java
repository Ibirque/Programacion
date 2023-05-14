/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectos.ibirque;

import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * int segundos = 0;
 *
 * @author Alumno
 */
public class PardoIbirqueBoton extends javax.swing.JFrame {

    int Cont = 0;

    /**
     * Creates new form PardoIbirqueBoton
     */
    public PardoIbirqueBoton() {
        initComponents();
        atributosEspeciales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Titulo2 = new javax.swing.JLabel();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setForeground(new java.awt.Color(102, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 1080));

        Titulo2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setText("La fe mueve montañas");

        Boton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Boton1.setText("¡jamás!");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Boton2.setText("Si, claro");
        Boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton2MouseEntered(evt);
            }
        });
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Titulo1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("¿Aprobare el M03?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseEntered
        //Queremos que el boton se vaya moviendo
        PointerInfo M = MouseInfo.getPointerInfo();

        //Primero necesitamos saber el tamaño de nuestra ventana, lo obtenemos con getWidth y getHeight
        int randX = (int) (Math.random() * (getWidth() - Boton2.getWidth())) + 1;
        //Le restamos 40 mas para que no se nos quede bajo la barra de inicio en caso de maximizarlo
        int randY = (int) (Math.random() * (getHeight() - Boton2.getHeight() - 40)) + 1;

        //Esta sección se encarga de comprobar que Boton2 jamas caiga dentro de los bounds de boton1
        if (randX >= (Boton1.getBounds().x - Boton2.getWidth())
                && randX <= Boton1.getBounds().x + Boton1.getWidth()
                && randY >= (Boton1.getBounds().y - Boton2.getHeight())
                && randY <= Boton1.getBounds().y + Boton1.getHeight()) {

            Boton2.setBounds(Boton1.getBounds().x + 120, randY, 120, 40);
            jPanel2.add(Boton2);

            //Queremos evitar todo lo posible generarlo cerca del raton
            if (Boton2.getBounds().x >= (M.getLocation().x - Boton2.getWidth())
                    && Boton2.getBounds().x <= M.getLocation().x + Boton1.getWidth()
                    && Boton2.getBounds().y >= (M.getLocation().y - Boton2.getHeight())
                    && Boton2.getBounds().y <= M.getLocation().y + Boton1.getHeight()) {
                Boton2.setBounds(M.getLocation().x, M.getLocation().y - 42, 120, 40);
                jPanel2.add(Boton2);
            }
        } else {
            Boton2.setBounds(randX, randY, 120, 40);
            jPanel2.add(Boton2);
        }


    }//GEN-LAST:event_Boton2MouseEntered

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed

        //Declaracion de constantes
        Cont = Cont + 1;
        Titulo2.setVisible(true);
        Boton1.setText("Persiguelo");
        Boton2.setText("Atrapame");

        //Vectores
        int vectorX = 8;
        int vectorY = 10;
        //int rebote = (jPanel2.getHeight() / 2) * (-1);

        //Añadimos un timer
        Timer timer = new Timer(25, new ActionListener() {
            private int segundos = 0;
            private int segundoAuxiliar = 0;
            //Posición inicial en el eje Y
            private int y0 = Boton1.getLocation().y;
            // Velocidad inicial en el eje Y
            private int v0y = vectorY;
            //Gravedad
            private int g = 9;

            @Override
            public void actionPerformed(ActionEvent e) {
                segundos++;
                //Posicion = posicion inicial + velocidad*tiempo + 1/2*a*t^2
                //Si nos pasamos del eje Y, rebotamos
                // Verificar si nos pasamos del eje Y
                int posY = y0 + v0y * segundos + (1 / 2) * g * segundos * segundos;
                if (posY >= jPanel2.getHeight()) {
                    // Rebote
                    segundoAuxiliar = segundos;
                    segundos = 0;
                    y0 = jPanel2.getHeight(); // Posición inicial del rebote en el límite inferior
                    v0y = -v0y; // Cambio de dirección de la velocidad (rebote)

                    posY = y0 + v0y * segundos + (1 / 2) * g * segundos * segundos;
                }

                buttons[segundos] = new javax.swing.JButton(String.valueOf(segundos));
                buttons[segundos].setName("AAAA");
                buttons[segundos].setText("AAAA");
                buttons[segundos].setVisible(true);

                buttons[segundos].setBounds(Boton1.getLocation().x + vectorX * (segundos+segundoAuxiliar), posY, 120, 40);
                jPanel2.add(buttons[segundos]);
                jPanel2.repaint();
            }
        });

        if (Cont == 4) {
            Titulo2.setText("Deja de pulsar");
        } else if (Cont == 8) {
            Titulo2.setText("Persigue al otro boton");
        } else if (Cont == 12) {
            Titulo2.setText("Por favor para");
        } else if (Cont == 16) {
            Titulo2.setText("No me encuentro bien :S");
        } else if (Cont == 20) {
            Titulo2.setText("Bluarggh!");

            timer.start();
        }

    }//GEN-LAST:event_Boton1ActionPerformed

    public void crearBotones(int i) {
        buttons[i] = new javax.swing.JButton(String.valueOf(i));
        buttons[i].setName("AAAAA");
        buttons[i].setText("AAAA");
        buttons[i].setVisible(true);

        buttons[i].setBounds((jPanel2.getWidth() / 2) + (1 + i) * 10, (jPanel2.getHeight() / 2) + (1 + i) * 10, 120, 40);
        jPanel2.add(buttons[i]);
        jPanel2.repaint();
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PardoIbirqueBoton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PardoIbirqueBoton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PardoIbirqueBoton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PardoIbirqueBoton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PardoIbirqueBoton().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    javax.swing.JButton[] buttons = new javax.swing.JButton[250];

    private void atributosEspeciales() {
        Titulo2.setVisible(false);
    }

}
