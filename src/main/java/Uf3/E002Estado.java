package Uf3;

import java.io.File;

public class E002Estado {

    public static void main(String[] args) {
        E002Estado prog = new E002Estado();
        prog.inicio();
    }

    public void inicio() {
        File temp = new File("C:/Temp");
        File prueba = new File("C:/Temp/Demo.txt");
        File documento = new File("C:/Temp/fotos/Prueba.txt");
        File ficheroRel = new File("C:/Carpeta/Documento.txt");

        mostrarRutas(temp);
        mostrarRutas(prueba);
        mostrarRutas(documento);
        mostrarRutas(ficheroRel);
    }

    public void mostrarRutas(File f) {
        System.out.println(f.getAbsolutePath() + " es un fichero? "+ f.isFile());
        System.out.println(f.getAbsolutePath() + " es una carpeta? "+ f.isDirectory());
        System.out.println("_____");
    }

}
