
package Uf4;
    /*¿Que queremos?*/
    /*base double
altura double
rectangulo()
rectangulo(base:double, altura:double
getBase
getAltura
setBase
setAltura
toString
Area
Perimetro*/



public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
        base = 1.0;
        altura = 1.0;
    }

    public Rectangulo(double b, double a) {
        base = b;
        altura = a;
    }

    //getters
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    
    //setters
    public void setAltura(double a) {
        altura = a;
    }
    public void setBase(double b) {
        base = b;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    //Area y perimetro
    public double Area(){        
        return base*altura;
    }
    public double Perimetro(){
        return (base+altura)*2;
    }
}
