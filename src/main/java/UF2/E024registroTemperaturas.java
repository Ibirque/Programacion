
package UF2;


public class E024registroTemperaturas {

    public static void main(String[] args) {
        E024registroTemperaturas programa = new E024registroTemperaturas();
        programa.inicio();
    }
    
    public void inicio(){
        double[]notas = {2.5, 5.5, 7.8, 9.5, 4.3, 9.7, 10};
        E022metodos milagro = new E022metodos();
        double max = milagro.calcularMax(notas);
        double min = milagro.calcularMin(notas);
        double diferencia = max-min;
        System.out.println("La diferencias entre las temperaturas maxima y minima es de: "+diferencia);
    }
    
}
