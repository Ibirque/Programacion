package proyectos.Nacef;


public class E002PrincipalUF5 {

    
    public static void main(String[] args) {
        E002TituloUF5 ventana = new E002TituloUF5("Título molón");
        ventana.setVisible(true);
        
        E002TituloUF5 ventanaID = new E002TituloUF5("Este es mi id " + getPID());
        ventanaID.setVisible(true);
    }
    
    public static String getPID(){
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }
    
}
