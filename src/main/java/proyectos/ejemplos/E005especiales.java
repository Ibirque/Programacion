
package proyectos.ejemplos;


public class E005especiales {

    
    public static void main(String[] args) {
        //declaración de constante
        final double PI = 3.1416;
        System.out.println(PI);
        
        //actualizar el valor de PI
        //PI = 23.0; //No se puede reasignar
        
        //declaración de tipo char
        char a = 'B';
        //asignación de "a" a un tipo entero
        int i = a;
        System.out.println(i);
        //lo que imprime es la equivalencia en ASCII
        
        //escape
        System.out.println("Salto de linea \nTabulacion \tEstoy tabulando \nAdios \"Adios\" ");
    }
    
}
