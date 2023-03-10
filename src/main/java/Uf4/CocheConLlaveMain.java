
package Uf4;

public class CocheConLlaveMain {

    public static void main(String[] args) {
        // intancia de un coche
        CocheConLlave cocheA = new CocheConLlave();
        
        //acceder a los atributos
        cocheA.marca = "onplel";
        cocheA.kms = 1000f;
        cocheA.color = "rongo";
        
        cocheA.UsarLlave("123");
        cocheA.mando("arranca");
        
        //llamar a los metodos coche
        cocheA.arranca();
        cocheA.acelera();
        cocheA.gira();
        cocheA.frena();
        System.out.println("Es un "+cocheA.marca +" "+ cocheA.color);
        
    }
    
}
