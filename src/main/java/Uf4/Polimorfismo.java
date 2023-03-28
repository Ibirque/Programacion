package Uf4;

/*  Vamos a intentar crear un ejemplo de polimorfismo
    Podemos crear distintas clases con el mismo nombre pero que reciben diversos valores
 */
public class Polimorfismo {

    public static void main(String[] args) {
        Polimorfismo prog = new Polimorfismo();
        prog.inicio();
    }

    public void inicio() {
        /*  Llamamos a sum, aunque en principio tenemos 3 sum distintos
            el compilador intenta llamar a la clase adecuada*/
        System.out.println("Polimorfia con 2 valores " + sum(5,10));
        System.out.println("Polimorfia con 3 valores " + sum(5,10,15));
        System.out.println("Polimorfia con 2 valores decimales " + sum(5.4,10.4));
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b) {
        return a + b;
    }

}
