package proyectos.Nacef;

import java.util.ArrayList;
import java.util.Scanner;


public class DiscosMain {

     static Scanner scanner = new Scanner(System.in);
    static ArrayList<Discos> arrayDiscos = new ArrayList<>();
   
      

    public static void main(String[] args) {
        int opcion; // Declaración de la variable para almacenar la opción elegida por el usuario
        
        // Bucle do-while para mostrar el menú para que el usuario elija una opción
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1 - Listado");
            System.out.println("2 - Introducir");
            System.out.println("3 - Modificar");
            System.out.println("4 - Borrar");
            System.out.println("5 - Salir");
            System.out.println("Elija una opción:");
            opcion = scanner.nextInt();
            scanner.nextLine(); // para limpiar el buffer de entrada
            
            // Seleccionar la opción elegida por el usuario con switch-case
            switch (opcion) {
                case 1:
                    listarDiscos();
                    break;
                case 2:
                    introducirDisco();
                    break;
                case 3:
                    modificarDisco();
                    break;
                case 4:
                    borrarDisco();
                    break;
                case 5:
                    System.out.println("¡Has salido del menu!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
    }

    // Listar todos los discos de la colección
    public static void listarDiscos() {
        // Comprobar si el array está vacío
        if (arrayDiscos.size() == 0) {
            System.out.println("No hay nada para listar.");
        } else {
            // Si el no está vacío mostrar cada disco
            System.out.println("-----------");
            for (int i = 0; i < arrayDiscos.size(); i++) {
                Discos disco = arrayDiscos.get(i);
                System.out.println(disco);
            }
        }
    }

    // Introducir un nuevo disco en la colección
    public static void introducirDisco() {
        System.out.println("Introduzca el autor del disco:");
        String autor = scanner.nextLine();
        System.out.println("Introduzca el título del disco:");
        String titulo = scanner.nextLine();
        System.out.println("Introduzca el género del disco:");
        String genero = scanner.nextLine();
        System.out.println("Introduzca el ID del disco:");
        int id = scanner.nextInt();
        System.out.println("Introduzca la duración del disco en minutos:");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // para limpiar el buffer de entrada
        //Crear un nuevo objeto con datos entregados por el usuario
        Discos OueslatiNacefDisco = new Discos(autor, titulo, genero, id, duracion);
        //Agregar el nuevo disco al array
        arrayDiscos.add(OueslatiNacefDisco);
        System.out.println("Disco añadido");
    }

    // Modificar los datos de un disco de la colección
    public static void modificarDisco() {
        System.out.println("ID del disco que quieres modificar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // para limpiar el buffer de entrada
        boolean bandera = false;
        for (int i = 0; i < arrayDiscos.size(); i++) {
            Discos disco = arrayDiscos.get(i); //Obtener el disco actual del array recorrida
            if (disco.getId() == id) {//Si el ID en el array es igual al ID introducido
                System.out.println("Introduzca el nuevo autor del disco:");
                String newAutor = scanner.nextLine();
                System.out.println("Introduzca el nuevo título del disco:");
                String newTitulo = scanner.nextLine();
                System.out.println("Introduzca el nuevo género del disco:");
                String newGenero = scanner.nextLine();
                System.out.println("Introduzca la nueva duración del disco en minutos:");
                int newDuracion = scanner.nextInt();
                //Actualizar los datos que el usario quiere modificar
                disco.setAutor(newAutor);
                disco.setTitulo(newTitulo);
                disco.setGenero(newGenero);
                disco.setDuracion(newDuracion);
                System.out.println("El disco se ha modificado");
                bandera = true;//salir del bucle
                break;
            }
        }
        if (!bandera) {//Si booleano sigue falso entonces no hay datos para modificar en el array
            System.out.println("No hay disco con este ID");
        }
    }
    
    // Borrar un disco de la colección
    public static void borrarDisco() {
        System.out.println("ID del disco que quieres borrar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // para limpiar el buffer de entrada
        boolean bandera = false;
        for (int i = 0; i < arrayDiscos.size(); i++) {
            Discos disco = arrayDiscos.get(i);//Obtener el disco actual del array recorrida
            if (disco.getId() == id) {//Si el ID en el array es igual al ID introducido
                arrayDiscos.remove(disco);//Borrar el disco del array
                System.out.println("El disco se ha borrado");
                bandera = true;
                break;
            }
        }
        if (!bandera) {//Si booleano sigue falso entonces no hay datos para borrar en el array
            System.out.println("No hay disco con este ID");
        }
    }
    }
    

