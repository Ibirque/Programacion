
package UF2;

public class E014arrayReales {


    public static void main(String[] args) {
        E014arrayReales programa = new E014arrayReales();
        programa.inicio();
    }
    
    public void inicio(){
        double[]valores = {1.3, -2.1, 0, 12.0, 4.7};
        double resultado = maximo(valores);
        System.out.println("El valor maximo del array es "+resultado);
    }
    
    public double maximo(double[]lista){
        //en el caso de que el usuario solo mande un numero, por defecto el maximo va a ser el primero
        double max = lista[0];
        
        //ahora comparamos con el resto de numeros en caso de haber mas de uno
        for(int i = 1; i < lista.length; i++){
            if(lista[i] > max){
                max = lista[i];
            }
        }      
        return max;
    }
    
}
