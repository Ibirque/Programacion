package proyectos.Ouxi;

import java.util.Scanner;

public class ExamenNota {

    public double notaP = 0;//Examen parcial
    public double notaF = 0;//Examen final
    public double NotaT = 0;//Nota teorica
    public double NotaFinal = 0;//Nota final
    double mediaP = 0;//Nota practicas

    public static void main(String[] args) {
        ExamenNota programa = new ExamenNota();
        programa.inicio();
    }

    //Clase inicial para invocar las otras clases
    public void inicio() {
        NotaParcial();
        NotaPractica();
        Suspenso();
    }

    //Calcula la nota final (30% de nota teorica y 70% de nota practica)
    //Esta clase se ejecuta al final del programa, y sólo funcionará si la nota final llego con un valor diferente a 1
    public void NotaF() {
        if (NotaFinal != 1) {
            double porcentajeT = 30;
            double porcentajeP = 70;
            double mul = 100;
            double calculoT = porcentajeT / mul;
            double calculoP = porcentajeP / mul;
            double resultadoT = calculoT * NotaT;
            double resultadoP = calculoP * mediaP;
            NotaFinal = resultadoT + resultadoP;
            System.out.println("La nota final es: " + NotaFinal);
        }
    }

    //Clase para introducir la nota parcial y validar que sea una nota (0-10) y que no sea letras
    public void NotaParcial() {
        Scanner entrada = new Scanner(System.in);
        boolean salida = false;
        System.out.println("Introduce la nota parcial del alumno");
        do {
            while(!entrada.hasNextDouble()){
                System.out.println("Introduce numeros porfavor:");
                entrada.next();
            }
            notaP = entrada.nextDouble();
            if (notaP > 10 || notaP < 0) {
                salida = false;
                System.out.println("Tiene que ser un numero entre 0 a 10");
            } else {
                salida = true;
            }
        } while (!salida);
        ExamenFinal();
    }

    //Clase para introducir la nota final y validar que sea nota (0-10) y que no sea letras
    public void ExamenFinal() {
        Scanner entrada = new Scanner(System.in);
        boolean salida = false;
        System.out.println("Introduce la nota final del alumno");
        do {
            while(!entrada.hasNextDouble()){
                System.out.println("Introduce numeros porfavor:");
                entrada.next();
            }
            notaF = entrada.nextDouble();
            if (notaF > 10 || notaF < 0) {
                salida = false;
                System.out.println("Tiene que ser un numero entre 0 a 10");
            } else {
                salida = true;
            }
        } while (!salida);
        NotaTeorica();
    }

    //Clase para calcular la nota teorica (60% de examen final y 40% de examen parcial)
    public double NotaTeorica() {
        System.out.println();
        double porcientoF = 60;
        double mul = 100;
        double porcientoP = 40;
        double calculoF = porcientoF / mul;
        double calculoP = porcientoP / mul;
        double resultadoF = calculoF * notaF;
        double resultadoP = calculoP * notaP;
        NotaT = resultadoP + resultadoF;
        System.out.println("La nota teorica del alumno es " + NotaT + "\n");
        return NotaT;
    }

    //Clase para introducir las notas de las dos practicas del alumno y validar que sea nota (0-10) y que no sea letras
    public double NotaPractica() {
        Scanner entrada = new Scanner(System.in);
        boolean salida = false;
        mediaP = 0;
        System.out.println("Introduzca las notas practicas del alumno.\nEjercicio 1:");
        do {
            while(!entrada.hasNextDouble()){
                System.out.println("Introduce numeros porfavor:");
                entrada.next();
            }
            double notaPractica1 = entrada.nextDouble();
            if (notaPractica1 > 10 || notaPractica1 < 0) {
                salida = false;
                System.out.println("Tiene que ser un numero entre 0 a 10");
                continue;
            } else {
                System.out.println("Ejercicio 2:");
                while(!entrada.hasNextDouble()){
                System.out.println("Introduce numeros porfavor:");
                entrada.next();
            }
                double notaPractica2 = entrada.nextDouble();
                if (notaPractica2 > 10 || notaPractica2 < 0) {
                    System.out.println("Tiene que ser un numero entre 0 a 10");
                    continue;
                } else {
                    salida = true;
                }
                mediaP = (notaPractica1 + notaPractica2) / 2;
            }
        } while (!salida);
        System.out.println("La media de las notas de las dos practicas es: " + mediaP);
        return mediaP;
    }

    //Clase para ver si el alumno ha suspendido o no en alguna de las notas finales (teorica y practica)
    //En caso de que haya suspendido con menos de 4 en algo, la nota final pasa a ser 1
    public void Suspenso() {
        if (NotaT < 4 || mediaP < 4) {
            NotaFinal = 1;
            System.out.println("La nota final es un 1");
        } else {
            NotaF();
        }
    }
}

//EL UNICO PROBLEMA QUE TUVE YO AL HACER ESTE EJERCICIO, ES QUE AL CALCULAR LOS PORCENTAJES DE LOS NUMEROS, ME DABA 0 TODO EL RATO, PORQUE POR EJEMPLO EL 30 PORCIENTO
//DE 50 SERA 30/100*50, PERO CLARO, PARA JAVA 30/100 ES 0 Y NO UN 0,3 QUE ES LO QUE SE NECESITA PARA SACAR EL CALCULO. PARA SOLUCIONAR EL PROBLEMA TUVE QUE CREAR DOUBLE'S 
//DEL 50 (PORCIENTO) Y UN DOUBLE DEL 100 (MULTIPLICAR).