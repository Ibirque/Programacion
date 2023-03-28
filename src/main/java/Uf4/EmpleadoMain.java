
package Uf4;

public class EmpleadoMain {

    public static void main(String[] args) {
        Empleado e = new Empleado(123, "Carlos", "Gijon", 1000);
        
        System.out.println("Empleado numero: "+e.getId()+"\nDe nombre: "+
                e.getNombre()+" "+e.getApellido() +"\nCon sueldo: "+e.getSueldo());
        
        float nuevoSueldo = e.getSueldo() + 233.34f;
        e.setSueldo(nuevoSueldo);
        
        
        System.out.println("Se realiza un incremento fijo de 233,34 Euros, el salario queda: "+e.getSueldo()
        +"\nel salario anual es de: "+e.sueldoAnual());
        
        //hacemos incremento en porcentaje
        System.out.println("*******");
        float antiguoSueldo = e.getSueldo();
        e.subirSueldo(2.5f);
        System.out.println("Empleado numero: "+e.getId()+"\nDe nombre: "+
                e.getNombre()+" "+e.getApellido() +"\nCon sueldo: "+antiguoSueldo+
                "\nHa recibidu un incremento de salario del 2,5%. Dejandole un salario final de: "+
                e.getSueldo());
        
        System.out.println("AAAAAA "+e.getSueldo());
             
    }
    
}
