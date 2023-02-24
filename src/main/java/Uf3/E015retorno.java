package Uf3;

import java.io.File;
import java.io.PrintStream;

public class E015retorno {

    public static void main(String[] args) {
        E015retorno prog = new E015retorno();
        prog.inicio();
    }

    public void inicio() {
        PrintStream escribe = null;
        try {
            File f = new File("C:/temp/Retorno.txt");
            escribe = new PrintStream(f);
            int valor = 1;
            escribe.print(valor);
            for (int i = 1; i < 20; i++) {
                if (i % 5 == 0) {
                    //Cada 5 elementos, salto de linea
                    escribe.print("\n");
                }else{
                    escribe.print(" ");
                }
                
                //Calcular el siguiente numero
                valor = valor * 2;
                //imprimir
                escribe.print(valor);

            }
            System.out.println("Fichero correctamente escrito");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        escribe.close();
    }

}
