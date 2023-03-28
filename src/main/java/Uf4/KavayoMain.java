
package Uf4;

public class KavayoMain {

    public static void main(String[] args) {
        Kavayo c1 = new Kavayo("Paco", "negro", 3 ,2);
        Kavayo c2 = new Kavayo("Carlitos", "blanco", 16, 5);
        
        System.out.println("Este caballo se llama "+c1.getNombre());
        System.out.println(c2.getNombre()+" y ");
        
        c2.comer();
        c1.Galopar();
    }
    
}
