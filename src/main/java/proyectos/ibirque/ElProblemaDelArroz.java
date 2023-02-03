/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ibirque;

public class ElProblemaDelArroz {

    public static void main(String[] args) {
        //Vamos a calcular cuantos granos de arroz necesitamos para llenar un tablero de ajedrez
        double arroz;
        double sumaArroz = 0;
        for (int i = 0; i <= 64; i++) {
            arroz = Math.pow(2, i);
            System.out.println("[" + (i + 1) + "]" + arroz);
            sumaArroz = arroz + sumaArroz;
        }
        System.out.println("La suma es: " + sumaArroz);

        double numerico = 3.6893488147419103;
        for (int x = 0; x < 19; x++) {
            System.out.println(numerico + "^" + x + " = " + (int) Math.pow(numerico, x));

        }

    }

}
