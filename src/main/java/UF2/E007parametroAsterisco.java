package UF2;

public class E007parametroAsterisco {

    //Crea un programa que llame varias veces a un metodo con un unico parametro de tipo entero
    //El metodo imprime tantos * como el valor del parametro
    public static void main(String[] args) {
        E007parametroAsterisco programa = new E007parametroAsterisco();
        programa.inicio();
    }

    private void inicio() {
        //asteriscos(7, 4);
        // asteriscos(5);
        //asteriscos(6);
         //asteriscos(19);
         escalera(13);

    }

    public void asteriscos(int a) {

        for (int i = 0; i < a; i++) {
                System.out.print("*");            
        }
        System.out.println("\n");
    }

    public void escalera(int a) {
        
        for (int i = 0; i < a; i++) {            
            System.out.println("");
            for(int j = 0; j <=i; j++){
                System.out.print("*");
            }
        }
       
        System.out.println("\n");
    }
    
    
    
}
