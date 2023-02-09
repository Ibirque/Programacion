package proyectos.Nacef;


public class Reto {

    public static void main(String[] args) {
        Reto programa = new Reto();
        programa.inicio();
    }
    
    public void inicio(){
        double[]notas = {3.5, 5.75, 9.5, 8.5, 7.25};
        double resultado = media(notas);
        String nota = notaTexto(resultado);
        System.out.println("La media de las notas es : " + resultado + " y es " + nota);
    }
    
    public double media(double lista[]){
        double suma = 0;
        for(int i = 0; i < lista.length; i++){
           suma= suma + lista[i];
        }
        
        suma = suma / lista.length;
        return suma;
    }
    
    public String notaTexto(double nota){
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
