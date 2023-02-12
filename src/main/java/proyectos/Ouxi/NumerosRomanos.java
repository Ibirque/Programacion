package proyectos.Ouxi;

import java.util.Scanner;

public class NumerosRomanos {

    public static void main(String[] args) {
        NumerosRomanos programa = new NumerosRomanos();
        programa.inicio();
    }

    //Clase para invocar las clases
    public void inicio() {
        IntroducirN();
    }

    //Clase para introducir el numero y validar que sea numeros y no letras y que esté entre 
    //los enteros de 0 a 2000. La misma clase invoca la clase "conversion()"
    //cuando el usuario haya introducido un valor válido
    public void IntroducirN() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero de 0-2000");
        boolean salida = false;
        do {
            while (!entrada.hasNextInt()) {
                System.out.println("Introduce numeros porfavor\nPruebe de nuevo:");
                entrada.next();
            }
            int num = entrada.nextInt();
            if (num < 0 || num > 2000) {
                System.out.println("Tiene que ser un numero entre 0-2000");
            } else {
                salida = true;
                conversion(num);
            }
        } while (!salida);
    }

    //Clase para convertir los numeros normales en numeros romanos 
    //e imprimirlos.
    public void conversion(int num) {
        System.out.println("El numero introducido en romano es: ");
        do {
            if (num >= 1000) {
                System.out.print("M");
                num = num - 1000;
            } else {
                if (num >= 500) {
                    System.out.print("D");
                    num = num - 500;
                } else {
                    if (num >= 100) {
                        if (num >= 400) {
                            System.out.print("CD");
                            num = num - 400;
                        } else {
                            System.out.print("C");
                            num = num - 100;
                        }
                    } else {
                        if (num >= 50) {
                            System.out.print("L");
                            num = num - 50;
                        } else {
                            if (num >= 10) {
                                if (num >= 40) {
                                    System.out.print("XL");
                                    num = num - 40;
                                } else {
                                    System.out.print("X");
                                    num = num - 10;
                                }
                            } else {
                                if (num >= 5) {
                                    System.out.print("V");
                                    num = num - 5;
                                } else {
                                    if (num >= 1) {
                                        if (num >= 4) {
                                            System.out.print("IV");
                                            num = num - 4;
                                        } else {
                                            System.out.print("I");
                                            num = num - 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } while (num != 0);
    }
}
