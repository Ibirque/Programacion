
package Uf4;

public class CuentaMain {

    public static void main(String[] args) {
       Cuenta aaa = new Cuenta("001", "Carlos Javier", 1300);
       Cuenta bbb = new Cuenta("002", "Juan Carlos", 8000);
       
        System.out.println("La cuenta: "+aaa.getId() +" " + aaa.getNombre()+
                "\nCon saldo: "+aaa.getSaldo()+"€ Euros");
        
        aaa.Transferencia(bbb, 50000);
        
        System.out.println("\n*****\nRecibe una transferencia de la cuenta: "+ bbb.getId()+" "+bbb.getNombre());
        System.out.println("La cuenta: "+aaa.getId() +" " + aaa.getNombre()+
                "\nTiene un saldo final: "+aaa.getSaldo()+"€ Euros");
    }
    
}
