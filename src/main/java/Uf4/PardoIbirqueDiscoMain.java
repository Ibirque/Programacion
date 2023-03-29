package Uf4;

import java.util.ArrayList;
import java.util.Scanner;

public class PardoIbirqueDiscoMain {

    /*MENU
    1-LISTAR
    2-AÑADIR
    3-BORRAR
    4-MODIFICAR
    5-SALIR
     */
    ArrayList<PardoIbirqueDisco> nombreDiscos = new ArrayList<>();

    public static void main(String[] args) {
        PardoIbirqueDiscoMain prog = new PardoIbirqueDiscoMain();
        prog.Menu();
    }

    public void Menu() {
        //Llamamos al menu
        TextoDefault();

        boolean flag = false;
        Scanner ent = new Scanner(System.in);
        int entrada = 0;

        //Bucle principal
        do {
            if (ent.hasNextInt()) {
                entrada = ent.nextInt();
                switch (entrada) {
                    case 1:
                        //Listar
                        Listar();
                        TextoDefault();
                        break;
                    case 2:
                        // 2-Anyadir
                        Anyadir();
                        TextoDefault();
                        break;
                    case 3:
                        // 3-Borrar
                        Borrar();
                        TextoDefault();
                        break;
                    case 4:
                        // 4-Modificar
                        Modificar();
                        TextoDefault();
                        break;
                    case 5:
                        // 5-Salir
                        flag = true;
                        break;
                    default:
                        // Volver a pregutnar
                        System.out.println("Opcion incorrecta vuelve a elegir");
                }
            } else {
                System.out.println("Escribe un numero del 1 al 5");
                ent.nextLine();
            }
        } while (!flag);
    }

    public void Listar() {
        //Listamos todos los elementos recorriendo el Arraylist     
        for (int i = 0; i < nombreDiscos.size(); i++) {
            System.out.println("" + nombreDiscos.get(i));
        }
    }

    public void Anyadir() {

        boolean bandera = false;
        int buffer;

        Scanner ent = new Scanner(System.in);
        //Nuestro constructor es el siguiente: Discos(String autor, String titulo, String genero, String id, int duracion)

        //Creamos nuevo objecto Disco
        PardoIbirqueDisco x = new PardoIbirqueDisco("", "", "", 0, 0);
        buffer = (nombreDiscos.size() + 1);

        /*SETTERS*/
        //Asignamos automaticamente el ID
        x.setId(buffer);

        System.out.println("\nIntroduce el autor");
        x.setAutor(ent.nextLine());

        System.out.println("\nIntroduce el titulo");
        x.setTitulo(ent.nextLine());

        System.out.println("\nIntroduce el genero");
        x.setGenero(ent.nextLine());

        System.out.println("\nIntroduce la duracion del album en minutos");

        do {
            if (ent.hasNextInt()) {
                x.setDuracion(ent.nextInt());
                System.out.println("Datos introducidos correctamente!");
                bandera = true;
            } else {
                System.out.println("Por favor introduce un numero");
                ent.nextLine();
            }
        } while (!bandera);
        //Mandamos a nuestro array el objeto correctamente creado
        nombreDiscos.add(x);

    }

    public void Borrar() {
        Scanner ent = new Scanner(System.in);
        int entrada = 0;
        boolean flag = false;

        System.out.println("***Lista de discos disponibles para borrar***\n");
        Listar();
        
        System.out.println("Introduce el Id del disco que quieras eliminar");
        do {
            if (ent.hasNextInt()) {
                //tenemos el int, comprobamos si nos pasamos del numero total de albumes que tenemos en neustro programa
                entrada = ent.nextInt();
                if (entrada > nombreDiscos.size() && entrada <= 0) {
                    //El usuario se ha pasado de listo, esta pidiendo algo que no existe, pedir de nuevo el input
                    System.out.println("Ese ID no esta registrado");
                    ent.nextLine();
                } else {
                    //Ahora llamamos al numero de disco                              
                    nombreDiscos.remove((entrada - 1));
                    System.out.println("El elemento numero " + entrada + " ha sido eliminado de la base de datos");
                    flag = true;
                }
            } else {
                //No ha introducido un numero valido
                System.out.println("Por favor introduce un numero valido");
                ent.nextLine();
            }
        } while (!flag);

        //Llamamos a la funcion actualizar para cambiar los ID de nuestros elementos
        Actualizar();
    }

    public void Modificar() {
        //Listamos los elementos para que el usuario pueda elegir
        System.out.println("***Lista de discos disponibles para editar***");
        Listar();
        //Ahora queremos modificar, le pregutnamos el numero y le listamos el elemento primero para que lo vea

        Scanner ent = new Scanner(System.in);
       
        int entrada;
        boolean flag = false;
        boolean bandera = false;
        int buffer;
        int duracion;

        System.out.println("Introduce el numero de ID que queiras modificar, de momento hay: " + nombreDiscos.size() + " discos registrados.");

        do {
            if (ent.hasNextInt()) {
                buffer = ent.nextInt();
                ent.nextLine();

                if (buffer <= nombreDiscos.size()) {
                    entrada = buffer - 1;

                    nombreDiscos.get(entrada).setId(buffer);

                    System.out.println("\nIntroduce el autor");
                    nombreDiscos.get(entrada).setAutor(ent.nextLine());

                    System.out.println("\nIntroduce el titulo");
                    nombreDiscos.get(entrada).setTitulo(ent.nextLine());

                    System.out.println("\nIntroduce el genero");
                    nombreDiscos.get(entrada).setGenero(ent.nextLine());

                    System.out.println("\nIntroduce la duracion del album en minutos");                    
                    
                    do{
                    if (ent.hasNextInt()) {
                        duracion = ent.nextInt();
                        nombreDiscos.get(entrada).setDuracion(duracion);
                        System.out.println("Datos introducidos correctamente!");
                        flag = true;
                    } else {
                        System.out.println("Por favor introduce un numero");
                    }
                    }while(!bandera);

                } else {
                    System.out.println("Por favor introduce un numero valido");
                    ent.nextLine();
                }

            } else {
                System.out.println("Por favor introduce el ID correcto");
                ent.nextLine();
            }
        } while (!flag);

    }

    public void TextoDefault() {
        System.out.println("""
                           ***********************
                           Elige que quieres hacer
                           [1] -Listar
                           [2] -Anyadir
                           [3] -Borrar
                           [4] -Modificar
                           [5] -Salir""");
    }

    public void Actualizar() {
        //Creo esta clase para actualizar los id tras borrar un elemento
        for (int i = 0; i < nombreDiscos.size(); i++) {
            System.out.println("Base de datos Actualizada");
            nombreDiscos.get(i).setId((i + 1));
        }
    }

}//FIN
