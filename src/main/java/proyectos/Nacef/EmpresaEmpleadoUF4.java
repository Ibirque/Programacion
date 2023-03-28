package proyectos.Nacef;


public class EmpresaEmpleadoUF4 {
    private int edad; //NO se puede asignar un valor desde la clase principal
    private String nombre;
    
    //método accesor setter para poder asignar la edad
    public void setEdad(int _edad){
        if(_edad > 16 && _edad < 66){
            this.edad = _edad;
        } else {
            System.out.println("Con esa edad no se puede trabajar");
        }
    }

    public int getEdad() {
        return edad;
    }
    
    //setters y getters para el atributo nombre
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    
}
