package proyectos.Nacef;


public class CocheConLlaveUF4 {
    //atributos - declaración
    String marca;
    float kms;
    String color;
    private boolean acceso = false;
    
    public void usarLlave(String llave){
        if(llave.equals("123456")){
            acceso = true;
        } else {
            acceso = false;
            System.out.println("Te están robado el coche");
        }
    }
    
    public void mando(String accion){
        if(acceso == true){
            if(accion.equals("arranca")){
                arranca();
            }
        }
    }
    
    //métodos - declaración
    public void arranca(){
        System.out.println("método arranca");
    }
    
    
    public void acelera(){
        System.out.println("método acelera");
    }
    
    public void gira(){
        System.out.println("método gira");
    }
    
    public void frena(){
        System.out.println("método frena");
    }
}
