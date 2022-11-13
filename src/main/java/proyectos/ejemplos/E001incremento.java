
package proyectos.ejemplos;


public class E001incremento {

    public static void main(String[] args) {
       int inicio = 0;
       int otraVariable = 4;
        System.out.println(inicio);
        inicio++;
        //inicio = inicio+1;
        System.out.println(inicio);
        inicio += otraVariable;
        System.out.println(inicio);
        inicio += otraVariable;
        System.out.println(inicio);
        otraVariable++;
        inicio += otraVariable;
        System.out.println(inicio);
        
        System.out.println("Hola Mundo");
    }
    
}
