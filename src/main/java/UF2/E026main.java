
package UF2;

public class E026main {
    
    public static void main(String[] args) {
        E026estatica obj1 = new E026estatica();
        E026estatica obj2 = new E026estatica();
        
        //cada objeto tiene su copia
        //de una varaible de instancia
        obj1.x = 10;
        obj2.x = 23;
        
        System.out.println("Objeto1.x y objeto2.x son independientes\n"+obj1.x+"\n"+obj2.x+"\n");
      
        
        //cada objeto comparte una copia de la variable estatica
        System.out.println("La variable  ESTATICA 'y' es compartida\n");
        E026estatica.y = 100;
        
        System.out.println("objeto1.suma()= "+obj1.suma() +" objeto2.suma()= "+ obj2.suma());
    }
    
}
