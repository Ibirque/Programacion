package proyectos.Nacef;

import java.io.File;

public class E004GestionFicheros {

    public static void main(String[] args) {
        Uf3.E004GestionFicheros prog = new Uf3.E004GestionFicheros();
        prog.inicio();
    }

    public void inicio() {
        File fotos = new File("C:/temporal/fotos");
        File documento = new File("C:/temporal/documento.txt");
        boolean resultado = fotos.mkdir();
        System.out.println("Creada carpeta " + fotos.getName() + ": " + resultado);
        if (!resultado) {
            boolean delCarpeta = fotos.delete();
            System.out.println("Carpeta borrada " + fotos.getName() + ": " + delCarpeta);
            boolean delFichero = documento.delete();
            System.out.println("Documento borrado " + documento.getName() + ": " + delFichero);
        }

    }
}
