package proyectos.Nacef;


public class CaballoUF4 {
    private String nombre;
    private String color;
    private int edad;
    private int carrerasGanadas;

    public CaballoUF4(String nombre, String color, int edad, int carrerasGanadas) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.carrerasGanadas = carrerasGanadas;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void galopar(){
        System.out.println("Caballo galopando");
    }
    
    public void comer(){
            System.out.println("Caballo comiendo");
    }
    
    
}
