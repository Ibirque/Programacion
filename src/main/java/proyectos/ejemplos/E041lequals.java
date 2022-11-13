/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

/**
 *
 * @author javie
 */
public class E041lequals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("patata")) {
                    System.out.println("El argumento " + (i + 1) + "es \"patata\"");

                } else {
                    System.out.println("El argumetno " + (i + 1) + " no es \"patata\"");
                }
            }
        }
    }
}
