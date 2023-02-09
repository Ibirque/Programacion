package proyectos.Nacef;


public class E026main {

    public static void main(String[] args) {
       E026estatica obj1 = new E026estatica();
       E026estatica obj2 = new E026estatica();
       
       //cada objeto tiene su copia
       //de una variable de instancia
       
       obj1.x = 10;
       obj2.x = 23;
       
        System.out.println("Obj1.x y obj2.x son independientes\n" + obj1.x + "\n" + obj2.x);
        
        //cada objeto comporte una copia de la variable estatica
        System.out.println("La variable estatica 'y' es compartida");
        E026estatica.y = 100;
        
        System.out.println("obj1.suma()= " + obj1.suma() + " obj2.suma()= " + obj2.suma());
    }
    
}
