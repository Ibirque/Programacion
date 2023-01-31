package proyectos.Nacef;

import java.util.Arrays;


public class OueslatiNacef {
    
    public static final int[] TAM = new int[20];

    public static void main(String[] args) {
        OueslatiNacef programa = new OueslatiNacef();
        programa.inicio();
    }
    
    public void inicio(){
        tamaNum("1234565879");
    }
    
    
    
    public int tamaNum(String num) {
        //Convertir el string a numero
        int x = Integer.parseInt(num);
        //Crear una array de tamaño definido por nuestrostring
        int[] arr = new int[num.length()];

        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < num.length(); i++) {
            System.out.println(num.charAt(i));
            
            
            //arr[i] = Integer.parseInt(num.valueOf(num.charAt(i)));     
            arr[i] =  Character.getNumericValue(num.charAt(i));
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("El tamaño del numero " + num + " es de " + (num.length()));
        return 1;
    }
    
    public int NumSpen(int[]tab){
        int n;
        int m;
        int s;
        int num = 153;
        int contador = 0;
        
        int copyNum = num;
        
       for(int i = 1; i <= tab.length; i++){
           //System.out.println("ssw");
           n = num % 10;
           m = num / 10;
           int w = m % 10;
           s = num / 100;
           System.out.println(n);
           System.out.println(w);
           System.out.println(s);
       }
        
        
        return num;
    }

}
