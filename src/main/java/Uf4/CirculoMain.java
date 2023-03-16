
package Uf4;

public class CirculoMain {

 
    public static void main(String[] args) {
        //instancia de un circulo - c1
        //utilizar el constructor por defecto
        Circulo c1 = new Circulo();        
        Circulo c2 = new Circulo(13);
        
        System.out.println("Este circulo tiene un radio de: "+ c1.area() + " y una area de " +c1.area());
        System.out.println("Este circulo tiene un radio de: "+ c2.area() + " y una area de " +c2.area());
        
    }
    
}
