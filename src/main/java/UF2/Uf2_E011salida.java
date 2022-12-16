package UF2;

import java.util.Scanner;

public class Uf2_E011salida {

    //definir un metdo que lea n unico valor entero desde el teclado
    public static void main(String[] args) {
        Uf2_E011salida programa = new Uf2_E011salida();
        programa.inicio();
    }

    private void inicio() {
        System.out.println("Escribe un numero entero");
        int a = leerNum();
        System.out.println("Has introducido " +a);
        System.out.println("Escribe otro numero entero");
        a = leerNum();
        System.out.println("Has introducido "+a);
    }

    //entrada ->no
    //salida ->int
    public int leerNum() {
        Scanner entrada = new Scanner(System.in);
        int numLeido = 0;
        boolean leido = false;
        while(!leido){
            leido = entrada.hasNextInt();
            if(leido){
                numLeido = entrada.nextInt();
            }else{
                System.out.println("Esto no es un numero entero");
                entrada.next();
            }
            entrada.nextLine();
        }        
        return numLeido;
    }
}
