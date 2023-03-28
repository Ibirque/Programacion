
package Uf4;

public class HumanoMain {

    public static void main(String[] args) {
        //objeto humano
        Humano pepe = new Humano("Pepe", 20);
                
        pepe.volar();
        System.out.println("_____");
        pepe.volar(200);
        
        Humano ana = new Humano("Ana", 27);
        ana.volar(150);
    }
    
}
