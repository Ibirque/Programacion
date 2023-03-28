
package Uf4;

public class Humano {
    //Atributo
    String nombre;
    int edad;
    String dni;
    
    //metodos
    
    //Constructor
    public Humano(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //generar un nuevo constructor para el nuevo atributo
    public Humano(String dni) {
        this.dni = dni;
    }

    //otros metodos
    public void volar(){
        System.out.println("Nombre: "+nombre+", edad: "+edad+" y puede volar");
    }
    
    public void volar(int km){
        System.out.println("Distancia recorrida volando: "+km+" kilometros");
    }
    
}
