package proyectos.Nacef;

import java.io.File;
import java.io.RandomAccessFile;

public class E022binario {

   
    public static void main(String[] args) {
        E022binario programa = new E022binario();
        programa.inicio();
    }
    
    public void inicio(){
        try{
            File f = new File("numeros.bin");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            //sin delimitadores
            //generar valores y escribir
            int valor = 1;
            for(int i = 0; i < 20; i++){
                raf.writeInt(valor);
                valor = valor * 2;
            }
            //medida de un entero --> 4 bytes
            //medida del fichero --> 4 * 20 = 80 bytes
            raf.close();
        }catch(Exception e){
            System.out.println("Error escribiendo datos: " + e);
        }
    }
    
}
