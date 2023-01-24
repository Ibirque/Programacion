package proyectos.Nacef;

public class E023nuevo21 {

    public static void main(String[] args) {
        E023nuevo21 programa = new E023nuevo21();
        programa.inicio();
    }

    public void inicio() {
        double[] notas = {2.5, 5.5, 7.8, 9.5, 4.3, 9.7, 10, 4.1, 8.0};
        //necesitamos instanciar un objeto de la clase E022método
        //que es dinde están los métodos que pretendemos invocar
        E022metodos metodos = new E022metodos();
        double max = metodos.calcularMax(notas);
        double min = metodos.calcularMin(notas);
        double media = metodos.calcularMedia(notas);
        System.out.println("La nota máxima es: " + max);
        System.out.println("La nota mínima es: " + min);
        System.out.println("La media de las notas es: " + media);
    }
}
