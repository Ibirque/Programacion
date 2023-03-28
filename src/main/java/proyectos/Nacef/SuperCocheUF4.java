package proyectos.Nacef;


public class SuperCocheUF4 {

    //atributos - declaración
    String marca;
    float kms;
    String color;
    
    
    public static void main(String[] args) {
        SuperCocheUF4 deLorean = new SuperCocheUF4();
        
        deLorean.color = "gris";
        deLorean.kms = 0f;
        deLorean.marca = "DMC";
        
        System.out.println("Este coche es un " + deLorean.marca + " " + deLorean.color);
    }
    
}
