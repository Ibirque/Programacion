package proyectos.ibirque;

import java.text.Normalizer;
import java.util.Scanner;

public class CalcularDiasMes {

    public static void main(String[] args) {
        CalcularDiasMes programa2 = new CalcularDiasMes();
        programa2.inicio();
    }

    public void inicio() {
        
        int mes = recepcion();        
        diasMes(mes);

    }

    //Funcion de recepcion del input
    public int recepcion() {
        int M = 0;
        String mesTexto;
        String mesConvertido;
        int longitud;

        //febrero
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce el mes y te dire los dias");

        //transformamos el input a int
        if (ent.hasNextInt()) {
            M = ent.nextInt();
        } else {
            mesTexto = ent.nextLine();
            longitud = mesTexto.length() - 1;

            mesTexto = Normalizer.normalize(mesTexto, Normalizer.Form.NFD);
            mesTexto = mesTexto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

            System.out.println(mesTexto);
            //Transformamos en minusculas la frase original entera
            mesConvertido = mesTexto.toLowerCase();

            //meses de 30 dias abril, junio, septiembre, noviembre        
            //meses de 31 dias enero, marzo, mayo, julio, agosto, octubre y diciembre
            if (mesConvertido.equals("febrero")) {
                M = 28;
            } else if (mesConvertido.equals("abril") || mesConvertido.equals("junio") || mesConvertido.equals("septiembre") || mesConvertido.equals("junio") || mesConvertido.equals("noviembre")) {
                M = 30;
            }else if(mesConvertido.equals("enero") || mesConvertido.equals("marzo") || mesConvertido.equals("mayo") || mesConvertido.equals("julio") ||
                    mesConvertido.equals("agosto") || mesConvertido.equals("octubre") || mesConvertido.equals("diciembre")){
                M = 31;
            }else{
                System.out.println("Por favor introduce un mes valido, ya sea numero o nombre correcto");
                ent.nextLine();
            }

        }

        return M;
    }

    //selector de dia
    public void diasMes(int mesX) {

       if(mesX == 28){
           System.out.println("Tiene 28 dias!");
       }else if(mesX ==30){
           System.out.println("Tiene 30 dias!");
       }else{
           System.out.println("Tiene 31 dias!");
       }
       
    }

}
