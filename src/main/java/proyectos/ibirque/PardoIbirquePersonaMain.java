package proyectos.ibirque;

import java.util.ArrayList;
import java.util.Scanner;

public class PardoIbirquePersonaMain {

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
                    case 1 -> // 1-Introducir
                        Introducir();
                    case 2 -> // 2-Listar
                        Listar();
                    case 3 -> {
                        // 3-Salir
                        System.out.println("Que tengas un buen dia!");
                        bandera = true;
                    }
                    default -> {
                        // Volver a preguntar
                        System.out.println("Opcion incorrecta vuelve a elegir");
                        Menu();
                    }
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
                if (alturaTemp < 0.30 || alturaTemp > 2.40) {
                    System.out.println("Los valores de altura deben estar entre 0.3m y 2.4m");
                } else {
                    x.setAltura(alturaTemp);
                    break;
                }
            } else {
                System.out.println("Por favor usa un formato valido, por ejemplo 2.03");
                ent.nextLine();
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
            System.out.println("----------------");
            //Esta linea tambien nos devuelve la letra del DNI
            System.out.println("" + datosPersonas.get(i).toString());

            //Pedimos el boleano de mayoria de edad
            if (datosPersonas.get(i).MayoriaEdad(datosPersonas.get(i).getEdad())) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }

            switch (datosPersonas.get(i).PesoIdeal(datosPersonas.get(i).getPeso(), datosPersonas.get(i).getAltura())) {
                case -1 ->
                    System.out.println("Peso por debajo de lo normal");
                case 0 ->
                    System.out.println("Esta en el peso ideal");
                case 1 -> {
                    System.out.println("Tiene sobrepeso");
                }
                default -> {
                    // Volver a preguntar
                    System.out.println("Opcion incorrecta vuelve a elegir");
                    Menu();
                }
            }
            System.out.println("----------------");
        }
    }

}
