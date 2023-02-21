package proyectos.Nacef;


public class E009tryCatch {

  
    public static void main(String[] args) {
        E009tryCatch programa = new E009tryCatch();
        programa.inicio();
    }
    
    public void inicio(){
        try{
            System.out.println("Ejecución del bloque de instrucciones: ");
            System.out.println("Instrucción 1 ");
            System.out.println("Instrucción 2 ");
            System.out.println("Instrucción 3 ");
            int n = Integer.parseInt("M");
            System.out.println("Instrucción 4 ");
        }catch(Exception e){
            System.out.println("Se ha producido un error " + e);
        }
    }
    
}
