package proyectos.ibirque;

import java.util.Scanner;

public class Observatorio {

    //declaramos variables
    private static final int SEMANAS = 52;
    private float[] temperaturas = new float[SEMANAS * 7];
    //float array[7][52]
    private int newTemperaturas = 0;
    private int dia = 1;
    private int mes = 1;

    public static void main(String[] args) {

        //Temperaturas programa = new Temperaturas
        Observatorio programa = new Observatorio();
        programa.inicio();
        programa.salir();

    }

    public void inicio() {
        //problema general
        leerTempTeclado();
    }

    public void mostrarMenu() {

    }

    public void tratarOpcion() {
    }

    public void regTempSemanal() {

    }

    public void mostrarMedia() {

    }

    public void mostrarDiferencia() {

    }

    public void salir() {
        System.out.print("El array ordenado es: [");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + " ");
        }
        System.out.println("]");
    }

    //TERCER NIVEL
    public void leerTempTeclado() {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Introduce la temperatura " + (i + 1));
            if (entrada.hasNextFloat()) {
                temperaturas[i] = entrada.nextFloat();
            } else {
                System.out.println("Error, vuelve a introducir el valor");
                i--;
                entrada.next();
            }
        }
    }

    public void calcularFecha(){
        //¿cuantos dias tiene el ems actual?
        int diaMesActual = 0;
        if(mes == 2){
            diaMesActual = 28;
        }else if(mes == 4 || mes == 6 ||mes == 9 || mes == 11 ){
            diaMesActual = 30;
        }else{
            diaMesActual = 31;
        }
        
        dia = dia +7;
        //cuando cambiamos de mes
        if(dia > diaMesActual){
            dia = dia - diaMesActual;
            mes++;
        }
    }
    
    public void mostrarFecha() {

        Scanner entrada = new Scanner(System.in);
        boolean checker = false;
        int temp =0;
        String tempo;
        System.out.println("Pulsa S para salir en cualquier momento");
        do {
            System.out.println("Introduce el mes al que quieres acceder");
            if (entrada.hasNextInt()) {
                temp = entrada.nextInt();
            } else {
                tempo = entrada.nextLine();
                if ((tempo.charAt(0) == 's') || (tempo.charAt(0) == 'S')) {
                    checker = true;
                } else {
                    System.out.println("Error, vuelve a introducirlo");
                    entrada.next();
                }

            }

        } while (!checker);
        
        mes = temp;
        
        System.out.println(dia + " de ");
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Mayo");
                break;
            case 5:
                System.out.println("Abril");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
        }

    }

    public void calcularMedia() {
        
    }

    public void calcularDiferencia() {

    }

    //comprobar el dia de la semana
    //lun=1, mar=2 ... dom = 7
    //comprobar el null
    //esta clase retorna int, y depende del numero es lunes ... domingo
    //clase registrar
    //clase consultar media
    //bucle for comparar las temperaturas mayres o menores
    //clase cosultar la diferencia maxima
    //clase de cierre
    //clase de menu
    //printar y recoger el input y redireccionar al usuario a la clase correspondiente
//menu
    //imprimir texto
    //sucesion de system.out.println
    //no tiene que descomponerse mas
    //subproblema 2 - tratar el orden
    //leer orden por teclado
    //entrar registro de temp
    //mostrar temp media
    //mostrar dif maxima
    //finalizar la ejecucion del programa
    //tercer nivel de descomposicion
    //subproblema > entrar registro de temp semanalas
    //leer temp y ponerlas en el array
    //actualizar la fecha > NO es simple, hay que controlar que dia acaba cada mes (28,30,31)
    //mostrar menu
    /*tratar el orden
        a. entrar registro de temp
          i.leer temp por tecl
          ii.actualizar fecha
        b. mostrar temp media
          i.mostrar fecha
          ii.calcular temp media
        c. mostrar dif maxima
          i.mostrar fecha act
          ii.calcular dif maxima
        d. finalizar la ejecucion del programa */
    //esto es un ejeplo
}
