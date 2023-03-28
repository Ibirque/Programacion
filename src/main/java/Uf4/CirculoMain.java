
package Uf4;

public class CirculoMain {

 
    public static void main(String[] args) {
        //instancia de un circulo - c1
        //utilizar el constructor por defecto
        Circulo c1 = new Circulo();        
        Circulo c2 = new Circulo(13);
        
        System.out.println("Este circulo tiene un radio de: "+ c1.area() + " y una area de " +c1.area());
        System.out.println("Este circulo tiene un radio de: "+ c2.area() + " y una area de " +c2.area());
        
        
        //instancia de otro circulo sin valores por defecto
        Circulo c3 = new Circulo(5, "amariyo");
        System.out.println(""+c3.getRadio() +" a "+c3.getColor());

        //instancia del cuarto circulo, al que modificaremos mas adelante
        Circulo c4 = new Circulo(2.1, "rojo");
        c4.setRadio(4); //modificacion de radio
        c4.setColor("bioleta");
        System.out.println("Este circulo tiene un radio de: " +c4.getRadio() + " y es de color "+c4.getColor());
        
        Circulo c5 = new Circulo(3,"asul");
        System.out.println("a_/# #_a");
        System.out.println(c5.toString());
        
        System.out.println(c5);
    }
    
}
