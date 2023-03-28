package Uf4;

public class EmpresaEmpleado {
    private int edad; //No se puede asignar un valor desde la clase principal
    private String nombre;
    
    //metodo accesor setter para poder asignar la edad
    public void setEdad(int _edad){
        if(_edad >16 && _edad <66){
            this.edad = _edad;
        }else{
            System.out.println("Con esa edad no se puede trabajar");
        }
    }
    
    //metodo getter
    public int getedad(){
        return edad;
    }
    
    //setter y getters para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
