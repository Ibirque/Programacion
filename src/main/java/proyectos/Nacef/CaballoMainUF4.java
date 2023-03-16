package proyectos.Nacef;


public class CaballoMainUF4 {

    
    public static void main(String[] args) {
        CaballoUF4 c1 = new CaballoUF4("Paco", "negro", 3, 2);
        CaballoUF4 c2 = new CaballoUF4("Pepe", "blanco", 5, 0);
        
        System.out.println("Este caballo se llama: " + c1.getNombre());
        //System.out.println(c2.getNombre());
        
        c2.comer();
        c2.galopar();
    }
    
}
