package proyectos.Nacef;

import java.io.File;

public class E005Rename {

    public static void main(String[] args) {
        E005Rename prog = new E005Rename();
        prog.inicio();
    }
    
    public void inicio(){
        File origenCarpeta = new File("C:/temporal/fotos");
        File destinoCarpeta = new File("C:/temporal/media/fotos");
        File origenDocumento = new File("C:/temporal/temp.txt");
        File destinoDocumento = new File("C:/temporal/media/temp.txt");
        boolean resultado = origenCarpeta.renameTo(destinoCarpeta);
        System.out.println("Se ha movido y renombrado la carpeta: " + resultado);
        resultado = origenDocumento.renameTo(destinoDocumento);
        System.out.println("Se ha movido el documento: "+resultado);
    }
    
}
