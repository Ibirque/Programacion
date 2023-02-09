package proyectos.Nacef;

import java.util.Scanner;

public class WordleJava {

    public static final char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O',
        'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static void main(String[] args) {
        WordleJava programa = new WordleJava();
        programa.inicio();
    }

    public void inicio() {
        String fraseIntro = intro("");
        comprobacion(letras, fraseIntro);
    }

    public String intro(String fraseIntro) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("Introduce una frase");
            if (!entrada.hasNextInt()) {
                fraseIntro = entrada.nextLine().toUpperCase();
                salir = true;
            } else {
                System.out.println("Eso no es una frase valida");
                entrada.nextLine();
            }
        }
        return fraseIntro;
    }
    
    
    public String comprobacion(char[]tabla, String frase) {
        String fraseOriginal = "HOLA";
        for(int i = 0; i<fraseOriginal.length(); i++){
            if (frase.toUpperCase().charAt(i) == fraseOriginal.toUpperCase().charAt(i)){
                System.out.print(" 0 ");
            } else {
                System.out.print(" - ");
            }
        }
        
        return fraseOriginal;
    }
}
