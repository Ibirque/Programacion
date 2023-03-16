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
    }

}
