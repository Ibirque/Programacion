
package Uf4;

public class Empresa {

    public static void main(String[] args) {
        EmpresaEmpleado e1 = new EmpresaEmpleado();
        e1.setEdad(50);
        
        EmpresaEmpleado e2 = new EmpresaEmpleado();
        e1.setEdad(13);
        //Ejemplo para el empleado dos
        System.out.println("Edad: "+e2.getedad());
        
        
        //para mostrar la edad necesitamos el getter en la clase
        System.out.println("Edad: "+e1.getedad());
        
        e1.setNombre("Paco");
        System.out.println("Nombre: "+e1.getNombre());
        
    }
    
}
