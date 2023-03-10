package proyectos.Nacef;

import javax.swing.JOptionPane;


public class CalculadoraUF4 {
    //atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    
    //métodos
    //pedir numéros
    public void leerNums(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Cual es el primer número ?"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Cual es el segundo número ?"));
    }
    
    //método sumar
    public void sumar(){
        suma = num1 + num2;
    }
    
    public void restar(){
        resta = num1 + num2;
    }
    
    public void multiplicar(){
        multiplicacion = num1 * num2;
    }
    
    public void dividir(){
        division = num1 / num2;
    }
    
    public void imprimir(){
        System.out.println("La suma es: " + suma);
        System.out.println("El resto es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
    
    
}
