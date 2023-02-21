
package Uf3;

import java.io.File;


public class E011unidades {

 
    public static void main(String[] args) {
        E011unidades prog = new E011unidades();
        prog.inicio();
    }

    public void inicio() {
        
        try{
            File[] unidades = File.listRoots();
            for(int i = 0; i <unidades.length; i++){
                System.out.println(unidades[i] + " -Tamaño total: " + 
                        unidades[i].getTotalSpace()/1024/1024/1024 + " - Tamaño disponible: " +
                        unidades[i].getFreeSpace()/1024/1024/1024 + " xd");
                
            }
        }catch(Exception e){
            System.out.println("AAAAA" + e);
        }
    }
    
}
