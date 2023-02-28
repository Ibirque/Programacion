package Uf3;

import java.io.File;
import java.util.Scanner;

public class E020notas {

    public static final String MARCA = "fin";

    public static void main(String[] args) {
        E020notas prog = new E020notas();
        prog.inicio();
    }

    public void inicio() {
        try{
            File f = new File("Notas.txt");
            Scanner lectura = new Scanner(f);
            boolean leer = true;
            while(leer){
                String nombre = lectura.next();
                if(MARCA.equals(nombre)){
                    leer = false;
                }else{
                    String apellido = lectura.next();
                    System.out.println("Estudiantes: "+nombre+" "+ apellido);
                    double media = leerNotas(lectura);
                    System.out.println(" - Media " + media);
                }
            }
        }catch(Exception e){
            System.out.println("Error de lectura: "+e);
        }
    }

    //metodo de lectura de notas
    //para entrada -> Scanner
    //param salida ->  nota media de la clase, double
    public double leerNotas(Scanner lectura) {
        double res = 0;

        try {
            //lecturas
            //Numero de notas a leer, guardado en int 
            int numNotas = lectura.nextInt();
            for(int i = 0; i < numNotas; i++){
                res = res +lectura.nextDouble();
            }
            //calcular media de las notas
            res = res /numNotas;                       
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return 0.0;
        }
        return res;
        
    }

}
