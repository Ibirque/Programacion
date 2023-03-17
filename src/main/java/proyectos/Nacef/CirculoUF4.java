package proyectos.Nacef;


public class CirculoUF4 {
    //atributos de un circulo
    //radio y color
    private double radio;
    private String color;
    
    //constructor con valores por defecto
    public CirculoUF4(){
        radio = 1.0;
        color = "negro";
    }
    
    //constructor con un valor por defecto y otro inicializado
    public CirculoUF4(double r){
        this. radio = r;
        color = "negro";
    }
    
    //método constructor sin valores por defecto

    public CirculoUF4(double r, String c) {
        radio = r;
        color = c;
    }
    

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setRadio(double nuevoR) {
        radio = nuevoR;
    }

    public void setColor(String nuevoC) {
        color = nuevoC;
    }

    @Override
    public String toString() {
        return "CirculoUF4{" + "radio=" + radio + ", color=" + color + '}';
    }
    
    
    
    
    //más métodos de un circulo, no accesores
    public double area(){
        return radio*radio*Math.PI;
    }
}
