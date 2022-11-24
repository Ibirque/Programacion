
package proyectos.ibirque;

import java.util.Scanner;


public class E002codificacion {


    //declaro variable global
    int[] lista = new int [10];
    
    public static void main(String[] args) {
       E002codificacion programa = new E002codificacion();
       programa.inicio();
    }
    
    public void inicio(){
        //instrucciones del metodo principal que resuelven el problema general
        LeerLista();
        OrdenarLista();
        ImprimirLista();
    }
    
    public void LeerLista(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escrbe 10 enteros");
        int indice = 0;
        while(indice<lista.length){
            if(entrada.hasNextInt()){
                lista[indice] = entrada.nextInt();
                indice++;
            }else{
                entrada.next();
            }
        }
        entrada.nextLine();
    }
    
    public void OrdenarLista(){
        for(int i = 0; i <lista.length-1;i++){
            for(int j = i+1; j<lista.length; j++){
                //si es mayor --> intercambiar
                if(lista[i]>lista[j]){
                    int cambio = lista[i];
                    lista[i] = lista[j];
                    lista[j] = cambio;
                }
            }
        }
    }
    
    public void ImprimirLista(){
        System.out.print("El array ordenado es: [ ");
        for(int i = 0; i<lista.length; i++){
            System.out.print(lista[i] + " ");
        }
        System.out.print("]");
    }
    
}
