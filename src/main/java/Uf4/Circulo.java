
package Uf4;

public class Circulo {
    //Atributos de un circulo
    //radio y color
    private double radio;
    private String color;
    
    //constructor con valores por defecto
    public Circulo(){
        radio = 1.0;
        color = "negro";
    }
    
    //constructor con un valor por defecto y otro inicializado
    public Circulo(double r){
        radio = r;
        color = "negro";
    }

    public double getRadio() {
        return radio;
    }
    
    //mas metodos de un circulo, o accessores
    public double area(){
        return radio*radio*Math.PI;
    }
    
}
