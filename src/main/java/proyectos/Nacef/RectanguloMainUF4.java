package proyectos.Nacef;


public class RectanguloMainUF4 {

    
    public static void main(String[] args) {
        RectanguloUF4 r1 = new RectanguloUF4(1.2, 2.4);
        System.out.println(r1);//toSting()
        RectanguloUF4 r2 = new RectanguloUF4();
        System.out.println(r2);
        
        
        r1.setBase(2);
        r1.setAltura(3);
        System.out.println(r1);
        System.out.println("La base es: " + r1.getBase());
        System.out.println("La altura es: " + r1.getAltura());
        
        System.out.println("El área es: " + r1.area());
        System.out.println("El perimetro es: " + r1.perimetro());
        
        System.out.println("-----------------------------");
        
        System.out.println(r2);
        System.out.println("La base es: " + r2.getBase());
        System.out.println("La altura es: " + r2.getAltura());
        
        System.out.println("El área es: " + r2.area());
        System.out.println("El perimetro es: " + r2.perimetro());
    }
    
}
