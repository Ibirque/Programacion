
package proyectos.ibirque;



public class Reto {

public static void main(String[] args) {      
        Reto programa2 = new Reto();
        programa2.inicio();
    }

    public void inicio() {
        int [] valores = {6, 5, 3, 10, 4};
        double resultado = media(valores);
        System.out.println("La media aritmetica es " + resultado);
    }

    public double media(int[] lista) {

        double sumatorio = 0;
        for (int i = 0; i < lista.length; i++) {
            sumatorio += lista[i];
            
            //sumatorio = sumatorio + lista[i];
        }
        //sumatorio = sumatorio / lista.length;
        //return sumatorio;
        
        return sumatorio / lista.length;
    }

    
}
