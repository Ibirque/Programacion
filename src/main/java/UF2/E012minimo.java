package UF2;

import java.util.Scanner;

public class E012minimo {

    public static void main(String[] args) {
        E012minimo programa = new E012minimo();
        programa.inicio();
    }

    public void inicio() {
        int resultado = minimo(4, 10);
        System.out.println("El menor es " + resultado);

        //minimoVoid();
        
    }
    //Necesito parametros de entrada?
    //Si, son nuestros dos numeros enteros

    public int minimo(int a, int b) {

        //int a = 4;
        //int b = 10;
        int min = 0;

        if (a > b) {
            min = b;
        } else if (b > a) {
            min = a;
        } else {
            System.out.println("Son iguales!");
        }
        return min;
    }

    public void minimoVoid() {
        int a; 
        int b;
        int min = 0;

        System.out.println("Introduce los parametros");
        System.out.println("Introduce A: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.println("Introduce A: ");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                
                //Comparo a y b
                if (a > b) {
                    min = b;
                } else if (b > a) {
                    min = a;
                }else{
                    System.out.println("Son iguales!");
                }
            }
        } else {
            System.out.println("Introduce numeros enteros, no otros caracteres");
            sc.nextLine();
        }
        
        System.out.println("El menor es " + min);
        
    }

}
