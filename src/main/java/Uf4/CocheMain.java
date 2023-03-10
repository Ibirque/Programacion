
package Uf4;

public class CocheMain {

    public static void main(String[] args) {
        // crear una instancia de Coche
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        
        //Accedemos a los atributos del coche
        coche1.marca = "VW";
        coche1.kms = 1.1f;
        coche1.color = "blanko";
        
        //llamar a los metodos del coche
        coche1.arranca();
        coche1.gira();
        //coche1.acelera();
         
       System.out.println("Marca: "+coche1.marca);
    }
    
}
