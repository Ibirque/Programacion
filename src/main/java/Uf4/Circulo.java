
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
    
    //metodo constructor sin valores por defecto
    public Circulo(double r, String c) {
        this.radio = r;
        color = c;
    }
    

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }        
   
    //Seccion de setters
    public void setRadio(double nuevoR) {
        radio = nuevoR;
    }

    public void setColor(String NuevoC) {
        color = NuevoC;
    }
    
    //mas metodos de un circulo, o accessores
    public double area(){
        return radio*radio*Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
    
    
}
