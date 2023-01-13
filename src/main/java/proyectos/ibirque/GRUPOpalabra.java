package proyectos.ibirque;

import java.util.Scanner;

public class GRUPOpalabra {

    boolean banderaJuego = false;

    //Queremos generar una palabra completamente aleatoria ("fsadl" por ejemplo, maximo 5 letras)
    //Queremos un input del usuario
    //Queremos recorrer la palabra y si el usuario ha acertado, donde coincida la letra del usuario con la de la palabra indicarlo
    //cuando la letra exista pero no en la posicion correcta pondremos "X", y si no existe _
    public static void main(String[] args) {
        GRUPOpalabra programa = new GRUPOpalabra();
        programa.inicio();
    }

    private void inicio() {

        //LLamamos a las funciones
        //Funcion de juego
        //Funcion de generacion de palabra
        String palabraSecreta = generador();

        //Aqui inicia el juego
        while (!banderaJuego) {
            //Funcion de recoleccion de input
            String entrada = inputUsuario();
            //Funcion de print
            funcionPrint(entrada, palabraSecreta);
        }
    }

    public String generador() {
        String palabraSecreta = "";

        return palabraSecreta;
    }

    public String inputUsuario() {
        String palabra = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra de 5 letras, o la palabra salir!");
        palabra = entrada.nextLine();
        return palabra;
    }

    public void funcionPrint(String userInp, String palabraSec) {
        String[] strAr2 = {" _ ", " _ ", " _ "," _ "," _ "};  
        for (int i = 0; i <= 4; i++) {
            if (userInp.charAt(i) == palabraSec.charAt(i)) {                
                String s = "" + userInp.charAt(i);
                strAr2[i] = s;                
            }
            
            
        }
    }

}
