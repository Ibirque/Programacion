package proyectos.Nacef;

public class Herencia {

    
    public static void main(String[] args) {
        EstudianteUF4 persona = new EstudianteUF4("123", 9f, "Paco", "Meralgo", 21);
        persona.mostrarNombre();
        System.out.println(persona.getEdad());
    }
    
}
