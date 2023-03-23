
package Uf4;

import java.util.Scanner;

public class AlumnoMain {

    public static void main(String[] args) {
        //definir la estructura del array
        //no crear los objetos alumno
        Alumno[] alumnos = new Alumno[3];
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir nombre y nota media de los alumnos");
        
        String nombreSC;
        double notasSC;
        
        for(int i =0; i< 3; i++){
            alumnos[i] = new Alumno();
            System.out.println("Alumno "+(i+1));
            System.out.println("Nombre: ");
            nombreSC = entrada.next();
            alumnos[i].setNombre(nombreSC);
            System.out.println("Nota: ");
            notasSC = entrada.nextDouble();
            alumnos[i].setAlgo(notasSC);
        }
        
        System.out.println("Datos introducidos");
        
        double sumaNotas = 0;
        for(int i = 0; i <3; i++){
            System.out.println("Alumno "+(i+1));
            System.out.println("Nombre: "+alumnos[i].getNombre());
            System.out.println("Nota: "+alumnos[i].getAlgo());
            
            sumaNotas += alumnos[i].getAlgo();
        }
        
        System.out.println("La media global es: "+sumaNotas/3);
    }
    
}
