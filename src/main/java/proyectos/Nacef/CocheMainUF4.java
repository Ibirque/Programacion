package proyectos.Nacef;


public class CocheMainUF4 {

   
    public static void main(String[] args) {
        //crear una instancia de Coche
        CocheUF4 coche1 = new CocheUF4();
        CocheUF4 coche2 = new CocheUF4();
        
        //acceder a los atributos del coche
        coche1.marca = "VW";
        coche1.kms = 0f;
        coche1.color = "blanco";
        
        
        //llamar a los métodos del coche
        coche1.arranca();
        coche1.gira();
        
        System.out.println("Marca: " + coche1.marca);
    }
    
}
