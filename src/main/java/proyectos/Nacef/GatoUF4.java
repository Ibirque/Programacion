package proyectos.Nacef;


public class GatoUF4 extends AnimalUF4 {
    //intente crear un método para que los gatos coman
    @Override
    public void comer(){
        System.out.println("Los gatos comen pescado");
    }
    
    @Override
    public void dormir(){
        System.out.println("Los gatos duermen");
    }
    
    public void maullar(){
        System.out.println("Los gatos maullan");
    }
}
