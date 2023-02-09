package proyectos.Nacef;

import java.util.Scanner;

public class E018diasMes {

    public static void main(String[] args) {
        E018diasMes programa = new E018diasMes();
        programa.inicio();
    }

    public void inicio() {
        String resultado = mes(1, "Enero");
        System.out.println(resultado);
    }

    public String mes(int texto, String text ) {
        int aux;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un mes : ");
        
        if(entrada.hasNextInt()) {
            aux = entrada.nextInt();
            if (aux > 0 && aux < 13) {
                switch (aux) {
            case 1:
                text = "Enero tiene 31 días";
                break;
            case 2:
               text = "Febrero tiene 28 días";
                break;
            case 3:
                text = "Marzo tiene 31 días";
                break;
            case 4:
                text = "Abril tiene 30 días";
                break;
            case 5:
               text = "Mayo tiene 31 días";
                break;
            case 6:
                text = "Junio tiene 30 días";
                break;
            case 7:
                text = "Julio tiene 31 días";
                break;
            case 8:
               text = "Agosto tiene 31 días";
                break;
            case 9:
                text = "Septiembre tiene 30 días";
                break;
            case 10:
                text = "Octubre tiene 31 días";
                break;
            case 11:
              text = "Noviembre tiene 30 días";
                break;
            case 12:
                text = "Diciembre tiene 31 días";
                break;    
        }
            } else {
                System.out.println("Introduce el mes otra vez");
                entrada.nextLine();
            }
             
        }

       
        
        return text;

    }

}
