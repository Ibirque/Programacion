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
        MetodoA(ruta);
        MetodoB(ruta);
        //System.out.println("Se ha movido y renombrado el archivo: "+resultado);
        //ruta:  C:/temporal/media.txt
        //c:/kk/lll.txt
    }

    public void MetodoA(String A) {
        File originalDoc = new File(A);
        File nuevoNombreDoc = new File(originalDoc.getAbsolutePath() + originalDoc.getName());

        //A - Cambiar el nombre
        boolean resultado = originalDoc.renameTo(nuevoNombreDoc);
        System.out.println("Se ha movido y renombrado el archivo: " + resultado);

        //B - Eliminar extension
        File noExtensionDoc = new File("C:/temporal/mediaEjemplo");
        resultado = nuevoNombreDoc.renameTo(noExtensionDoc);
        System.out.println("Se ha movido y renombrado el archivo: " + resultado);
    }

    public void MetodoB(String B) {
        File originalDoc = new File(B);
        File nuevoNombreDoc = new File(originalDoc.getParent() + "/doc");

        boolean resultado = originalDoc.renameTo(nuevoNombreDoc);
        System.out.println("Se ha movido y renombrado el archivo: " + resultado);
    }

    public String Devolver() {
        String hold;
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce la ruta: ");
        hold = ent.nextLine();
        return hold;
    }

}
