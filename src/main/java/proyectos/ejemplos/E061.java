/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

/**
 *
 * @author javie
 */
public class E061 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[][] notas = {
            {4.5f, 6f, 5f, 8f},
            {10f, 8f, 7.5f, 9.5f},
            {3f, 2.5f, 4.5f, 6f, 0f},
            {6f, 0f, 6f, 4f},
            {9f, 7.4f, 7f, 8f},};
        int cero = -1;
        int i = 0;
        while ((cero == -1) && (i < notas.length)) {
            int j = 2;
            while ((cero == -1) && (j < notas[i].length)) {
                if (notas[i][1] == 0f) {
                    cero = i;
                }
                j++;
            }
            i++;
        }
                if (cero == -1) {
            System.out.println("Ningun estudiante tiene un cero");
        } else {
            System.out.println("El estudiante " + (cero+1) + " tinen un cero");
        }
    }

}
