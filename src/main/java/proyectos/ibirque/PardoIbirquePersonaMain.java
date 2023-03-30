package proyectos.ibirque;

import java.util.ArrayList;
import java.util.Scanner;

public class PardoIbirquePersonaMain {

    /*     
    Crea un programa que haga lo siguiente:
    Pide al usuario el nombre, la edad, número del DNI, sexo, peso y altura.
    Para cada objeto instanciado (persona), deberá:
    Devolver la letra de su DNI
    Comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal.
    Indicar si es mayor de edad.
    Mostrar la información completa de cada objeto
     */
    //ESPECIFICACIONES
    /*
    - El sexo será ·”OTRO” por defecto, por si no se introduce H o M
    - Índice de Masa Corporal: peso en kg/(altura^2 en m)
    Declarar un método que calcule el IMC y devuleva:
    -1 si devueve un número entre menor que 20 (peso por debajo del normal)
    0 si devuelve un número entre 20 y 25 (peso ideal)
    1 si devuelve un número mayor que 25 (sobrepeso)
    
    -Array para calcular la letra del DNI:
    char letras[ ] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
     */
    //Hacemos un arraylist para guardar todos los datos
    ArrayList<PardoIbirquePersona> datosPersonas = new ArrayList<>();

    public static void main(String[] args) {
        PardoIbirquePersonaMain prog = new PardoIbirquePersonaMain();
        prog.inicio();
    }

    public void inicio() {
        //Queremos Menu(), CalculoLetraDNI(), PesoIdeal(), MayoriaEdad().
        boolean bandera = false;
        int entrada;
        Menu();

        do {
            Menu();
            Scanner ent = new Scanner(System.in);
            if (ent.hasNextInt()) {
                entrada = ent.nextInt();
                switch (entrada) {
                    case 1:
                        // 1-Introducir
                        Introducir();
                        Menu();
                        break;
                    case 2:
                        // 2-Listar
                        Listar();
                        Menu();
                        break;
                    case 3:
                        // 3-Salir
                        System.out.println("Que tengas un buen dia!");
                        bandera = true;
                        break;
                    default:
                        // Volver a preguntar
                        System.out.println("Opcion incorrecta vuelve a elegir");
                        Menu();
                }

            } else {
                System.out.println("Por favor introduce un numero valido");
                ent.nextLine();
            }
        } while (!bandera);
    }

    public void Menu() {
        System.out.println("""
                           ***********************
                           Elige que quieres hacer
                           [1] - Introducir datos
                           [2] - Listar
                           [3] - Salir
                           ***********************
                           """);
    }

    public void Introducir() {
        //Aqui introducimos datos de los usuarios
        //Queremos, nombre, la edad, número del DNI, sexo, peso y altura.

        boolean numFlag = false;
        int numeroDNI;
        PardoIbirquePersona x = new PardoIbirquePersona("", 0, 0, "OTRO", 0, 0);
        Scanner ent = new Scanner(System.in);

        /*DATOS PRIMARIOS*/
        //Nombre
        System.out.println("Introduce el nombre de la persona: ");
        x.setNombre(ent.nextLine());

        //Sexo
        System.out.println("Introduce el sexo de la persona[H o M, dejar en blanco para definirlo como otro]: ");
        if ((ent.nextLine().equals("H")) || (ent.nextLine().equals("M"))) {
            x.setSexo(ent.nextLine());
        } else {
            ent.nextLine();
        }
        
        //DNI
        
        while (!numFlag) {
                System.out.println("Introduce el numero solo");
                if (ent.hasNextInt()) {
                    numeroDNI = ent.nextInt();
                    if ((numeroDNI <= 99999999) && (numeroDNI > 0)) {
                        x.setNumDNI(ent.nextInt());
                        numFlag = true;
                    } else {
                        System.out.println("Numero invalido, introduce valores entre 0 y 99.999.999");
                    }
                } else {
                    System.out.println("Por favor, introduce solo el numero ahora");
                }
                ent.nextLine();
            }        
        
        /*DATOS SECUNDARIOS*/
        //Altura
        System.out.println("Introduce la altura en metros (Ej. 1.83)");
        do{
        if(ent.hasNextFloat()){
             x.setAltura(ent.nextFloat());
             break;
        }else{
            System.out.println("Por favor usa un formato valido, por ejemplo 2.03");
        }}while(true);

        //Edad
        System.out.println("Introduce la edad");
        do{
        if(ent.hasNextInt()){
             x.setEdad(ent.nextInt());
             break;
        }else{
            System.out.println("Por favor introduce un numero valido");
        }}while(true);
        
        //Peso
        System.out.println("Introduce el peso");
        do{
        if(ent.hasNextInt()){
             x.setEdad(ent.nextInt());
             break;
        }else{
            System.out.println("Por favor introduce un numero valido");
        }}while(true);
        
        System.out.println("Datos introducidos correctamente");
        datosPersonas.add(x);
    }

    public void Listar() {
        //Listamos todos los elementos recorriendo el Arraylist     
        for (int i = 0; i < datosPersonas.size(); i++) {
            System.out.println("" + datosPersonas.get(i));
        }
    }

    public char CalculoLetraDNI(int numeroDNI) {
        //Queremos devolver la letra de su DNI, usaermos el array siguiente
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
           
        //Calculo del resto        
        return letras[numeroDNI % 23];
    }

    public void PesoIdeal() {
        //Queremos comprobar su peso ideal, usaremos la siguiente formula:
        /*
        Índice de Masa Corporal: peso en kg/(altura^2 en m)
        Si "IMC < 20" devolver -1 (Peso por debajo de lo normal)
        Si "IMC >20 && IMC < 25" devolver 0 (Peso ideal)
        Si "IMC > 25" devolver 1 (Sobrepeso)
         */
    }

    public void MayoriaEdad() {
        //Si edad > 18, es mayor de edad
    }
}
