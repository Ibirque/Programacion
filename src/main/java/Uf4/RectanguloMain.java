
package Uf4;

public class RectanguloMain {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(1.2, 2.4);
        System.out.println(r1);//toSting()
        Rectangulo r2 = new Rectangulo();
        System.out.println(r2);
        
        
        r1.setBase(2);
        r1.setAltura(3);
        System.out.println(r1);
        System.out.println("La base es: " + r1.getBase());
        System.out.println("La altura es: " + r1.getAltura());
        
        System.out.println("El área es: " + r1.Area());
        System.out.println("El perimetro es: " + r1.Perimetro());
        
        System.out.println("-----------------------------");
        
        System.out.println(r2);
        System.out.println("La base es: " + r2.getBase());
        System.out.println("La altura es: " + r2.getAltura());
        
        System.out.println("El área es: " + r2.Area());
        System.out.println("El perimetro es: " + r2.Perimetro());
    }
    
}
