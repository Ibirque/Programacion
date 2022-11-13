package proyectos.ejemplos;

import java.util.Scanner;

public class E006Scanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        String nombre = entrada.next();
        System.out.println(nombre);

        System.out.println("Escribe tu edad");
        int edad = entrada.nextInt();
        //limpiar el buffer para que no quede un espacio latente
        entrada.nextLine();
        System.out.println("Tienes " + edad + " años.");

        System.out.println("Escribe tu nombre completo");
        String completo = entrada.nextLine();
        System.out.println(completo);
        
        
       
       String algo = entrada.next();
        System.out.println(algo);

    }

}
