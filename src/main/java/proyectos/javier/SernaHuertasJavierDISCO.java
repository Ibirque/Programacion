/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package proyectos.javier;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class SernaHuertasJavierDISCO {

    ArrayList<Disco> TECA = new ArrayList<>();
    boolean flag = false;

    public static void main(String[] args) {
        SernaHuertasJavierDISCO programa = new SernaHuertasJavierDISCO();
        programa.inicio();
    }
//Siempre ejecutamos 

    public void inicio() {
        do {
            Menu();
        } while (!flag);
    }
//Hacemos una entrada de datos universal en donde contemplamos varios casos.
//Usamos un numero de control para especificar que tipo de validacion necesitamos.

    public String entradadatos(int control) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        //Validación del menu
        if (control == 1) {
            do {
                if (sc.hasNextInt()) {
                    int x = sc.nextInt();
                    if (x >= 1 && x <= 5) {
                        flag = true;
                        // convertimos el int a string.
                        return x + "";
                    } else {
                        System.out.println("----------------------------");
                        System.out.println("   Elemento no encontrado.");
                        System.out.println("----------------------------");
                        sc.nextLine();
                    }
                } else {
                    System.out.println("----------------------------");
                    System.out.println("   Elemento no encontrado.");
                    System.out.println("----------------------------");
                    sc.nextLine();
                }
            } while (!flag);
//Validación de borrar y de modificar.
        } else if (control == 2) {
            do {
                if (sc.hasNextInt()) {
                    int x = sc.nextInt();
                    //Miramos el tamaño del array 
                    if (x <= TECA.size()) {
                        flag = true;
                        return x + "";
                    } else {
                        System.out.println("----------------------------");
                        System.out.println("Disco " + x + " no encontrado.");
                        System.out.println("----------------------------");
                        sc.nextLine();
                    }
                } else {
                    System.out.println("----------------------------");
                    System.out.println("Disco no encontrado.");
                    System.out.println("----------------------------");
                    sc.nextLine();
                }
            } while (!flag);

        }
        //Entrada general de string 
        return sc.nextLine();

    }

    public void Menu() {

        System.out.println("--------<   MENU   >--------");
        System.out.println("      [ 1 ] AÑADIR");
        System.out.println("      [ 2 ] MODIFICAR");
        System.out.println("      [ 3 ] BORRAR");
        System.out.println("      [ 4 ] LISTAR");
        System.out.println("      [ 5 ] SALIR");
        System.out.println("----------------------------");
// convertimos a int
        int var = Integer.parseInt(entradadatos(1));
        switch (var) {
            case 1:
                añadir();
                break;
            case 2:
                modificar();
                break;
            case 3:
                borrar();
                break;
            case 4:
                listar();
                break;
            case 5:
                salir();
                break;
            default:
                System.out.println("----------------------------");
                System.out.println("   Elemento no encontrado.");
                System.out.println("----------------------------");
        }
    }

public void añadir() {
    //instanciamos nuevo disco
    Disco nuevodisco = new Disco();
    //agregamos los parametros deseados
    //Creamos un ID ramdom
    System.out.println("ID");
    boolean flag = true;
    while (flag) {
        String id = (int) Math.floor(Math.random() * 99999 + 1) + "";
        boolean id_existe = false;
        for (int i = 0; i < TECA.size(); i++) {
            if (id.equals(TECA.get(i).getId())) {
                id_existe = true;
                break;
            }
        }
        if (!id_existe) {
            nuevodisco.setId(id);
            System.out.println(id);
            flag = false;
        }
    }
    
    System.out.println("Nombre");
    nuevodisco.setNombre(entradadatos(3));
    System.out.println("Genero");
    nuevodisco.setGenero(entradadatos(3));
    System.out.println("Grupo");
    nuevodisco.setGrupo(entradadatos(3));
    System.out.println("Tiempo");
    nuevodisco.setTiempo(entradadatos(3));
    //añadimos todos a la array
    TECA.add(nuevodisco);
}

    public void modificar() {
        //Comprobamos si hay algo que modificar si no lo hay devuelve error
        if (TECA.isEmpty()) {
            System.out.println("----------------------------");
            System.out.println("     NADA QUE MODIFICAR");
            System.out.println("----------------------------");
        } else {
            //Hacemos una lista resumida para poder saber que es lo que queremos modificar
            for (int i = 0; i < TECA.size(); i++) {
                System.out.println("--------<  Disco " + (i + 1) + "  >--------");
                System.out.println(TECA.get(i).getNombre());
            }
            System.out.println("Selecciona tu disco");

            int selector = Integer.parseInt(entradadatos(2));
            //Mismo preceso que el agregar disco
            Disco nuevodisco = new Disco();
            System.out.println("ID");
            nuevodisco.setId(entradadatos(3));
            System.out.println("Nombre");
            nuevodisco.setNombre(entradadatos(3));
            System.out.println("Genero");
            nuevodisco.setGenero(entradadatos(3));
            System.out.println("Grupo");
            nuevodisco.setGrupo(entradadatos(3));
            System.out.println("Tiempo");
            nuevodisco.setTiempo(entradadatos(3));
            //Modificamos en la posicion correcta
            TECA.set(selector - 1, nuevodisco);
        }
    }

    public void borrar() {
        //Comprobamos si hay algo que borrar si no lo hay devuelve error
        if (TECA.isEmpty()) {
            System.out.println("----------------------------");
            System.out.println("      NADA QUE BORRAR");
            System.out.println("----------------------------");
        } else {
            //Hacemos una lista resumida para poder saber que es lo que queremos modificar.
            for (int i = 0; i < TECA.size(); i++) {
                System.out.println("--------<  Disco " + (i + 1) + "  >--------");
                System.out.println(TECA.get(i).getNombre());
            }
            System.out.println("Selecciona tu disco");

            int selector = Integer.parseInt(entradadatos(2));
            //Borramos la posición seleccionada.
            TECA.remove(selector - 1);
        }
    }

    public void listar() {
        //Comprobamos si hay algo que borrar si no lo hay devuelve error
        if (TECA.isEmpty()) {
            System.out.println("----------------------------");
            System.out.println("      NADA QUE LISTAR");
            System.out.println("----------------------------");
        } else {
            //Lisamos
            for (int i = 0; i < TECA.size(); i++) {
                System.out.println("--------<  Disco " + (i + 1) + "  >--------");
                System.out.println(TECA.get(i).toString());
            }
        }
    }

    public void salir() {
        flag = true;
    }

}
