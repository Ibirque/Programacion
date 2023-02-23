package Uf3;

import java.io.File;
import java.util.Scanner;

public class E013enetroMayor {

    public static void main(String[] args) {
        E013enetroMayor prog = new E013enetroMayor();
        prog.inicio();
    }

    public void inicio() {
        int max = 0;
        try {
            File f = new File("C:/Temp/ARGH.txt");
            Scanner en = new Scanner(f);
            for (int i = 0; i < 10; i++) {
                int valor = en.nextInt();
                if(valor>max){
                    max = valor;
                }
            }
        } catch (Exception e) {
            System.out.println("Hemos encontrado un problema: " + e);
        }
        System.out.println("El valor maximo del archivo es: "+max);
    }

}
