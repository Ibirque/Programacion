package proyectos.Nacef;

public class PR2_UF2_Main {

    public static void main(String[] args) {
        PR2_UF2_Main programa = new PR2_UF2_Main();
        programa.inicio();
    }
    
    public void inicio(){
        PR2_UF2 metodos = new PR2_UF2();
        int numero = metodos.IntroNum();
        metodos.factores(numero);
    }

}
