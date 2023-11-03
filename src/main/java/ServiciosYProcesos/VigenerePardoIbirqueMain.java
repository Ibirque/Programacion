package ServiciosYProcesos;

import java.util.Scanner;

/**
 * @author Ibirque Pardo 2º DAM
 */
/**
 * Queremos crear un programa que permita codificar y mas tarde descodificar un
 * mensaje mediante el uso del cifrado vigenere.
 *
 * Enunciado:
 *
 * Realizar un pograma de encriptación de datos que incorpore todos los aspectos
 * tocados en la clase.
 *
 * La base principal del programa será el CODE VIGENERE que empezamos a ver en
 * inicio del curso.
 *
 * Se tendran que aplicar tambien los paràmetros de CLAVE PUBlICA y CLAVE
 * PRIVADA.
 *
 * Los alumnos que quieran mejorar su nota podràn optar por mejorar el programa
 * usando una entidad certificadora.
 *
 */
public class VigenerePardoIbirqueMain {

    public static void main(String[] args) {
       VigenerePardoIbirqueMain prog = new VigenerePardoIbirqueMain();
       prog.inicio();
    }
    
    public void inicio(){
    // Quiero: Menu(), FuncionDeEncriptación(), FunciónDesencriptado().
        // Opcional: Entidad certificadora.

        // flag
        boolean bandera = false;
        int entrada;

        //Bucle infinito hasta que se cumpla el flag
        do {
            //Llamamos menu
            Menu();

            //recogemos input del usuario
            Scanner ent = new Scanner(System.in);

            //Validacion
            if (ent.hasNextInt()) {
                //Guardamos la entrada en una variable
                entrada = ent.nextInt();

                switch (entrada) {
                    case 1 -> //Codificar
                        FuncionDeEncriptacion();
                    case 2 -> //Desencriptar
                        FunciónDesencriptado();
                    case 3 -> { //Salir
                        System.out.println("Que tengas un buen dia");
                        bandera = true;
                    }
                    default -> {
                        //Mantenemos al usuario atrapado en nuestro bucle
                        System.out.println("Opcion incorrecta vuelve a elegir");
                        Menu();

                    }

                }
            }

        } while (!bandera);
    }

    public void Menu() {
        System.out.println("""
                           ***********************
                           Elige que quieres hacer
                           [1] - Introducir datos
                           [2] - Listar
                           [3] - Salir
                           ***********************
                           """);
    }

    public static void FuncionDeEncriptacion() {

    }

    public static void FunciónDesencriptado() {

    }

}
