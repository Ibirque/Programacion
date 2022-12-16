
package UF2;


public class Uf2_E008ParamValor {


    public static void main(String[] args) {
        Uf2_E008ParamValor programa = new Uf2_E008ParamValor();
        programa.inicio();
    }

    private void inicio() {
        int num = 10;
        System.out.println("Antes de invocar al metodo, \"num\" vale " + num);
        modificarParametro(num);
        System.out.println("Despues de invocar al metodo, \"num\" vale " + num);
    }
    
    public void modificarParametro(int a){
        a = 0;
        System.out.println("Se ha modificado el valor de a " +a);
    }
    
}
