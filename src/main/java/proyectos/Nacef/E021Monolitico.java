package proyectos.Nacef;


public class E021Monolitico {

    public static void main(String[] args) {
        E021Monolitico programa = new E021Monolitico();
        programa.inicio();
    }
    
    
    public void inicio() {
        double[]notas = {2.5, 5.5, 7.8, 9.5, 4.3, 9.7, 10, 4.1, 8.0};
        double max = calcularMax(notas);
        double min = calcularMin(notas);
        double media = calcularMedia(notas);
        System.out.println("La nota máxima es: " + max + ".");
        System.out.println("La nota mínima es: " + min);
        System.out.println("La media de las notas es: " + media);
    }
    
    public double calcularMax(double[]array){
        double max = array[0];
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    
    public double calcularMin(double[]array){
        double min = array[0];
        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    
    public double calcularMedia(double[]array){
        double suma = 0;
        for(int i = 1; i < array.length; i++){
            suma = suma + array[i];
        }
        return suma/array.length;
    }
}
