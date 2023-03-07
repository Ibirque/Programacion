package proyectos.practicas;

import java.io.File;
import java.util.Scanner;

public class PardoIbirqueTexto {

    //Leemos el fichero lorem
    //palabra fin como final
    //contar la cantidad de palabras que tiene
    //codigo comentado explicando lo mas exhaustivamente lo que se hace
    //Nombre ApellidoNombreTexto
    //Definimos marca, usaremos esto como punto final de nuestra lectura
    public static final String MARCA = "fin";

    public static void main(String[] args) {
        PardoIbirqueTexto prog = new PardoIbirqueTexto();
        prog.inicio();
    }

    public void inicio() {
        ContarLorem();
    }

    public void ContarLorem() {
        //Creamos un try para poder intentar acceder al archivo
        try {
            //Declaramos file 
            File f = new File("lorem.txt");
            //Scanner para recorrer todo neustro archivo
            Scanner lectura = new Scanner(f);

            //bandera
            boolean bandera = false;
            //Contador de palabras
            int counter = 0;
            while (!bandera) {
                //Guardamos los elementos leidos dentro de 
                //un string llamado palabra
                String palabra = lectura.next();

                //Si encontramos "MARCA" es decir "fin" paramos
                if (palabra.equals(MARCA)) {
                    bandera = true;
                } else {
                    counter++;
                }
            }
            System.out.println("He encontrado " + counter + " palabras");
            lectura.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
