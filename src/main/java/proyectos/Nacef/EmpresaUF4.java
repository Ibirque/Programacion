package proyectos.Nacef;


public class EmpresaUF4 {

   
    public static void main(String[] args) {
        EmpresaEmpleadoUF4 e1 = new EmpresaEmpleadoUF4();
        e1.setEdad(65);
        
        //para mostrar la edad necesitamos el getter en la clase
        System.out.println("Edad: " + e1.getEdad());
        
        e1.setNombre("Paco");
        System.out.println("Nombre: " + e1.getNombre());
    }
    
}
