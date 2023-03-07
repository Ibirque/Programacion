package proyectos.practicas;

import java.io.File;
import java.io.RandomAccessFile;

public class PardoIbirqueBIN {

    /*Crear un archivo orientado a binario en el que se escriba una 
    secuencia de 5 valores enteros aleatorios. 
    Lee el fichero e imprimelo por la consola.
    Código comentado explicando lo más exhaustivamente posible 
    lo que se está haciendo
    Nombre del fichero: ApellidoNombreBIN.java */
    public static void main(String[] args) {
        PardoIbirqueBIN prog = new PardoIbirqueBIN();
        prog.inicio();
    }

    public void inicio() {
        File f = new File("EnterosAleatorios.bin");
        GenerarAleatorios(f);
        LeerFichero(f);

    }

    public void GenerarAleatorios(File f) {
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            //secuencia de 5 valores enteros aleatorios.         
            int valor;
            //creamos un numero random con Math, multiplicamos por cien
            //y convertimos a int, de esta manera perderemos todos los decimales
            for (int i = 0; i < 5; i++) {
                double valor2 = Math.random() * 100;
                valor = (int) valor2;
                raf.write(valor);
                System.out.println("Numero escrito: "+valor);
            }

            raf.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public void LeerFichero(File f) {
        try {
            //Accedemos solo en modo lecutra
            RandomAccessFile raf = new RandomAccessFile(f, "r");
            //definimos el tamaño(length) de nuestro archivo
            long distancia =  f.length();
            //int dist = (int)distancia;
            //usamos el length para recorrer el archivo
            /*Por desgracia creo que o bien se esta guardando o leyendo
            como string, al usar "raf.readInt()" no esta mostrando los
            datos correctamente, pero almenos para printar por pantalla
            sirve*/
            for(int i=0; i < distancia; i++){
                double valor = raf.read();               
                System.out.println("Se ha leido el valor: "+valor);
            }
            raf.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }          
    }

}
