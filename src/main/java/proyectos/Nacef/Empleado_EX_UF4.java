package proyectos.Nacef;


public class Empleado_EX_UF4 {
    private int id;
    private String nombre;
    private String apellido;
    float sueldo;

    public Empleado_EX_UF4(int id, String nombre, String apellido, float sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public float sueldoAnual(){
        return sueldo*14;
    }
    
    public float subirSueldo(float porcentaje){
        return sueldo * (porcentaje/100);
    }

    @Override
    public String toString() {
        return "Empleado_EX_UF4{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + '}';
    }

    
    
    
    
    
}
