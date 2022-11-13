/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class UF1_016 {

    /**
     * Programa que pida que se introduzcan dos números enteros por teclado y
muestre los números desde el menor hasta el mayor de ellos.Los dos números
introducidos deben ser distintos. Si son iguales se mostrará un mensaje
indicándolo y se volverán a pedir.
     * @param args
     */
    /*public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String n1 , n2 ;
        do{
            System.out.println("Introduce el  primer nuemro entero");
            n1=entrada.nextLine();
            System.out.println("Introduce le segundo numero entero");
            n2=entrada.nextLine();
            if(n1==n2){
                System.out.println("Debes introducir dos numeros distintos");
            }
        }while(n1==n2 || !isNumeric(n1) || !isNumeric(n2));
    }
    
    private static boolean isNumeric(String numero){
        try{
            Integer.parseInt(numero);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Esto que? no es un numero");
            return false;
        }
    }
}*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, m;
        do {

            //pido el primer nÃºmero
            System.out.println("Introduce un nÃºmero entero");
            //lo valido
            while (!entrada.hasNextInt()) {
                System.out.println("Valor incorrecto, intÃ©ntalo de nuevo");
                entrada.next();
            }
            //lo guardo
            n = entrada.nextInt();
            //pido el segundo nÃºmero
            System.out.println("Introduce otro nÃºmero entero");
            //lo valido
            while (!entrada.hasNextInt()) {
                System.out.println("Valor incorrecto, intÃ©ntalo otro nÃºmero");
                entrada.next();
            }
            //lo guardo
            m = entrada.nextInt();
        } while (n == m);
        //calcular menor y mayor
        int mayor, menor;
        if (n > m) {
            mayor = n;
            menor = m;
        } else {
            mayor = m;
            menor = n;
        }
        //imprimir
        System.out.println("NÃºmeros desde " + menor + " hasta " + mayor);
        for(int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }

}