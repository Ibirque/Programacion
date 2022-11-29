
package proyectos.ibirque;


public class Observatorio {

    //declaramos variables
    private static final int SEMANAS = 52;
    private float[] temperaturas = new float[SEMANAS*7];
    //float array[7][52]
    private int newTemperaturas = 0;
    private int dia = 1;
    private int mes = 1;
    
    
    public static void main(String[] args) {
        
        //Temperaturas programa = new Temperaturas
        Observatorio programa = new Observatorio();      
        programa.inicio();
    
    }
    
    public void inicio(){
        //problema general
    }
    
    public void mostrarMenu(){
        
    }
    
    public void gestionarMenu(){
        //validacion
    }

    public void mostrarMedia(){
        
    }
     
    public void mostrarMaxima(){
        
    }
    
    public void finalizar(){
        
    }
    public void leerPorTeclado(){
        
    }
    //comprobar el dia de la semana
        //lun=1, mar=2 ... dom = 7
        //comprobar el null
        //esta clase retorna int, y depende del numero es lunes ... domingo
    
    
    //clase registrar
    
    //clase consultar media
        //bucle for comparar las temperaturas mayres o menores
    
    //clase cosultar la diferencia maxima
    
    //clase de cierre

    //clase de menu
      //printar y recoger el input y redireccionar al usuario a la clase correspondiente
    
//menu
        //imprimir texto
        //sucesion de system.out.println
        //no tiene que descomponerse mas
    
    //subproblema 2 - tratar el orden
        //leer orden por teclado
        //entrar registro de temp
        //mostrar temp media
        //mostrar dif maxima
        //finalizar la ejecucion del programa
    
    //tercer nivel de descomposicion
        //subproblema > entrar registro de temp semanalas
        //leer temp y ponerlas en el array
        //actualizar la fecha > NO es simple, hay que controlar que dia acaba cada mes (28,30,31)

    
    //mostrar menu
    /*tratar el orden
        a. entrar registro de temp
          i.leer temp por tecl
          ii.actualizar fecha
        b. mostrar temp media
          i.mostrar fecha
          ii.calcular temp media
        c. mostrar dif maxima
          i.mostrar fecha act
          ii.calcular dif maxima
        d. finalizar la ejecucion del programa */                        
    
    
    
}
