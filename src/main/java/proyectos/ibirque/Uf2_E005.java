package proyectos.ibirque;

public class Uf2_E005 {

    //variable estatica
    //static int yes;
    static int contador = 1;

    public static void main(String[] args) {

        /* //llamamos a la funcion
        duplicarValor();
        duplicarValor();
        duplicarValor();
        duplicarValor();
        duplicarValor();
        //imprimir el valor
        System.out.println(contador);
        int contadores = 3;
        
        
        //IMPORTANTE
        //duplicarValores(contadores);
        //System.out.println(duplicarValores(5));
        
        contadores = duplicarValores(contadores);
        System.out.println(contadores);
        //declaracion del array
        int lista[] = new int[3];
        //inicializacion del array
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;
        
        duplicarValoresArray(lista);
        for(int i = 0; i <3; i++){
            System.out.println(lista[i]);
        }*/
        int contadorx = 1;
        duplicarValores(contadorx);
        System.out.println(contadorx);

    }

    //declaracion del metodo
    public static void duplicarValor() {
        contador = contador * 2;
    }

    public static int duplicarValores(int x) {
        x = x * 2;
        return x;
    }

    public static void duplicarValoresArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] * 2;
        }
    }

}
