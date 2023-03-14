package proyectos.Nacef;

public class HumanoUF4 {

    //atributos
    String nombre;
    int edad;
    String dni;

    //métodos
    //constructor
    public HumanoUF4(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //generar un nuevo constructor para el nuevo atributo
    public HumanoUF4(String dni) {
        this.dni = dni;
    }

    //otros métodos
    public void volar() {
        System.out.println("Nombre: " + nombre + ", edad:" + edad + " y puedo volar");
    }
    
    public void volar(int km){
        System.out.println("Distancia recorrida volando: " + km + " kilometros");
    }

}
