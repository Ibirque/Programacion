package proyectos.Nacef;


public class E012minimo {

    public static void main(String[] args) {
        E012minimo programa = new E012minimo();
        programa.inicio();
    }
    
    public void inicio(){
        int resultado = minimo(4,10);
        System.out.println("El menor es : " + resultado);
    }
    
    //Necesito parametros de entrada ?
    //Si, son nuestros numeros enteros
    
    public int minimo(int a, int b){
        int min = b;
        if(a<b){
            min = a;
        }
        return min;
    }
    
}
