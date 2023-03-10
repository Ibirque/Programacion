
package Uf4;

public class CocheConLlave {
    //Estos son los atributos, aqui se hace la declaracion sin inicializarlos
    String marca;
    float kms;
    String color;
    private boolean acceso = false;
    
    public void UsarLlave(String llave){
        if(llave.equals("123456")){
            acceso = true;
        }else{
            acceso = false;
            System.out.println("Te estan robando el coche");
        }
    }
    
    public void mando(String accion){
        if(acceso == true){
            if(accion.equals("arranca")){
                arranca();
            }
        }
    }
    
    //metodos - declaracion
    public void arranca(){
        System.out.println("Metodo arrancar");
        
    }
    
    public void acelera(){
        System.out.println("Metodo acelera");
    }
    
    public void gira(){
        System.out.println("Metodo gira");
    }
    
    public void frena(){
        System.out.println("Metodo frena");
    }
}
