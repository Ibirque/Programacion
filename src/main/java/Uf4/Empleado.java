
package Uf4;

public class Empleado {
    /*¿Que queremos?*/
    /*id int
    nombre string
    apellido string
    sueldo float
    
    Empleado(id int, nombre string, apellido string, sueldo float)
    getId():int
    getNombre()String
    getApellido()String
    getSueldo()float
    setSueldo(sueldoint)void
    sueldoAnual()int
    subirSueldo(int porcentaje):int
    tostring()string*/
    private int Id;
    private String Nombre;
    private String Apellido;
    private float Sueldo;

    public Empleado(int Id, String Nombre, String Apellido, float Sueldo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sueldo = Sueldo;
    }

    //Getters
    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public float getSueldo() {
        return Sueldo;
    }

    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    /*sueldoAnual()int
    subirSueldo(int porcentaje):int
    tostring()string*/
    
    public float sueldoAnual(){
        return Sueldo*14;
    }
    
    public void subirSueldo(float procentaje){
        //return Sueldo*(1+procentaje/100);
        this.Sueldo = Sueldo*(1+procentaje/100);
        
    }  

    @Override
    public String toString() {
        return "Empleado{" + "Id=" + Id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Sueldo=" + Sueldo + '}';
    }
    
}
