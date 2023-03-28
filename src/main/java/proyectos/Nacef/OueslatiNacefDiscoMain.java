package proyectos.Nacef;

import java.util.ArrayList;
import java.util.Scanner;

public class OueslatiNacefDiscoMain {

    ArrayList<Integer> arrDisc = new ArrayList<Integer>();

    public static void main(String[] args) {
        OueslatiNacefDiscoMain prog = new OueslatiNacefDiscoMain();
        prog.inicio();
    }

    public void inicio() {
        Introduccion();

        Scanner entrada = new Scanner(System.in);
        int nuevo = 0;
        boolean bandera = false;
        while (!bandera) {
            nuevo = entrada.nextInt();
            switch (nuevo) {
                case 1:
                    Listar();
                    break;
                case 2:
                    Introducir();
                    break;
                case 3:
                    Modificar();
                    break;
                case 4:
                    Borrar();
                    break;
                case 5:
                    bandera = true;
                    break;

            }
        }

    }
    
    public void Listar(){
        
    }
    
    public void Introducir(){
        System.out.println("Introduce los valores para añadir: ");
        for(int i = 0; i < arrDisc.size(); i++){
            arrDisc.add(i);
        }
    }
    
    public void Modificar(){
        
    }
    
    public void Borrar(){
        
    }
    
    
    

    public void Introduccion() {
        System.out.println("Elige un numero : \n 1) Listar \n 2) Introducir \n 3) Modificar \n 4) Borrar \n 5) Salir");
    }

}
