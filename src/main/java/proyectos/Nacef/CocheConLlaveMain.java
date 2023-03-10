package proyectos.Nacef;


public class CocheConLlaveMain {

   
    public static void main(String[] args) {
        //instancia de un coche
        CocheConLlaveUF4 cocheA = new CocheConLlaveUF4();
        
        //acceder a los atributos
        cocheA.marca = "Opel";
        cocheA.kms = 1000f;
        cocheA.color = "rojo";
        
        cocheA.usarLlave("123");
        cocheA.mando("arranca");
        
        //llamar a los métodos de coche
        cocheA.arranca();
        cocheA.acelera();
        cocheA.gira();
        cocheA.frena();
        System.out.println("Es un " + cocheA.marca + " " + cocheA.color);
    }
    
}
