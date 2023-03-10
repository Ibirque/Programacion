
package Uf4;


public class SuperCoche {

    //atributos - declaracion
    String marca;
    float kms;
    String color;
    
    public static void main(String[] args) {
        SuperCoche deLorean = new SuperCoche();
        
        deLorean.color = "gris";
        deLorean.kms = 0f;
        deLorean.marca = "DMC";
        
        System.out.println("Este coche es un " + deLorean.marca +" "+ deLorean.color);
    }
    
}
