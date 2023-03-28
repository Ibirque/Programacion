
package Uf4;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //metodos
    //constructor, no tienen parametro de salida, por lo cual no especificamos el tipo
    public Persona(String nombre, int edad){
        /*Ponemos el underscore para que no se confunda con los atributos globales a la
        hora de llamarlo desde otra clase*/
        //inicializacion de atributos
        this.nombre = nombre; //el primero es el atributo, el segundo el argumento
        this.edad = edad;
    }
    
    //otro metodo de la clasee Persona
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}
