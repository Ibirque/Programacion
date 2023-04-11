package Uf4;

public class EstudianteUF4 extends PersonaUF4 {

    private String codigoEstudiante;
    private float nota;

    //Constructor de estudiantes
    public EstudianteUF4(String codigoEstudiante, float nota, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        /*
        super() calls the parent constructor with no arguments.

        It can be used also with arguments. I.e. super(argument1) and it will call the constructor 
        that accepts 1 parameter of the type of argument1 (if exists).

        Also it can be used to call methods from the parent. I.e. super.aMethod()
        */
        
        this.codigoEstudiante = codigoEstudiante;
        this.nota = nota;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public float getNota() {
        return nota;
    }
    
    public void mostrarNombre(){
        //System.out.println("Nmbre: " + this.nombre);
        //Atributo privado!
        
        System.out.println("Nombre: "+ this.getNombre() + " " + this.getApellido());
    }

}
