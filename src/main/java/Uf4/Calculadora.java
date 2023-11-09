
package Uf4;

import javax.swing.JOptionPane;


public class Calculadora {
    //atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //metodos
    //pedir numeros
    public void leerNums(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el primer numero?"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el segundo numero?"));
        
    }
    
    //metodo sumar
    public void sumar(){
        suma = num1 + num2;
    }
    
    public void restar(){
        resta = num1 - num2;
    }
    
    public void multiplicacion(){
        multiplicacion = num1 * num2;
    }
    
    public void division(){
        division = num1 / num2;
    }
    
    public void imprimir(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
