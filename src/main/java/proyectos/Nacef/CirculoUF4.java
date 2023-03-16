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
        radio = r;
        color = "negro";
    }

    public double getRadio() {
        return radio;
    }
    
    //más métodos de un circulo, no accesores
    public double area(){
        return radio*radio*Math.PI;
    }
}
