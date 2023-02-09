package proyectos.Nacef;

public class E024registroTemperaturas {

    public static void main(String[] args) {
        E024registroTemperaturas programa = new E024registroTemperaturas();
        programa.inicio();
    }

    public void inicio() {
        double[] temperaturas = {2.5, 5.5, 7.8, 9.5, 4.3, 9.7, 10};
        E022metodos metodos = new E022metodos();
        double max = metodos.calcularMax(temperaturas);
        double min = metodos.calcularMin(temperaturas);
        double diferencia = max - min;
        System.out.println("la diferencia entre las temperaturas máxima u mínima es de " + diferencia);
    }

}
