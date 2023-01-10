package proyectos.Nacef;

public class E015mediaArray {

    public static void main(String[] args) {
        E015mediaArray programa = new E015mediaArray();
        programa.inicio();
    }
    
    public void inicio(){
        int[]valores = {13, 21, 0, 12, 7};
        double resultado = media(valores);
        System.out.println("La media de los valores es : " + resultado);
    }
    
    public double media(int[]lista){
      double suma = 0;
        for(int i = 0; i < lista.length; i++){
           suma= suma + lista[i];
        }
        
        suma = suma / lista.length;
        return suma;
    }
    
    
    
}
