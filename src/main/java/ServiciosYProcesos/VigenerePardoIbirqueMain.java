package ServiciosYProcesos;

import java.util.Scanner;

//imports para las claves
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
//imp. para cifrado
import javax.crypto.Cipher;

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

    //Creamos un abecedario global para facil acceso de las funciones
    public char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    //claves
    private PublicKey clavePublica;
    private PrivateKey clavePrivada;

    public static void main(String[] args) {
        VigenerePardoIbirqueMain prog = new VigenerePardoIbirqueMain();
        prog.inicio();
    }

    public void inicio() {
        // Quiero: Menu(), FuncionDeEncriptación(), FunciónDesencriptado().
        // Opcional: Entidad certificadora.

        // flag
        boolean bandera = false;
        boolean bandera2 = false;
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
                    case 1 -> {
                        //Codificar

                        //Recogemos input
                        Scanner ent2 = new Scanner(System.in);
                        System.out.println("Paso 1 - Introduce el texto");
                        String miTexto;
                        miTexto = ent2.nextLine().toLowerCase();

                        System.out.println("Paso 2 - Introduce la clave");
                        String miClave;
                        miClave = ent2.nextLine().toLowerCase();

                        System.out.println(FuncionDeEncriptacion(miTexto, miClave));

                    }
                    case 2 -> {
                        //Desencriptar

                        //Recogemos input
                        Scanner ent3 = new Scanner(System.in);
                        System.out.println("Paso 1 - Introduce el texto");
                        String miTexto;
                        miTexto = ent3.nextLine().toLowerCase();

                        System.out.println("Paso 2 - Introduce la clave");
                        String miClave;
                        miClave = ent3.nextLine().toLowerCase();

                        System.out.println(FuncionDesencriptado(miTexto, miClave));
                    }
                    case 3 -> {
                        //Claves

                        //Recogemos input
                        Scanner ent4 = new Scanner(System.in);
                        System.out.println("Paso 1 - Generar clave pública (1) o privada (2), para retroceder (3)");

                        do {
                            if (ent4.hasNextInt()) {
                                int selector = ent4.nextInt();
                                switch (selector) {
                                    case 1 -> {
                                        //La publica
                                        generarClaves(selector);
                                        Scanner ent5 = new Scanner(System.in);
                                        System.out.println("Introduce el texto a cifrar:");

                                        String texto = ent5.nextLine().toLowerCase();
                                        try {
                                            String textoCifrado = cifrar(texto);
                                            System.out.println("Texto cifrado: " + textoCifrado);
                                        } catch (Exception e) {
                                            System.out.println("Error al cifrar el texto: " + e.getMessage());
                                        }

                                        bandera2 = true;
                                    }
                                    case 2 -> {
                                        //La privada
                                        generarClaves(selector);
                                        Scanner ent5 = new Scanner(System.in);
                                        System.out.println("Introduce el texto a descifrar:");

                                        String textoCifrado = ent5.nextLine().toLowerCase();
                                        try {
                                            String textoDescifrado = descifrar(textoCifrado);
                                            System.out.println("Texto descifrado: " + textoDescifrado);
                                        } catch (Exception e) {
                                            System.out.println("Error al descifrar el texto: " + e.getMessage());
                                        }

                                        bandera2 = true;
                                    }
                                    case 3 -> {
                                        bandera2 = true;
                                    }
                                    default -> {
                                        System.out.println("Por favor, introduce un número válido");
                                        ent4.next();
                                    }
                                }
                            }

                        } while (!bandera2);

                        //Ahora tenemos la clave registrada, debemos solicitar un texto a cifrar o descifrar
                    }
                    case 4 -> { //Salir
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
                           [1] - Encriptar
                           [2] - Descifrar
                           [3] - Generar claves
                           [4] - Salir
                           ***********************
                           """);
    }

    //Entra mi texto y mi clave, sale el texto entero cifrado
    String FuncionDeEncriptacion(String miTexto, String miClave) {
        /*String a = "";
        char letra;
        char claveBuffer;

        //Bucle para recorrer mi abecedario
        for (int i = 0; i < miTexto.length(); i++) {
            letra = miTexto.charAt(i);   
            
            //usamos "%" para el caracter correcto, la clave peude ser mas pequeña que el texto original
            claveBuffer = miClave.charAt(i % miClave.length());

            a += letras[cifrado(letra, claveBuffer)];
        }

        return a;
         */

        //Seccion GPT
        //Esta seccion esta hecha por chatGPT, he sido incapaz de corregir el error que me daba el texto anterior
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < miTexto.length(); i++) {
            char letra = miTexto.charAt(i);

            // Verificar si la letra es un carácter alfabético
            if (Character.isLetter(letra)) {
                char claveBuffer = miClave.charAt(i % miClave.length());
                int posicionCifrada = cifrado(letra, claveBuffer);

                // Verificar si la posición cifrada es un índice válido
                if (posicionCifrada != -1) {
                    resultado.append(letras[posicionCifrada]);
                } else {
                    // Puedes manejar el carácter no alfabético aquí (omitirlo, mostrar un mensaje, etc.)
                }
            } else {
                // Mantener caracteres no alfabéticos sin cambios
                resultado.append(letra);
            }
        }

        return resultado.toString();
        //FIN DE LA SECCION

    }

    //Entran el texto y la clave, sale solo un caracter cifrado, llamamos varias veces a esta funcion desde el bucle
    public int cifrado(char miTexto, char miClave) {
        int pos;
        int posClave;

        if (Character.isLetter(miClave)) {
            pos = new String(letras).indexOf(miTexto);
            posClave = new String(letras).indexOf(miClave);

            return (pos + posClave) % letras.length;
        } else {
            return -1;
        }
    }

    //Entra el texto cifrado y la clave, sale texto limpio
    //Es un clon de la encriptacion
    public String FuncionDesencriptado(String miTexto, String miClave) {
        String a = "";
        char letra;
        char claveBuffer;
        char letraDescifrada;
        int pos = 0;

        //Bucle para recorrer mi abecedario
        for (int i = 0; i < miTexto.length(); i++) {
            letra = miTexto.charAt(i);
            //usamos "%" para el caracter correcto, la clave peude ser mas pequeña que el texto original
            claveBuffer = miClave.charAt(i % miClave.length());

            //Ciframos la letra
            letraDescifrada = (char) ((letra - claveBuffer + 26) % 26 + 'a');

            a += letraDescifrada;

            pos = letra;
        }

        return a;
    }

    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    // Función para cifrar el texto
    public String cifrar(String texto) throws Exception {
        try {
            //Generamos una instancia de Cipher
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", "SunJCE");
            cipher.init(Cipher.ENCRYPT_MODE, clavePublica);

            //ciframos el texto
            byte[] bytesCifrados = cipher.doFinal(texto.getBytes());

            //devolvemos el texto cifrado
            return new String(bytesCifrados);
        } catch (Exception e) {
            throw new Exception("Error al cifrar el texto: " + e.getMessage());
        }
    }

    // Función para descifrar el texto
    public String descifrar(String textoCifrado) throws Exception {
        try {
            //Generamos una instancia de Cipher
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", "SunJCE");
            cipher.init(Cipher.DECRYPT_MODE, clavePrivada);

            //Desciframos el texto
            byte[] bytesDescifrados = cipher.doFinal(textoCifrado.getBytes());

            //Devolvemos el texto descifrado
            return new String(bytesDescifrados);
        } catch (Exception e) {
            throw new Exception("Error al descifrar el texto: " + e.getMessage());
        }
    }

    private void generarClaves(int tipoClave) {
        try {
            //Generamos las claves
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            //Guardamos las claves
            clavePublica = keyPair.getPublic();
            clavePrivada = keyPair.getPrivate();

            //Mostramos las claves
            if (tipoClave == 1) {
                System.out.println("Clave Pública Generada: " + clavePublica);
            } else if (tipoClave == 2) {
                System.out.println("Clave Privada Generada: " + clavePrivada);
            }

        } catch (Exception e) {
            System.out.println("Error al generar claves: " + e.getMessage());
        }
    }

}
