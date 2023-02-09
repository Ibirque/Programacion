
package UF2;


public class E016notaATexto {

 public static void main(String[] args) {
        E016notaATexto programa = new E016notaATexto();
        programa.inicio();
    }
    
    public void inicio(){
        String notaFinal = notaT(7.8);
        System.out.println("La nota final es " + notaFinal);
    }
    
    //param entrada -> real, la nota
    //param salida -> string
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

