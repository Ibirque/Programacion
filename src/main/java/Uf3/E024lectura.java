
package Uf3;

import java.io.File;
import java.io.RandomAccessFile;


public class E024lectura {

 
    public static void main(String[] args) {
        E024lectura prog = new E024lectura();
        prog.inicio();
    }
    
    public void inicio(){
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
