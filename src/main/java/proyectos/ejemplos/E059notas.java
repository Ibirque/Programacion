/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos.ejemplos;

/**
 *
 * @author javie
 */
public class E059notas {

   
    public static void main(String[] args) {
        //declaraciÃ³n del array notas
        float[][]notas = {
            {4.5f, 6f, 5f, 8f, 0f},
            {10f, 8f, 7.5f, 9.5f, 0f},
            {3f, 2.5f, 4.5f,6f, 0f},
            {6f, 8.5f, 6f, 4f, 0f},
            {9f, 7.4f, 7f, 8f, 0f},
        };
         
        //media aritmÃ©tica de TODOS
        float sumaFinales = 0;
        //recorrido por filas segÃºn i
        //cada fila es un estudiante
        
        //notas.length obtiene el nÃºmero de filas (estudiantes)
        for(int i = 0; i < notas.length; i++){
            //acumulador de notas de UN ESTUDIANTE
            float sumaEstudiante = 0;
            //recorrer cada fila
            //cada nota se indexa con j
            //notas[i].length nos darÃ¡ el nÃºmero de columnas
            for(int j = 0; j < notas[i].length; j++){
                //estoy en la Ãºltima nota?
                //al final de la fila tengo que calcular la media del alumno
                if(j!=(notas[i].length-1)){
                    //si no es la Ãºltima posiciÃ³n
                    //sigo acumulando valores
                    sumaEstudiante = sumaEstudiante + notas[i][j];
                } else {
                    //si no lo es, escribo la media
                    float notaFinal = sumaEstudiante / (notas[i].length-1);
                    notas[i][j] = notaFinal;
                    System.out.println("El estudiante " + i + " ha sacado un " + notaFinal);
                    //actualizar la suma de las medias de todos
                    sumaFinales = sumaFinales + notaFinal;
                }
            }
            //fin recorrido filas
        }
        //calcular la media
        //suma de finales dividido entre estudiantes
        
        float mediaFinal = sumaFinales / notas.length;
        System.out.println("La nota media del curso es " + mediaFinal);
                
    }
    
}
