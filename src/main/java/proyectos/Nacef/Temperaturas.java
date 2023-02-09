package proyectos.Nacef;

import java.util.Scanner;

public class Temperaturas {

    //DeclaraciÃ³n de constantes
    private static final int SEMANAS = 52;

    //DeclaraciÃ³n de variables globales
    private boolean fin = false;
    private int numTemperaturas = 0; //Ã­ndice array
    private float[] temperaturas = new float[SEMANAS * 7];
    private int dia = 1;
    private int mes = 1;

    public static void main(String[] args) {
        Temperaturas programa = new Temperaturas();
        programa.inicio();
    }

    public void inicio() {
        //problema general
        while(!fin) {
            mostrarMenu();
            tratarOpcion();
        }
    }

    //PRIMER NIVEL DE DESCOMPOSICIÃ“N
    public void mostrarMenu() {
        System.out.println("Bienvenido al registro de temperturas");
        System.out.println("-------------------------------------");
        System.out.println("[RT] Registrar temperaturas semanales");
        System.out.println("[MD] Consultar la media");
        System.out.println("[DF] Consultar la diferencia mÃ¡xima");
        System.out.println("[FIN] Salir");
        System.out.println("OpciÃ³n:");
    }

    public void tratarOpcion() {
        Scanner entrada = new Scanner(System.in);
        String opcion = entrada.nextLine();
        if (opcion.equalsIgnoreCase("RT")) {
            regTempSemanal();
        } else if (opcion.equalsIgnoreCase("MD")) {
            mostrarMedia();
        } else if (opcion.equalsIgnoreCase("DF")) {
            mostrarDiferencia();
        }else if (opcion.equalsIgnoreCase("FIN")){
            salir();
        } else {
            System.out.println("OpciÃ³n incorrecta");
        }

    }

    //SEGUNDO NIVEL
    public void regTempSemanal() {
        //comprobar que queda espacio para 7 registros
        if ((numTemperaturas + 7) >= temperaturas.length) {
            System.out.println("No queda espacio para mÃ¡s temperaturas");
        } else {
            leerTempTeclado();
            calcularFecha();
        }
    }

    public void mostrarMedia() {
        if (numTemperaturas > 0) {
            System.out.print("\nHasta hoy ");
            mostrarFecha();
            System.out.print(" la media ha sido de ");
            calcularMedia();
            System.out.print(" ÂºC. ");
        } else {
            System.out.println("\nNo hay temperaturas registradas");
        }
    }

    public void mostrarDiferencia() {
        if (numTemperaturas > 0) {
            System.out.print("\nHasta hoy ");
            mostrarFecha();
            System.out.print(" la diferencia mÃ¡xima ha sido de ");
            calcularDiferencia();
            System.out.print(" ÂºC. ");
        } else {
            System.out.println("\nNo hay temperaturas registradas");
        }
    }

    public void salir() {
        //lo resolvemos luego
        fin = true;
    }

    //TERCER NIVEL
    public void leerTempTeclado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce las temperaturas de esta semana:");
        //contador de temperaturas leÃ­das (7)
        int numLeidas = 0;
        while (numLeidas < 7) {
            if (entrada.hasNextFloat()) {
                temperaturas[numTemperaturas] = entrada.nextFloat();
                numLeidas++;
                numTemperaturas++;
            } else {
                entrada.next();
            }
        }
        entrada.nextLine();

    }

    //nuevo mÃ©todo que de repente hemos necesitado
    public void calcularFecha() {
        //Â¿cuÃ¡ntos dÃ­as tiene el mes actual?
        int diasMesActual = 0;
        if (mes == 2) {
            diasMesActual = 28;
        } else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
            diasMesActual = 30;
        } else {
            diasMesActual = 31;
        }

        dia = dia + 7;
        //Â¿cuÃ¡ndo cambiamos de mes?
        if (dia > diasMesActual) {
            dia = dia - diasMesActual;
            mes++;
            //cambio de aÃ±o
            if (mes > 12) {
                mes = 1;
                dia = 1;
            }
        }

    }

    public void mostrarFecha() {
        System.out.print(dia + " de ");
        switch (mes) {
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
        }
    }

    public void calcularMedia() {
        float acumulador = 0;
        //para todas las temperaturas menores al Ã­ndice altual
        for (int i = 0; i < numTemperaturas; i++) {
            //sumar todas las temperaturas existentes en el array
            acumulador = acumulador + temperaturas[i];
        }
        //calcular la media al imprimir
        System.out.print((acumulador / numTemperaturas));
    }

    public void calcularDiferencia() {
        float max = temperaturas[0];
        float min = temperaturas[0];
        for (int i = 0; i < numTemperaturas; i++) {
            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
        }
        System.out.println((max - min));
    }

}