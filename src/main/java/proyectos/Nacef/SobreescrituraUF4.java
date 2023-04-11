package proyectos.Nacef;


public class SobreescrituraUF4 {

    public static void main(String[] args) {
       AnimalUF4 a = new AnimalUF4();
       GatoUF4 g = new GatoUF4();
       
       a.comer();
       g.comer();
       
       g.respirar();
       g.maullar();
    }
    
}
