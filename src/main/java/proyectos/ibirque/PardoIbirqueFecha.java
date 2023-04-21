package com.mycompany.mavenproject1;

/*OBJETIVOS*/

 /*
    O1 - Pedimos una fecha y comprobamos si es correcta o no, 
    no hay mas de 32 dias, ni 14 meses etc.

    O2 - El programa avisara si la fecha introducida es de un año bisiesto
    Cualquier año divisible por 4 es año bisiesto
    Ejemplos: 1988, 1992, 1996

    Hay un error, un año que es divisible por 100, 
    solo es bisiesto si es divisible por 400
 */
public class PardoIbirqueFecha {

    /*ATRIBUTOS*/
    //de tipo entero
    private int mes;
    private int dia;
    private int año;

    /*CONSTRUCTOR*/
    public PardoIbirqueFecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    PardoIbirqueFecha() {
    }

    /*SETTERS*/
    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAño(int año) {
        this.año = año;
    }

    /*GETTERS*/
    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAño() {
        return año;
    }

    /*FUNCIONES*/
    public boolean bisiesto(int año) {
        //Comprobaremos si es bisiesto
        int calculo1 = this.año % 100;
        int calculo2;
        //Se puede divir entre 4?
        if (calculo1 == 0) {
            calculo2 = this.año % 400; //Es bisiesto
            return !(calculo2 > 1);
            //No es bisiesto
        } else {
            return !(this.año % 4 > 1);
        }

    }
    /*TO STRING*/
}
