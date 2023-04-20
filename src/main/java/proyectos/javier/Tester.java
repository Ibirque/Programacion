/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.javier;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Tester {
public static final int MARCA = -1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tester programa = new Tester();
        programa.inicio();
    }

    public void inicio() {
//        escribir();
        leer();
    }

//    public void escribir() {
//        try {
//            File f = new File("Test.txt");
//            PrintStream escribir = new PrintStream(f);
//            for (int i = 0; i <= 20; i++) {
//                
//                escribir.print(i*2);
//                escribir.print(" ");
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }
//
//    }

    public void leer() {
        try {
            File f = new File("Test.txt");
            Scanner leer = new Scanner(f);
            boolean marquita = true;
            while (marquita) {                
                if(leer.nextInt()== MARCA){
                    marquita = false;
                }else{
                    System.out.println("Numero: " + leer.nextInt());
                }
            }
            leer.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        };
    }
}
