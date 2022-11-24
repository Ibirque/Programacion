
package proyectos.ibirque;

import java.util.Scanner;


public class E003calculo {

    int[] arr = new int[10];
    
    public static void main(String[] args) {
        E003calculo programa = new E003calculo();
        programa.inicio();
    }
    
    public void inicio(){
        LeerLista();
        OrdenarLista();
        ImprimirLista();
        CalcularLista();
    }
    
    public void LeerLista(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escrbe 10 enteros");
        int indice = 0;
        while(indice<arr.length){
            if(entrada.hasNextInt()){
                arr[indice] = entrada.nextInt();
                indice++;
            }else{
                entrada.next();
            }
        }
        entrada.nextLine();
    }
    
    public void OrdenarLista(){
        for(int i = 0; i <arr.length-1;i++){
            for(int j = i+1; j<arr.length; j++){
                //si es mayor --> intercambiar
                if(arr[i]>arr[j]){
                    int cambio = arr[i];
                    arr[i] = arr[j];
                    arr[j] = cambio;
                }
            }
        }
    }
    
    public void ImprimirLista(){
        System.out.print("El array ordenado es: [ ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }
    
    public void CalcularLista(){
        int mitad;
        mitad = arr[9]/2;
        
              
        for(int i = 0; i < arr.length; i++){
            if (arr[i] >= mitad){
                System.out.print(arr[i]+" ");
            }else{}
        }
        
        
    }
    
}
