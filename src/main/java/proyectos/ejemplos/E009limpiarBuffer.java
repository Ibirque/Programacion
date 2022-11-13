
package proyectos.ejemplos;

import java.util.Scanner;


public class E009limpiarBuffer {

    public static void main(String[] args) {
        // declarar Scanner
        Scanner entrada = new Scanner(System.in);
        //declaración de variables
        String nombre, direccion;
        int edad;
        System.out.println("Introduce tu nombre:");
        nombre = entrada.nextLine(); //leer el nombre
        System.out.println("Introduce tu edad:");
        edad = entrada.nextInt(); //leer la edad
        
        //aquí necesitamos limpiar el buffer porque ahora hay un espacio
        //el espacio es el intro que validaba la entrada de la edad
        entrada.nextLine();
        
        System.out.println("Introduce tu dirección:");
        direccion = entrada.nextLine(); //leer la dirección
        System.out.println("Datos introducidos:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
                
        
    }
    
}
