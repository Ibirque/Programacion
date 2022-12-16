
package UF2;


public class Uf2_E006 {


    public static void main(String[] args) {
        Uf2_E006 programa = new Uf2_E006();
        programa.inicio();
    }

    private void inicio() {
        mayorDosNumeros(13, 17);
        mayorDosNumeros(11, 12);
        mayorDosNumeros(119, 17);
        int a = 13;
        int b = 17;
        mayorDosNumeros(a, b);
    }
    
    //funcion que encuentra el mayor de dos valores
    public void mayorDosNumeros(int a, int b){
        System.out.print("\nEl maximo entre " +a+" y "+ b+" es:");
        if(a>b){
            System.out.print("\na-"+a);
        }else if(b>a){
            System.out.print("\nb-"+b);
        }else{
            System.out.println("\nSon iguales!");           
        }
    }
    
}
