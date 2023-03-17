package proyectos.Nacef;


public class RectanguloUF4 {
    //atributos encapsulados
    private double base;
    private double altura;

    public RectanguloUF4(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public RectanguloUF4() {
        base = 1.0;
        altura = 1.0;
    }
    
    

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "RectanguloUF4{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    public double area(){
        return base*altura;
    }
    
    public double perimetro(){
        return (base*2)+(altura*2);
    }
    
    
    
}
