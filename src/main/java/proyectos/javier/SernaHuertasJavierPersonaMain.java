package proyectos.javier;

import java.util.ArrayList;
import java.util.Scanner;

public class SernaHuertasJavierPersonaMain {
    
    ArrayList<SernaHuertasJavierPersona> personas = new ArrayList<>();
    boolean flag = false;
    
    public static void main(String[] args) {
        SernaHuertasJavierPersonaMain programa = new SernaHuertasJavierPersonaMain();
        programa.inicio();
    }
    
    public void inicio() {
        do {
            menu();
        } while (!flag);
    }
    
    public String entradadatos(int control) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        //Validación de int
        if (control == 1) {
            do {
                if (sc.hasNextInt()) {
                    flag = true;
                    return sc.nextInt() + "";
                    
                } else {
                    error(1, 0);
                    sc.nextLine();
                }
            } while (!flag);
//Validación de borrar y de modificar.
        } else if (control == 2) {
            do {
                if (sc.hasNextDouble()) {
                    Double x = sc.nextDouble();
                    flag = true;
                    return x + "";
                    
                } else {
                    error(1, 0);
                    sc.nextLine();
                }
            } while (!flag);
//Validacion si el DNI es correcto            
        } else if (control == 3) {
            do {
                if (sc.hasNextInt()) {
                    String DNI = sc.next();
                    if ((DNI.length() < 9) || (DNI.length() == 1)) {
                        flag = true;
                        return DNI;
                    } else {
                        error(3, 0);
                        sc.nextLine();
                    }
                } else {
                    error(3, 0);
                    sc.nextLine();
                }
                
            } while (!flag);
            
        } else if (control == 4) {
            do {
                if (sc.hasNextInt()) {
                    int x = sc.nextInt();
                    //Miramos el tamaño del array 
                    if (x <= personas.size()) {
                        flag = true;
                        return x + "";
                    } else {
                        error(4, x);
                        sc.nextLine();
                    }
                } else {
                    error(4, 0);
                    sc.nextLine();
                }
            } while (!flag);
//comprobación del genero 
        } else if (control == 5) {
            
            String input = "";
            do {
                String x = sc.nextLine().toUpperCase();
                if (x.isEmpty()) {                    
                    flag = true;
                    input = "Otro";
                } else if (x.equals("H") || x.equals("M")) {                    
                    flag = true;
                    input = x;
                } else {
                    error(5, 0);
                }
            } while (!flag);
            return input;
        }
        //Entrada general de string 
        return sc.nextLine();
        
    }
    // Método para mostrar el menú principal y tomar acciones dependiendo de la opción elegida por el usuario
    public void menu() {
        System.out.println("--------<   MENU   >--------");
        System.out.println("      [ 1 ] AÑADIR");
        System.out.println("      [ 2 ] MODIFICAR");
        System.out.println("      [ 3 ] BORRAR");
        System.out.println("      [ 4 ] LISTAR");
        System.out.println("      [ 5 ] SALIR");
        System.out.println("----------------------------");
        
        int var = Integer.parseInt(entradadatos(1));
        
        switch (var) {
            case 1 ->
                añadir();
            case 2 ->
                modificar();
            case 3 ->
                borrar();
            case 4 ->
                listar();
            case 5 ->
                flag = true;
            default -> {
                System.out.println("----------------------------");
                System.out.println("   Elemento no encontrado.");
                System.out.println("----------------------------");
            }
        }
        
    }
    
    public void añadir() {
        String nombre;
        int edad;
        String DNI;
        String sexo;
        Double peso;
        Double altura;
        
        System.out.println("Nombre:");
        nombre = entradadatos(0);
        System.out.println("edad:");
        edad = Integer.parseInt(entradadatos(1));
        System.out.println("DNI:");
        DNI = entradadatos(3);
        System.out.println("Sexo:");
        sexo = entradadatos(5);
        System.out.println("Peso:");
        peso = Double.parseDouble(entradadatos(2));
        System.out.println("Altura:");
        altura = Double.parseDouble(entradadatos(2));
        //añadimos todos a la array
        SernaHuertasJavierPersona nuevapersona = new SernaHuertasJavierPersona(nombre, DNI, edad, sexo, peso, altura);
        personas.add(nuevapersona);
        System.out.println("Persona añadida correctamente.");
    }
    
    public void modificar() {
        String nombre;
        int edad;
        String DNI;
        String sexo;
        Double peso;
        Double altura;
        
        if (personas.isEmpty()) {
            System.out.println("----------------------------");
            System.out.println("     NADA QUE MODIFICAR");
            System.out.println("----------------------------");
        } else {
            //Hacemos una lista resumida para poder saber que es lo que queremos modificar
            for (int i = 0; i < personas.size(); i++) {
                System.out.println("--------<  Disco " + (i + 1) + "  >--------");
                System.out.println(personas.get(i).getNombre());
            }
            System.out.println("Selecciona una persona");
            int selector = Integer.parseInt(entradadatos(4));
            System.out.println("Nombre:");
            nombre = entradadatos(0);
            System.out.println("edad:");
            edad = Integer.parseInt(entradadatos(1));
            System.out.println("DNI:");
            DNI = entradadatos(3);
            System.out.println("Sexo:");
            sexo = entradadatos(5);
            System.out.println("Peso:");
            peso = Double.parseDouble(entradadatos(2));
            System.out.println("Altura:");
            altura = Double.parseDouble(entradadatos(2));
            //añadimos todos a la array
            SernaHuertasJavierPersona nuevapersona = new SernaHuertasJavierPersona(nombre, DNI, edad, sexo, peso, altura);
            personas.set(selector - 1, nuevapersona);
            System.out.println("Persona añadida modificada correctamente.");
        }
        
    }
    
    public void borrar() {
        //Comprobamos si hay algo que borrar si no lo hay devuelve error
        if (personas.isEmpty()) {
            System.out.println("----------------------------");
            System.out.println("      NADA QUE BORRAR");
            System.out.println("----------------------------");
        } else {
            //Hacemos una lista resumida para poder saber que es lo que queremos modificar.
            for (int i = 0; i < personas.size(); i++) {
                System.out.println("--------<  Persona " + (i + 1) + "  >--------");
                System.out.println(personas.get(i).getNombre());
            }
            System.out.println("Selecciona una persona");
            
            int selector = Integer.parseInt(entradadatos(2));
            //Borramos la posición seleccionada.
            personas.remove(selector - 1);
            System.out.println("Persona añadida borrada correctamente.");
        }
    }
    
    public void listar() {
        //Comprobamos si hay algo que listar si no lo hay devuelve error
        if (personas.isEmpty()) {
            System.out.println("----------------------------");
            System.out.println("      NADA QUE LISTAR");
            System.out.println("----------------------------");
        } else {
            //Listamos
            for (int i = 0; i < personas.size(); i++) {
                System.out.println("--------<  Persona " + (i + 1) + "  >--------");
                System.out.println(personas.get(i).toString());
            }
        }
    }
    
    public void error(int codigoerror, int aux) {
        switch (codigoerror) {
            case 1 ->
                System.out.println("----------------------------\nNo es un numero.\n----------------------------");
            case 2 ->
                System.out.println("----------------------------\nNo es un Double.\n----------------------------");
            case 3 ->
                System.out.println("----------------------------\nNo es un DNI.\n----------------------------");
            case 4 ->
                System.out.println("----------------------------\nPersona " + aux + " no encontrada.\n----------------------------");
            case 5 ->
                System.out.println("----------------------------\nMasculino, femenino u otro.\n----------------------------");
            default -> {
                
            }
        }
    }
}
