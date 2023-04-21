package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class PardoIbirqueFacMain {

    ArrayList<PardoIbirqueFac> lista = new ArrayList();

    public static void main(String[] args) {
        PardoIbirqueFacMain prog = new PardoIbirqueFacMain();
        prog.inicio();
    }

    public void inicio() {

        boolean uno = false;

        do {
            System.out.println("Elige que quieres hacer\n1-Registrar\n2-Listar\n3-Descuento\n4-Salir ");
            Scanner en = new Scanner(System.in);
            int buffer;
            if (en.hasNextInt()) {
                buffer = en.nextInt();
                switch (buffer) {
                    case 1 ->
                        registrar();
                    case 2 ->
                        listar();
                    case 3 ->
                        descuento();
                    case 4 ->
                        uno = true;
                }
            } else {
                System.out.println("Opcion invalida");
            }
        } while (!uno);
    }

    //Registramos los objetos comprados
    public void registrar() {
        //Llamamos a la clase
        PardoIbirqueFac x = new PardoIbirqueFac("", 0, 0);

        boolean uno = false;
        boolean dos = false;
        boolean tres = false;

        Scanner en = new Scanner(System.in);
        System.out.println("Introduce los valores del item");

        do {
            //Seteamos nombre
            System.out.println("Introduce el nombre del articulo");
            x.setItem(en.nextLine());

            //seteamos cantidad
            do {
                System.out.println("Introduce la cantidad");
                if (en.hasNextInt()) {
                    x.setCantidad(en.nextInt());
                    dos = true;
                } else {
                    System.out.println("Introduce un valor correcto");
                    en.nextLine();
                }
            } while (!dos);

            //seteamos precio
            do {
                System.out.println("Introduce el precio");
                if (en.hasNextFloat()) {
                    x.setPrecio(en.nextFloat());
                    tres = true;
                } else {
                    System.out.println("Introduce un valor correcto");
                    en.nextLine();
                }
            } while (!tres);

            if (dos && tres) {
                lista.add(x);
                uno = true;
            }
        } while (!uno);
    }

    //Queremos listar los productos registrados
    public void listar() {
        boolean uno = false;

        //Indicamos la cantidad de items que tenemos almacenados
        System.out.println("Hay " + lista.size() + " items registrados en la lista");

        do {
            System.out.println("Elige que quieres hacer\n1-Listar un solo objeto\n2-Listar todo\n3-Volver a principal");
            Scanner en = new Scanner(System.in);
            int buffer;
            if (en.hasNextInt()) {
                buffer = en.nextInt();
                switch (buffer) {
                    case 1 ->
                        listarUno();
                    case 2 ->
                        listarTodo();
                    case 3 ->
                        uno = true;
                }
            } else {
                System.out.println("Opcion invalida");
            }
        } while (!uno);
    }

    public void listarUno() {
        boolean uno = false;
        Scanner en = new Scanner(System.in);
        System.out.println("Elige cual de los " + lista.size() + " items registrados quieres mostrar");
        int buffer;
        do {
            if (en.hasNextInt()) {
                buffer = en.nextInt() - 1;                
                //imprimimos el item
                System.out.println(lista.get(buffer).toString());
                uno = true;
            } else {
                System.out.println("Numero invalido!");
                en.nextLine();
            }
        } while (!uno);

    }

    public void listarTodo() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }

    public void descuento() {
        boolean uno = false;
        Scanner en = new Scanner(System.in);
        listarTodo();
        System.out.println("Elige a cual de los " + lista.size() + " quieres aplicarles el descuento");
        int buffer;
        do {
            if (en.hasNextInt()) {
                buffer = en.nextInt() - 1;                
                System.out.println(lista.get(buffer).descuento());                
                uno = true;
            } else {
                System.out.println("Numero invalido!");
                en.nextLine();
            }
        } while (!uno);
    }

}
