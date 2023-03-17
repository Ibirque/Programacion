package proyectos.Nacef;

public class CirculoMainUF4 {

    public static void main(String[] args) {
        //instancia de un circulo - c1
        //utilizar el contructor por defecto
        CirculoUF4 c1 = new CirculoUF4();
        //invocar método  para esta instancia de objeto Circulo
        System.out.println("Este círculo tiene un radio de " + c1.getRadio() + 
                " y un área de " + c1.area());
        
        
        //instanciar de otro circulo - c2
        //utilizar el segundo constructor
        CirculoUF4 c2 = new CirculoUF4(2.0);
        //invocar métodos para esta instancia de objeto Circulo
        System.out.println("Este círculo tiene un radio de " + c2.getRadio() + 
                " y un área de " + c2.area());
        
        //instancia de otro circulo sin valores por defecto
        CirculoUF4 c3 = new CirculoUF4(2.1, "rojo");
         System.out.println("Este círculo tiene un radio de " + c3.getRadio() + 
                " y un área de " + c3.area());
         
        //instancia básica de un circulo 
        CirculoUF4 c4 = new CirculoUF4();
        c4.setRadio(4.0);//modificación de radio
        System.out.println("El radio es: " + c4.getRadio());
        c4.setColor("azul");//modificación del color
        System.out.println("El color es: " + c4.getColor());
        
        
        CirculoUF4 c5 = new CirculoUF4(5.5); 
        System.out.println(c5.toString());//llamada explicita a toString
        System.out.println(c5);
    }

}
