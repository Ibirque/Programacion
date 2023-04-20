/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectos.javier;

/**
 *
 * @author javie
 */
public class SernaHuertasJavierPersona {

    String nombre;
    int edad;
    String mayoria;
    String DNI;
    char Letra;
    String Sexo;
    double peso;
    double altura;
    double IMC;
    String categoria;
//constructor 
    public SernaHuertasJavierPersona(String nombre, String DNI,int edad, String Sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.Sexo = Sexo;
        this.peso = peso;
        this.altura = altura;
        //Campos calculados mediante funciones 
        this.Letra = calcularLetraDNI(Integer.parseInt(DNI));
        this.IMC = calcularIMC(peso, altura);
        this.categoria = categoria(IMC);
        this.mayoria = mayoria(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Calcular si la persona es mayor o menor de edad
    public String mayoria(int edad) {
        if (edad < 18) {
            return "menor de edad";
        } else {
            return "mayor de edad";
        }
    }

    // Calcular la letra del DNI
    public char calcularLetraDNI(int numeroDNI) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indiceLetra = numeroDNI % 23;
        return letrasDNI.charAt(indiceLetra);
    }

    // Calcular el índice de masa corporal (IMC)
    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Calcular la categoría del IMC
    public String categoria(double imc) {
        if (imc < 20) {
            return "Bajo peso";
        } else if (imc >= 20 && imc < 25) {
            return "Peso normal";
        } else {
            return "Sobrepeso";
        }
    }

    public SernaHuertasJavierPersona() {

    }

    @Override
    //print
    public String toString() {
        String cadena = "";
        cadena += "\nNombre: " + this.nombre;
        cadena += "\nEdad: " + this.edad;
        cadena += "\nDNI: " + this.DNI;
        cadena += "\nLetra: " + this.Letra;
        cadena += "\nSexo: " + this.Sexo;
        cadena += "\nPeso: " + this.peso;
        cadena += "\nAltura: " + this.altura;
        cadena += "\nIMC: " + this.IMC;
        cadena += "\nCategoria: " + this.categoria;
        return cadena;
    }
}
