
package UF2;

public class Uf2_E010modificarParametroString {

    public static void main(String[] args) {
        Uf2_E010modificarParametroString programa = new Uf2_E010modificarParametroString();
        programa.inicio();
    }

    //Crear un programa que compruebe que, efectivamente, modificar el valor de un
    //parametro de entrada de la clase String, no tiene efecto sobre el valor original
    private void inicio() {
        String patata = "DamePatatas";
        System.out.println(patata);
        modificarString(patata);
        System.out.println(patata);
    }
    
    public void modificarString(String a){
        a = "Tengo Hambre";
        System.out.println("Se ha modificado el valor a " + a);
    }
    
}
