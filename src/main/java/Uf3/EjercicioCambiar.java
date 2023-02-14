
package Uf3;

import java.io.File;
import java.util.Scanner;

public class EjercicioCambiar {


    public static void main(String[] args) {
        EjercicioCambiar prog = new EjercicioCambiar();
        prog.inicio();
    }

    public void inicio() {
        String ruta = Devolver();
        
        File originalDoc = new File(ruta);
        //File nuevoNombreDoc = new File("C:/temporal/mediaEjemplo.txt");
        
        //A - Cambiar el nombre
        //boolean resultado = originalDoc.renameTo(nuevoNombreDoc);
        //System.out.println("Se ha movido y renombrado el archivo: "+resultado);       
        
        //B - Eliminar extension
        File noExtensionDoc = new File("C:/temporal/mediaEjemplo");        
        //resultado = nuevoNombreDoc.renameTo(noExtensionDoc);
        boolean resultado = originalDoc.renameTo(noExtensionDoc);
        System.out.println("Se ha movido y renombrado el archivo: "+resultado);
        
        //ruta:  C:/temporal/media.txt
    }
    
    public String Devolver(){
        String hold;
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce la ruta: ");
        hold = ent.nextLine();
        return hold;
    }
    
}
