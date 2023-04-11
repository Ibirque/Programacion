
package Uf4;

public class Herencia {

    public static void main(String[] args) {
        
        EstudianteUF4 persona = new EstudianteUF4("12", 1, "Misco", "Jones", 21);
        persona.mostrarNombre();
        System.out.println(persona.getEdad());
    }
    
}
