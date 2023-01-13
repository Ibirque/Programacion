package proyectos.ibirque;

import java.util.Scanner;

public class RecogerInputs {

    boolean tueInt, tueFloat, tueDouble, tueString = false;
    int X;
    
    
    public static void main(String[] args) {
        // Vamos a recoger los inputs del usuario y determinar que tipo de valor ha introducido
        RecogerInputs programa = new RecogerInputs();
        programa.inicio();
    }

    private void inicio() {
        inputUsuarioX();
        if(tueInt){
            return 1;
        }else if(tueFloat){
            return 2;
        } else if(tueDouble){
            return 3;
        }else{
            return 4;
        }
    }

    private void inputUsuarioX() {

        int x;
        float y;
        double z;
        String w;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce algo");

        if (entrada.hasNextInt()) {
            x = entrada.nextInt();
            //registroInt(x);
            tueInt = true;
            return x;
        } else if (entrada.hasNextFloat()) {
            y = entrada.nextFloat();
            //registroFloat(y);
            tueFloat = true;
            return y;
        } else if (entrada.hasNextDouble()) {
            z = entrada.nextDouble();
            //registroDouble(z);
            tueDouble = true;
            return z;
        } else {
            w = entrada.nextLine();
            //registroString(w);
            return w;
        }
    }

    public int registroInt(int X) {
        System.out.println("Es un entero " + X);
        tueInt = true;
        return X;
    }

    //float acepta 7 digitos
    public float registroFloat(float Y) {
        System.out.println("Es un float " + Y);
        tueFloat = true;
        //return 0.0f;
        return Y;
    }

    //double acepta 15 digitos
    public double registroDouble(double Z) {
        System.out.println("Es un double " + Z);
        tueDouble = true;
        //return 0.0;
        return Z;
    }

    public String registroString(String W) {
        System.out.println("Es un string " + W);
        tueString = true;
        return W;
    }

}
