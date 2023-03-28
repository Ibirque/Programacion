
package Uf4;

public class C2 {


    public static void main(String[] args) {
        C1 objeto1 = new C1();
        //objeto1.edad = 25;
        objeto1.setEdad(25); 
        
        //System.out.println("La edad es: "+edad);
        System.out.println("La edad es: "+objeto1.getEdad());
        
        objeto1.setNombre("Paco");
        System.out.println("El nombre es: "+objeto1.getNombre());
    }
    
}
