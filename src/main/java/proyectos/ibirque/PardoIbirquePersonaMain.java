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

        do {
            Menu();
            Scanner ent = new Scanner(System.in);
            if (ent.hasNextInt()) {
                entrada = ent.nextInt();
                switch (entrada) {
                    case 1:
                        // 1-Introducir
                        Introducir();
                        break;
                    case 2:
                        // 2-Listar
                        Listar();
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
        String buffer;
        int numeroDNI;
        PardoIbirquePersona x = new PardoIbirquePersona("", 0, 0, "OTRO", 0, 0);
        Scanner ent = new Scanner(System.in);

        /*DATOS PRIMARIOS*/
        //Nombre
        System.out.println("Introduce el nombre de la persona: ");
        x.setNombre(ent.nextLine());

        //Sexo
        System.out.println("Introduce el sexo de la persona[H o M, dejar en blanco para definirlo como otro]: ");
        buffer = ent.nextLine();
        buffer = buffer.toUpperCase();

        if (buffer.equals("H") || buffer.equals("M")) {
            x.setSexo(buffer);
        }

        //DNI
        while (!numFlag) {
            System.out.println("Introduce el numero del DNI solo");
            if (ent.hasNextInt()) {
                numeroDNI = ent.nextInt();
                if ((numeroDNI <= 99999999) && (numeroDNI > 0)) {
                    x.setNumDNI(numeroDNI);
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
        System.out.println("Introduce la altura en metros (Ej. 1,83)");
        float alturaTemp;
        do {
            if (ent.hasNextFloat()) {
                alturaTemp = ent.nextFloat();
                if(alturaTemp < 0.30 || alturaTemp > 2.40){
                    System.out.println("Los valores de altura deben estar entre 0.3m y 2.4m");
                }else{
                x.setAltura(alturaTemp);
                break;}
            } else {
                System.out.println("Por favor usa un formato valido, por ejemplo 2,03");
            }
        } while (true);

        //Edad
        System.out.println("Introduce la edad");
        int edadTemp;

        do {
            if (ent.hasNextInt()) {
                edadTemp = ent.nextInt();
                if (edadTemp <= 0 || edadTemp > 130) {
                    System.out.println("Los valores de edad de este programa estan contemplados entre el 0 y los 130 anyos");
                } else {
                    x.setEdad(edadTemp);
                    break;
                }
            } else {
                System.out.println("Por favor introduce un numero valido");
            }
        } while (true);

        //Peso
        System.out.println("Introduce el peso");
        int pesoTemp;
        do {
            if (ent.hasNextInt()) {
                pesoTemp = ent.nextInt();
                if (pesoTemp < 0 || pesoTemp > 640) {
                    System.out.println("El peso no es un valor aceptable para el ser humano");
                    ent.nextLine();
                } else {
                    x.setPeso(pesoTemp);
                    break;
                }
            } else {
                System.out.println("Por favor introduce un numero valido");
            }
        } while (true);

        System.out.println("Datos introducidos correctamente");
        datosPersonas.add(x);
    }

    public void Listar() {
        //Listamos todos los elementos recorriendo el Arraylist     
        for (int i = 0; i < datosPersonas.size(); i++) {
            //Pedimos los datos
            System.out.println("----------------");
            //System.out.println("ID: " + datosPersonas.get(i));
            System.out.println(datosPersonas.get(i).getNombre() + " con DNI " + datosPersonas.get(i).getNumDNI() + CalculoLetraDNI(datosPersonas.get(i).getNumDNI()));

            //Mayoria de edad
            System.out.println("Edad: " + datosPersonas.get(i).getEdad());
            if (MayoriaEdad(datosPersonas.get(i).getEdad())) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }
            System.out.println("Sexo: " + datosPersonas.get(i).getSexo());

            System.out.println("Peso: " + datosPersonas.get(i).getPeso());
            System.out.println("Altura: " + datosPersonas.get(i).getAltura());

            //Switch para imprimir el IMC
            switch (PesoIdeal(datosPersonas.get(i).getPeso(), datosPersonas.get(i).getAltura())) {
                case -1:
                    System.out.println("Peso por debajo de lo normal");
                    break;
                case 0:
                    System.out.println("Peso ideal");
                    break;
                case 1:
                    System.out.println("Sobrepeso");
                    break;
                default:
                    // Volver a preguntar
                    System.out.println("Algo ha malido sal");
                    Menu();
            }
            System.out.println("----------------");
        }
    }

    public char CalculoLetraDNI(int numeroDNI) {
        //Queremos devolver la letra de su DNI, usaermos el array siguiente
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        //Calculo del resto        
        return letras[numeroDNI % 23];
    }

    public int PesoIdeal(int peso, float altura) {
        //Queremos comprobar su peso ideal, usaremos la siguiente formula:
        /*
        Índice de Masa Corporal: peso en kg/(altura^2 en m)
        Si "IMC < 20" devolver -1 (Peso por debajo de lo normal)
        Si "IMC > 20 && IMC < 25" devolver 0 (Peso ideal)
        Si "IMC > 25" devolver 1 (Sobrepeso)
         */

        float IMC = peso / (altura * altura);
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean MayoriaEdad(int edad) {
        //Si edad > 18, es mayor de edad
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
