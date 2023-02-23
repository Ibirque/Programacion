package proyectos.Nacef;

import java.io.File;
import java.util.Scanner;

public class EjercicioE012 {

    public static void main(String[] args) {
        EjercicioE012 programa = new EjercicioE012();
        programa.inicio();
    }

    public void inicio() {
        try {
            //intentar abrir un fichero
            File f = new File("C:/Temp/Enteros.txt");
            Scanner lectura = new Scanner(f);
            int max = 0;
            for (int i = 0; i < 10; i++) {

                int valor = lectura.nextInt();
                System.out.println("Los numeros enteros: " + valor);
                if (max < valor) {
                    max = valor;
                }
                
            }
            System.out.println("El valor mayor es: " + max);
            //cerrar el fichero
            lectura.close();
        } catch (Exception e) {
            System.out.println("Algo ha fallado: " + e);
        }
    }

}
