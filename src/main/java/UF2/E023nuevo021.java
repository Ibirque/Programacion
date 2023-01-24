
package UF2;

public class E023nuevo021 {


    public static void main(String[] arsg) {
        E023nuevo021 programa = new E023nuevo021();
        programa.inicio();
    }

    public void inicio() {
        double[]notas = {2.5, 5.5, 7.8, 9.5, 4.3, 9.7, 10, 4.1, 8.0};
        //necesitamos instanciar un objeto de la clase E022metodo
        //que es donde estan los metodos que pretendemos invocar
        E022metodos objeto = new E022metodos();
        double max = objeto.calcularMax(notas);
        double min =objeto.calcularMin(notas);
        double media =objeto.calcularMedia(notas);
        System.out.println("Max : "+ max+ "\nMin: "+min+"\nMedia: "+media);
    }
    
}
