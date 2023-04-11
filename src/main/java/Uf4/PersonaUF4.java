
package Uf4;

public class PersonaUF4 {
    private String nombre;
    private String apellido;
    private int edad;

    public PersonaUF4(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    
}
