package com.mycompany.mavenproject1;

import java.util.Scanner;

public class PardoIbirqueFechaMain {

    public static void main(String[] args) {
        PardoIbirqueFechaMain prog = new PardoIbirqueFechaMain();
        prog.inicio();
    }

    public void inicio() {
        PardoIbirqueFecha x = new PardoIbirqueFecha(0, 0, 0);

        //Banderas de control
        boolean uno = false;
        boolean dos = false;
        boolean tres = false;
        boolean exit = false;

        int buffer;

        //Bucle para atrapar al usuario
        do {
            //REGISTRO DE DIA
            do {
                /*Pedimos al usuario que introduzca datos*/
                Scanner ent = new Scanner(System.in);

                System.out.println("Introduce una fecha, empezando por el dia");
                if (ent.hasNextInt()) {
                    buffer = ent.nextInt();
                    if (buffer >= 32) {                        
                        System.out.println("No es valido, los meses no tienen ams de 32 dias");
                        ent.nextLine();                        
                    } else {
                        x.setDia(buffer);
                        uno = true;   
                    }
                } else {
                    System.out.println("No es un numero valido, por favor introduce un numero entre 1 y 31");
                    ent.nextLine();
                }
            } while (!uno);

            //REGISTRO DE MES
            do {
                /*Pedimos al usuario que introduzca datos*/
                Scanner ent = new Scanner(System.in);

                System.out.println("Introduce el mes");

                if (ent.hasNextInt()) {
                    buffer = ent.nextInt();
                    if (buffer > 12) {
                        System.out.println("No es un numero valido, por favor introduce un numero entre 1 y 12");
                        ent.nextLine();
                    }
                    
                    //Llamamos a dia para comprofar que no sea febrero 
                    if (x.getDia() > 28 && buffer == 2) {
                        System.out.println("Febrero no puede tener mas de 28 dias");
                        ent.nextLine();
                    } else {
                        x.setMes(buffer);
                        dos = true;
                    }
                    
                    
                } else {
                    System.out.println("No es un numero valido, por favor introduce un numero entre 1 y 12");
                    ent.nextLine();
                }
            } while (!dos);

            //REGISTRO DE AÑO
            do {
                /*Pedimos al usuario que introduzca datos*/
                Scanner ent = new Scanner(System.in);

                System.out.println("Introduce el año");

                if (ent.hasNextInt()) {
                    buffer = ent.nextInt();
                    x.setAño(buffer);
                    tres = true;
                    
                    if(x.bisiesto(buffer)){
                        System.out.println("Es bisiesto");
                    }else{
                        System.out.println("No es bisiesto");
                    }
                    
                } else {
                    System.out.println("No es un numero valido, por favor introduce un numero");
                    ent.nextLine();
                }
            } while (!tres);
            
        } while (!exit);
    }
}
