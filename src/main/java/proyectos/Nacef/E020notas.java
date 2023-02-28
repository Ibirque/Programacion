package proyectos.Nacef;

import java.io.File;
import java.util.Scanner;


public class E020notas {

    public static final String MARCA = "fin";
   
    public static void main(String[] args) {
        E020notas programa = new E020notas();
        programa.inicio();
    }
    
    public void inicio(){
        try{
            File f = new File("Notas.txt");
            Scanner lectura = new Scanner(f);
            boolean leer = true;
            while(leer){
                String nombre = lectura.next();
                if(MARCA.equals(nombre)){
                    leer = false;
                } else {
                    String apellido = lectura.next();
                    System.out.println("Estudiante: " + nombre + " " + apellido);
                    double media = leerNotas(lectura);
                    System.out.println(" - Media: " + media);
                }
            }
        }catch(Exception e){
            System.out.println("Error leyendo estudiantes: " + e);
        }
    }
    
    //método de lectura de notas
    //param entrada --> Scanner
    //param salida --> nota medoa de la clase, double
    public double leerNotas(Scanner lectura){
        double res = 0;
        try{
            //lecturas
            int numNotas = lectura.nextInt();
            for(int i = 0; i < numNotas; i++){
                res = res + lectura.nextDouble();
            }
            //calcular media de las notas
            res = res / numNotas;
        }catch(Exception e){
            System.out.println("Eroor leyendo notas: " + e);
        }
        return res;
    }
    
    
}
