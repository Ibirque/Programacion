
package Uf4;

public class PrimoConstante {
    private int edad;
    private final String nombre;
    
    //constructor
    public PrimoConstante(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    
    //imprimir primos
    public void imprimir(){
        System.out.println("Mi primo se llama: "+this.nombre+",\nTiene "+edad+" años");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
