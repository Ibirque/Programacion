package proyectos.Ouxi;

import static java.lang.Thread.sleep;
import java.util.Scanner;

public class ApuestaCaballos {
    
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=======================================================================================================================\nBienvenido a la apuesta de carrera de caballos\nLas carreras duran al rededor de una hora y los caballos tienen que recorrer 10 kilometros para llegar al destino");
        System.out.println("=======================================================================================================================\n");
        System.out.println("Reglas basicas del juego:\n"
                + "1.Si ganas la apuesta duplicas las manodas invertidas\n"
                + "2.Si pierdas la apuesta, perderas las monedas invertidas para la ronda\n"
                + "3.Si se queda sin monedas se terminará el juego\n"
                + "4.Si dos caballos empatan, se cuenta como dos ganadores\n"
                + "5.Introduce 0 o un numero negativo para retirarse del juego\n"
                + "Si ya estas listo, comencemos con las apuestas\n");

        boolean salida2 = false;
        boolean salida = false;
        
        System.out.println("Cuantas monedas quieres ingresar al juego?");
        while (!entrada.hasNextInt()) {
            System.out.println("Valor incorrecto");
            entrada.next();
        }
        int monedasT = entrada.nextInt();

        do {
            if (monedasT < 1) {
                System.out.println("No introdujo dinero, entendemos que no quiere jugar");
                break;
            }
            System.out.println("Cuantas monedas quieres apostar en la siguiente ronda?");
            while (!entrada.hasNextInt()) {
                System.out.println("No has introducio un numero");
                entrada.next();
            }
            int monedas = entrada.nextInt();
            if (monedas > monedasT) {
                System.out.println("Saldo insuficiente");
                continue;
            }
            if (monedas < 1) {
                break;
            }
            System.out.println("Tenemos 4 caballos por cual quieres apostar?");
            do {
                while (!entrada.hasNextInt()) {
                    System.out.println("No has introducio un numero");
                    entrada.next();
                }
                int apostar = entrada.nextInt();
                if (apostar < 1 || apostar > 4) {
                    System.out.println("Tiene que ser un numero de 1-4\nIntroduce los datos de nuevo:");
                    continue;
                } else {
                    salida = true;
                }
                int acierta = 0;
                int caballo1 = 10;
                int caballo2 = 10;
                int caballo3 = 10;
                int caballo4 = 10;
                int caballoGanador = 10;
                int recorrido1 = 0;
                int recorrido2 = 0;
                int recorrido3 = 0;
                int recorrido4 = 0;
                int minutos = 2;

                while (caballoGanador != 0) {

                    for (int i = 0; caballoGanador != 0; i++) {
                        int numeroAleatorio1 = (int) (Math.random() * 2);
                        int numeroAleatorio2 = (int) (Math.random() * 2);
                        int numeroAleatorio3 = (int) (Math.random() * 2);
                        int numeroAleatorio4 = (int) (Math.random() * 2);
                        caballo1 = caballo1 - numeroAleatorio1;
                        recorrido1 = recorrido1 + numeroAleatorio1;

                        caballo2 = caballo2 - numeroAleatorio2;
                        recorrido2 = recorrido2 + numeroAleatorio2;

                        caballo3 = caballo3 - numeroAleatorio3;
                        recorrido3 = recorrido3 + numeroAleatorio3;

                        caballo4 = caballo4 - numeroAleatorio4;
                        recorrido4 = recorrido4 + numeroAleatorio4;

                        System.out.println("En los minutos " + minutos + ":");
                        System.out.println("El caballo numero 1 ha recorrido " + recorrido1 + " kilometros");
                        System.out.println("El caballo numero 2 ha recorrido " + recorrido2 + " kilometros");
                        System.out.println("El caballo numero 3 ha recorrido " + recorrido3 + " kilometros");
                        System.out.println("El caballo numero 4 ha recorrido " + recorrido4 + " kilometros");
                        System.out.println("");
                        minutos = minutos + 2;
                       sleep(2000);
                        if (caballo1 == 0) {
                            System.out.println("Ha ganado el caballo numero 1");
                            caballoGanador = caballoGanador = 0;
                            acierta = 1;
                        }
                        if (caballo2 == 0) {
                            System.out.println("Ha ganado el caballo numero 2");
                            caballoGanador = caballoGanador = 0;
                            acierta = 2;
                        }
                        if (caballo3 == 0) {
                            System.out.println("Ha ganado el caballo numero 3");
                            caballoGanador = caballoGanador = 0;
                            acierta = 3;
                        }
                        if (caballo4 == 0) {
                            System.out.println("Ha ganado el caballo numero 4");
                            caballoGanador = caballoGanador = 0;
                            acierta = 4;
                        }
                    }
                }

                if (apostar == acierta) {
                    monedasT = monedasT + (monedas * 2);
                    System.out.println("Felicidades, ha ganado la apuesta, consiguio " + monedas * 2 + " monedas");
                } else {
                    monedasT = monedasT - monedas;
                    System.out.println("Ha perdido las monedas invertidas (" + monedas + " monedas)");
                }
                System.out.println("Te quedan " + monedasT + " monedas\n");

                if (monedasT == 0 || monedasT < 0) {
                    System.out.println("Te has quedado sin monedas");
                    salida2 = true;
                }
            } while (!salida);
        } while (!salida2);
        System.out.println("Se acabo el juego");
    }
}


