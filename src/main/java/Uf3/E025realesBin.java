package Uf3;

import java.io.File;
import java.io.RandomAccessFile;

public class E025realesBin {

    public static void main(String[] args) {
        E025realesBin prog = new E025realesBin();
        prog.inicio();
    }

    public void inicio() {
        /**/
        //PREGUNTAR A MARIA
        /**/
        // E022binario test = new E022binario();
        GenerarNumeros();
        LeerNumeros();
    }

    public void GenerarNumeros() {
        try {
            File f = new File("numeros.bin");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            //sin delimitadores
            //generar valores y escribir
            int valor = 1;
            int valor2 = 2;
            int valor3 = 3;
            for (int i = 0; i < 50; i++) {
                raf.writeInt(i*2);
                //valor = i * 2;
                
            }

            System.out.println("Fichero escrito correctamente");
            //medida de un entero -> 4 bytes
            //medida del fichero -> 4*20 = 80 bytes
            raf.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void LeerNumeros() {
         try{
            File f = new File ("numeros.bin");
            RandomAccessFile raf = new RandomAccessFile(f,"r");
            long numEnteros =  f.length() / 4;
            System.out.println("Hay "+numEnteros + " enteros.");
            for(int i=0; i < numEnteros; i++){
                int valor = raf.readInt();
                System.out.println("Se ha leido el valor: "+valor);
            }
            raf.close();
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }

}
