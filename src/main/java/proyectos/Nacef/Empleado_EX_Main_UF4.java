package proyectos.Nacef;


public class Empleado_EX_Main_UF4 {

    
    public static void main(String[] args) {
        Empleado_EX_UF4 paco = new Empleado_EX_UF4(8, "Paco", "GÃ³mez", 2000);
        System.out.println(paco);
        
        paco.setSueldo(2100);
        System.out.println(paco);
        System.out.println("El identificador es " + paco.getId());
        System.out.println("El nombre es " + paco.getNombre() +" " + paco.getApellido());
        System.out.println(paco.getNombre() +" " + paco.getApellido() + " cobra " + paco.getSueldo());
        
        System.out.println("Su salario anual es " + paco.sueldoAnual());
               
        System.out.println("El nuevo sueldo de " + paco.getNombre() +" " + paco.getApellido() +" es " + paco.subirSueldo(40));
    }
    
}
