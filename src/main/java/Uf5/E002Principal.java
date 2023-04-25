
package Uf5;

public class E002Principal {

    public static void main(String[] args) {
        // instancia de una ventana
        //E002Titulo ventana = new E002Titulo("Titulo molon");
        //mostrar la ventana
        //ventana.setVisible(true);
        
        E002Titulo ventanaID = new E002Titulo("Este es mi id "+getPID());
        ventanaID.setVisible(true);       
        
    }
    
    public static String getPID(){
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }
    
}
