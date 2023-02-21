
package Uf3;


public class E009tryCatch {


    public static void main(String[] args) {
        E009tryCatch prog = new E009tryCatch();
        prog.inicio();
    }

    public void inicio() {
        try{
            System.out.println("Ejecucion del bloque de instrucciones");
            System.out.println("Instruccion 1");
            System.out.println("Instruccion 2");
            System.out.println("Instruccion 3");
            //int n = Integer.parseInt("M");            
            System.out.println("Instruccion 4");
        }catch(Exception e){
            System.out.println("Se ha producido un error "+e);
        }
    }
    
}
