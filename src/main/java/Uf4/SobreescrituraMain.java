
package Uf4;

public class SobreescrituraMain {

    public static void main(String[] args) {
        Animal a = new Animal();
        Gato g = new Gato();
        
        a.comer();
        
        g.comer();
        //a.maullar();
        
        g.respirar();
        g.maullar();
    }
    
}
