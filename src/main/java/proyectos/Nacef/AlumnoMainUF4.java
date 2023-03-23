package proyectos.Nacef;

import java.util.Scanner;


public class AlumnoMainUF4 {

   
    public static void main(String[] args) {
        //definir la estructura del array
        //no crear los objetos alumno
        AlumnoUF4 [] alumnos = new AlumnoUF4[3];
        
        Scanner entrada = new Scanner(System.in);
        
        //Pedir los datos de los alumnos
        System.out.println("Introducir nombre y nota media de los alumnos");
        
        String nombreSC;
        double notaSC;
        
        for(int i = 0; i < 3; i++){
            alumnos[i] = new AlumnoUF4();
            System.out.println("Alumno " + (i+1));
            System.out.println("Nombre: ");
            nombreSC = entrada.next();
            alumnos[i].setNombre(nombreSC);
            System.out.println("Nota: ");
            notaSC = entrada.nextDouble();
            alumnos[i].setNotaMedia(notaSC);
        }
        
        
        System.out.println("Datos introducidos: ");
        
        double sumaNotas = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Alumno " + (i+1));
            System.out.println("Nombre " + alumnos[i].getNombre());
            System.out.println("Nota " + alumnos[i].getNotaMedia());
            System.out.println("**********************************");
            
            sumaNotas += alumnos[i].getNotaMedia();
        }
        
        System.out.println("La media global es: " + sumaNotas / 3);
    }
    
}
