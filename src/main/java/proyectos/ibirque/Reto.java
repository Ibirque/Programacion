
package proyectos.ibirque;



public class Reto {

public static void main(String[] args) {      
        Reto programa2 = new Reto();
        programa2.inicio();
    }

    public void inicio() {
        int [] valores = {6, 5, 3, 10, 4};
        double resultado = media(valores);
        
        String notaFinal = notaT(resultado);
        
        //System.out.println("La media aritmetica es " + resultado);
        System.out.println("Con un promedio de  " +resultado+" tu nota es un "+notaFinal);
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
    
        

     public String notaT(double nota){
        //nota tiene el valor que hay que tratar
        String texto = null;
        if((nota >=9) && (nota <=10)){
            texto = "Excelente";
        } else if((nota >=6.5) && (nota <9)) {
            texto = "Notable";
        }else if((nota >=5) && (nota <6.5)) {
            texto = "Suficiente";
        }else if((nota >=0) && (nota <5)) {
            texto = "Suspendido";   
        } else {
            texto = "Nota no vÃ¡lida";
        }
        return texto;
    }
    
}
