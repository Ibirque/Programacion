package proyectos.Nacef;

public class EstudianteUF4 extends Persona2UF4{
    private String codigoEstudiante;
    private float nota;
    
    //constructor

    public EstudianteUF4(String codigoEstudiante, float nota, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.nota = nota;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public float getNota() {
        return nota;
    }
    
    //método para mostrar los datos
    public void mostrarNombre(){
        //System.out.println("Nombre: " + this.nombre);
        //atributo privado!!!
        
        System.out.println("Nombre: " + this.getNombre() + " " + this.getApellido());
    }
}
