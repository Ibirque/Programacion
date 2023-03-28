package proyectos.Nacef;


public class PersonaUF4 {
    //atributos
    String nombre;
    int edad;
    
    //métodos
    //constructor: no ponemos "void"
    public PersonaUF4(String nombre, int edad){
        //inicialización de atributos
        this.nombre = nombre; //el primero es el atributo, el segundo el argumento
        this.edad = edad;
    }
    
    //otro metodo de la clase PersonaUF4
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
