package Uf4;

import java.util.Scanner;

public class DiscosMain {

    /*MENU
    1-LISTAR
    2-AÑADIR
    3-BORRAR
    4-MODIFICAR
    5-SALIR
     */
    int NUMDISCOS = 0;
    Discos[] totalDiscos = new Discos[10];

    public static void main(String[] args) {
        DiscosMain prog = new DiscosMain();
        prog.Menu();
    }

    public void Menu() {
        //Esta clase nos imprime el menu, solo lo hara una vez
        System.out.println("""
                           Elige que quieres hacer
                           1-Listar
                           2-Anyadir
                           3-Borrar
                           4-Modificar
                           5-Salir""");

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
                        Menu();
                        break;
                    case 2:
                        // 2-Anyadir
                        Anyadir();
                        Menu();
                        break;
                    case 3:
                        // 3-Borrar
                        Borrar();
                        Menu();
                        break;
                    case 4:
                        // 4-Modificar
                        Modificar();
                        Menu();
                        break;
                    case 5:
                        // 5-Salir
                        Salir();
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
        
        Scanner ent = new Scanner(System.in);
        int entrada = 0;
        boolean flag = false;  
        String xd;
        
        System.out.println("Introduce un numero que ya exista en neustra base de datos, de momento hay: "+NUMDISCOS+" discos registrados.");
        do{
        if(ent.hasNextInt()){
            //tenemos el int, comprobamos si nos pasamos del numero total de albumes que tenemos en neustro programa
            entrada = ent.nextInt();
            if(entrada > NUMDISCOS){
                //El usuario se ha pasado de listo, esta pidiendo algo que no existe, pedir de nuevo el input
                System.out.println("Ese ID no esta registrado");
                ent.nextLine();
            }else{
                //Ahora llamamos al numero de disco                              
                xd = totalDiscos[entrada].toString();
                System.out.println(xd);
            }
            
            
        }else{
            //No ha introducido un numero valido
            System.out.println("Por favor introduce un numero valido");
            ent.nextLine();
        }
        }while(!flag);
        
        
        /*
        System.out.println("Datos introducidos");
        
        double sumaNotas = 0;
        for(int i = 0; i <3; i++){
            System.out.println("Alumno "+(i+1));
            System.out.println("Nombre: "+alumnos[i].getNombre());
            System.out.println("Nota: "+alumnos[i].getAlgo());
            
            sumaNotas += alumnos[i].getAlgo();
        }
        
        System.out.println("La media global es: "+sumaNotas/3);
        */
        
    }

    public void Anyadir() {
        //En la funcion añadir queremos crear un nuevo elemento desde cero, es decir generar un nuevo objeto
        //Para poder conseguir esto vamos a crear un array de tamaño X, mas adelante averiguaremos si podemos aumentar el tamaño del array

        NUMDISCOS = NUMDISCOS +1;
        

        Scanner ent = new Scanner(System.in);
        //Nuestro constructor es el siguiente: Discos(String autor, String titulo, String genero, String id, int duracion)

        boolean bandera = false;
        do {
            
            String autor="";
            String titulo="";
            String genero="";            
            int duracion = 0;
            totalDiscos[NUMDISCOS] = new Discos(autor,titulo,genero,NUMDISCOS,duracion);

            System.out.println("\nIntroduce el autor");
            autor = ent.nextLine();            
            totalDiscos[NUMDISCOS].setAutor(autor);

            System.out.println("\nIntroduce el titulo");
            titulo = ent.nextLine();
            totalDiscos[NUMDISCOS].setTitulo(titulo);

            System.out.println("\nIntroduce el genero");
            genero = ent.nextLine();
            totalDiscos[NUMDISCOS].setGenero(genero);
            
            //le asignamos nosotros el ID, en funcion del numero de discos guardado
            //lo asignamos directamente al crear el objeto, no hace falta llamarlo con el setter
            //totalDiscos[NUMDISCOS].setId(NUMDISCOS);

            System.out.println("\nIntroduce la duracion del album en minutos");
            if (ent.hasNextInt()) {
                duracion = ent.nextInt();
                totalDiscos[NUMDISCOS].setDuracion(duracion);
                System.out.println("Datos introducidos correctamente!");
                bandera = true;
            } else {
                System.out.println("Por favor introduce un numero");
            }
            
        } while (!bandera);

    }

    public void Borrar() {

    }

    public void Modificar() {

    }

    public void Salir() {

    }

}
