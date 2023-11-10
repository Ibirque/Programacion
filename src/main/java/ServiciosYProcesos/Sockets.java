
package ServiciosYProcesos;

/**
 *
 * @author Ibirque
 */
public class Sockets {

    /**
     * Queremos utilizar los sockets para recibir la informacion del cliente y registrarla en el servidor (get index.html)
     * Para poder mandar informacion de nuevo al cliente utilizamos otro socket
     * 
     * PHP:
     * Es el mas viejo y rudimentario, generalmente usa un servidor web llamado Apache
     * al realizar una peticion (get index.php), lanza un programa que se llama php.exe, con el script index.php
     * 
     * rand();
     * if(...){
     *  echo "html"
     * }
     * 
     * php cada peticion supone un proceso, por lo que causa una sobrecarga, sin embargo,
     * si un proceso peta, el servidor no cae, porque el proceso es independiente
     * 
     * Sencillo, seguro, lento, lenguaje propio
     * 
     * NODE:
     * Es un solo proceso que esta recibiendo todas las peticiones, se queda esperando, cuando alguien abre un puerto empieza 
     * a generar una respuesta, cuando se abre otro puerto empieza a procesar la respuesta.
     * 
     * Si Node sufre un crash, deja de atender peticiones.     * 
     * 
     * Mas rapido, usa Javascript, Node usa JavaScript, es MonoHilo y MonoProceso
     * Node puede atender a varios clientes a la vez
     * 
     * Al crear objetos estructurados, podemos establecer una comunicacion
     * rapida de envio y recuperacion de los datos de un struct entre ambos
     * 
     * Mandamos una peticion (query) a la BBDD y nos devuelve 
     * una lista de resultados
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
