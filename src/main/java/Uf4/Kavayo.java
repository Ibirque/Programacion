
package Uf4;

public class Kavayo {
    private String nombre;
    private String color;
    private int edad;
    private int carrerasGanadas;

    public Kavayo(String nombre, String color, int edad, int carrerasGanadas) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.carrerasGanadas = carrerasGanadas;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void Galopar(){
        System.out.println("Caballo galopando");
    }
    
    public void comer(){
        System.out.println("Caballo comiendo");
    }
}
