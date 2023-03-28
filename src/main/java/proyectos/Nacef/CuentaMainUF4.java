package proyectos.Nacef;


public class CuentaMainUF4 {

   
    public static void main(String[] args) {
        CuentaUF4 C1 = new CuentaUF4("1", "Dani", 2500f);
        CuentaUF4 C2 = new CuentaUF4("2", "Ibir", 1700f);
        
        System.out.println("El credito de la primera cuenta es: " + C1.Credito(1500));
        System.out.println("El debito de la primera cuenta es: " + C1.Debito(400));
        System.out.println("El saldo que ha quedado en la cuenta despues de la transferencia: " + C1.Transferencia(C2, 1000));
        System.out.println("El credito de la segunda cuenta es: " + C2.getSaldo());
        
    }
    
}
