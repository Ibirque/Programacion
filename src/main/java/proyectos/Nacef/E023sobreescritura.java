package proyectos.Nacef;

import java.io.File;
import java.io.RandomAccessFile;

public class E023sobreescritura {

    public static void main(String[] args) {
        E023sobreescritura programa = new E023sobreescritura();
        programa.inicio();
    }
    
    public void inicio(){
        try{
            File f = new File("numeros.bin");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            //puntero en el primer type
            long puntero = raf.getFilePointer();
            System.out.println("Inicio: puntero en posición " + puntero);
            //sobreescribimos los cinco primeros valores
            for(int i = 0; i < 5; i++){
                raf.writeInt(-1);
            }
            //si el fichero original tiene mas de 5 datos
            //quedaran datos al final
            puntero = raf.getFilePointer();
            System.out.println("Final: puntero en posicion " + puntero);
            raf.setLength(puntero);
            raf.close();
            System.out.println("Fichero modificado");
        }catch(Exception e){
            System.out.println("Error escribiendo datos: " + e);
        }
    }
    
}
