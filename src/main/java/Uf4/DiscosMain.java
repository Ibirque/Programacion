package Uf4;

import java.util.ArrayList;
import java.util.Scanner;

public class DiscosMain {

    /*MENU
    1-LISTAR
    2-AÑADIR
    3-BORRAR
    4-MODIFICAR
    5-SALIR
     */
    ArrayList<Object> nombreDiscos = new ArrayList<>();

    public static void main(String[] args) {
        DiscosMain prog = new DiscosMain();
        prog.Menu();
    }

    public void Menu() {
        //Esta clase nos imprime el menu, solo lo hara una vez
        TextoDefault();

        boolean flag = false;
        Scanner ent = new Scanner(System.in);
        int entrada = 0;

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
        //primero queremos pedir al usuario que es lo que quiere listar        
        for (int i = 0; i < nombreDiscos.size(); i++) {
            System.out.println("" + nombreDiscos.get(i));
        }
    }

    public void Anyadir() {
        //En la funcion añadir queremos crear un nuevo elemento desde cero, es decir generar un nuevo objeto
        //Para poder conseguir esto vamos a crear un array de tamaño X, mas adelante averiguaremos si podemos aumentar el tamaño del array

        int buffer;

        Scanner ent = new Scanner(System.in);
        //Nuestro constructor es el siguiente: Discos(String autor, String titulo, String genero, String id, int duracion)

        boolean bandera = false;
        do {

            String autor = "";
            String titulo = "";
            String genero = "";
            int duracion = 0;
            Discos x = new Discos(autor, titulo, genero, 0, duracion);
            buffer = (nombreDiscos.size() + 1);

            x.setId(buffer);

            System.out.println("\nIntroduce el autor");
            autor = ent.nextLine();
            x.setAutor(autor);

            System.out.println("\nIntroduce el titulo");
            titulo = ent.nextLine();
            x.setTitulo(titulo);

            System.out.println("\nIntroduce el genero");
            genero = ent.nextLine();
            x.setGenero(genero);

            //le asignamos nosotros el ID, en funcion del numero de discos guardado
            //lo asignamos directamente al crear el objeto, no hace falta llamarlo con el setter
            //totalDiscos[NUMDISCOS].setId(NUMDISCOS);
            System.out.println("\nIntroduce la duracion del album en minutos");
            if (ent.hasNextInt()) {
                duracion = ent.nextInt();
                x.setDuracion(duracion);
                System.out.println("Datos introducidos correctamente!");
                bandera = true;
            } else {
                System.out.println("Por favor introduce un numero");
            }
            nombreDiscos.add(x);

        } while (!bandera);

    }

    public void Borrar() {
        Scanner ent = new Scanner(System.in);
        int entrada = 0;
        boolean flag = false;

        System.out.println("Introduce un numero que ya exista en nuestra base de datos para poder borrarlo, de momento hay: " + NUMDISCOS + " discos registrados.");
        do {
            if (ent.hasNextInt()) {
                //tenemos el int, comprobamos si nos pasamos del numero total de albumes que tenemos en neustro programa
                entrada = ent.nextInt();
                if (entrada > NUMDISCOS && entrada <= 0) {
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
    }

    public void Modificar() {
        //listamos los elementos para que el usuario pueda elegir
        Listar();
        //Ahora queremos modificar, le pregutnamos el numero y le listamos el elemento primero para que lo vea

        Scanner ent = new Scanner(System.in);
        //Nuestro constructor es el siguiente: Discos(String autor, String titulo, String genero, String id, int duracion)

        //Listamos  
        int entrada = 0;
        boolean flag = false;
        int buffer;
        int duracion = 0;

        System.out.println("Introduce un numero que ya exista en nuestra base de datos, de momento hay: " + nombreDiscos.size() + " discos registrados.");

        do {
            if (ent.hasNextInt()) {
                entrada = ent.nextInt();
                if (entrada<(nombreDiscos.size()+1)) {
                 
                    
                    Discos x = new Discos("", "", "", 0, 0);
                    buffer = (nombreDiscos.size());

                    x.setId(entrada);

                    System.out.println("\nIntroduce el autor");
                    x.setAutor(ent.nextLine());

                    System.out.println("\nIntroduce el titulo");                   
                    x.setTitulo(ent.nextLine());

                    System.out.println("\nIntroduce el genero");
                    x.setGenero(ent.nextLine());

                    System.out.println("\nIntroduce la duracion del album en minutos");
                    if (ent.hasNextInt()) {
                        duracion = ent.nextInt();
                        x.setDuracion(duracion);
                        System.out.println("Datos introducidos correctamente!");
                        flag = true;
                    } else {
                        System.out.println("Por favor introduce un numero");
                    }
                    nombreDiscos.set(entrada, x);
                }else{
                    System.out.println("Por favor introduce un numero valido");
                    ent.nextLine();
                }
                
            } else {
                System.out.println("Por favor introduce un numero correcto");
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

}//FIN
