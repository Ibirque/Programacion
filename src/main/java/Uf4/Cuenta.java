package Uf4;

public class Cuenta {

    private String id;
    private String nombre;
    private float saldo;

    public Cuenta(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cuenta(String id, String nombre, float saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    //Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    //Clases
    //credito(cantidad:float) devuelve float
    //Añadir la cantidad al saldo, devolver el nuevo saldo
    public float Credito(float cantidad) {
        this.saldo = this.saldo + cantidad;
        return this.saldo;
    }

    //debito(cantidad:float) devuelve float
    /*Si cantidad <= saldo, restar la cantidad al saldo 
    Si no imprimir "No hay saldo suficiente"
    Devolver el saldo*/
    public float Debito(float cantidad) {
        if (cantidad >= this.saldo) {
            System.out.println("El saldo es insuficiente\nEl saldo restante es: " + this.saldo);
            return cantidad;
        } else {
            this.saldo = this.saldo - cantidad;
            return this.saldo;
        }
    }

    //transferencia(otra:Cuenta, cantidad:float) devuelve float
    //igual que debito
    public float Transferencia(Cuenta Cuenta2, float cantidad) {
        if (cantidad < Cuenta2.saldo) {
            Cuenta2.saldo = Cuenta2.saldo - cantidad;
            this.saldo = this.saldo + cantidad;
            return this.saldo;
        } else {
            System.out.println("\n*****ADVERTENCIA*****\nEl saldo es insuficiente\nEl saldo restante es: "+this.saldo+"\n*****ADVERTENCIA*****\n");
            return 0;
        }
    }
    //tostring

}
