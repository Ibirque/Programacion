/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

/**
 *
 * @author javie
 */
public class E040contar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i < args.length; i++) {
            if (-1 != args[i].indexOf("a")) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " argumentos con la letra a");
    }

}
