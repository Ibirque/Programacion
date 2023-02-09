
package UF2;


public class Uf2_E009paramValorArray {


    public static void main(String[] args) {
        Uf2_E009paramValorArray programa = new Uf2_E009paramValorArray();
        programa.inicio();
    }

    private void inicio() {
        int[]i = {13, 2, 8, 4, 5};
        System.out.println("Antes de invocar al metodo, \"num\" vale " + i[3]);
        modificarParametro(i);   
        System.out.println("Despues de invocar al metodo, \"num\" vale " + i[3]);
    }

    private void modificarParametro(int[]a) {
        a[3] = 0;
        System.out.println("se ha modificado el valor a "+a[3]);
    }
    
}
