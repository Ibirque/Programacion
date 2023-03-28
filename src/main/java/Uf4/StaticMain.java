
package Uf4;

public class StaticMain {
    //declarar atributos de la clase
    //private String frase = "Frase molona";
    private static String frase = "Frase molona";
    
    //declarar un metodo estatico
    public static int suma(int n1, int n2){
        int suma = n1+n2;
        return suma;
    }
    
    //cada objeto hace una copia de los atributos no estaticos
    public static void main(String[] args) {
        //instanciamos dos objetos Static
        /*StaticMain uno = new StaticMain();
        StaticMain dos = new StaticMain();
        
        System.out.println(uno.frase);
        System.out.println(dos.frase);
        
        //cada objeto hace ua copia de todos los atributos NO estaticos
        
        dos.frase = "Frase Increible";
        
        System.out.println(dos.frase);
        
        System.out.println("*****");
        System.out.println(uno.frase);*/
        
        //el cambio es de CLASE, repercute en todos los objetos
        
        System.out.println(StaticMain.frase);
        
        //metodo estatico suma
        System.out.println("La suma es: " + StaticMain.suma(4, 6));
   }
    
}
