/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

/**
 *
 * @author javie
 */
public class E043 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].compareTo(args[j]) > 0) {
                    String cambio = args[i];
                    args[i] = args[j];
                    args[j] = cambio;
                }
            }
        }
        System.out.println("Los meses orfenados son: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
