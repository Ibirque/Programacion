package proyectos.Ouxi;

public class DaiOuxiang_Spencer {

    //Variables globales para trabajar en todas las clases
    public int num = 1; //Variable que se suma constantemente para ir validando si es Spencer o no
    public int cantidadSpencer = 0; //Variable que se sumará cuando un "num" es Spencer
    public int cantidad = 1; //Variable para mostrar la cantidad de Spencer que hay en la lista por orden

    public static void main(String[] args) {
        DaiOuxiang_Spencer tortilla = new DaiOuxiang_Spencer();
        tortilla.inicio();
    }

    //Uso inicio para que las validaciones se repitan hasta que nos de 20 numeros Spencer
    public void inicio() {
        do {
            CalcularDigitos();
            num++;
        } while (cantidadSpencer != 20);
    }

    //Clase para calcular la cantidad de digitos de nuestro int (num)
    //Hago uso de num2 como auxiliar, para no alterar el num para las siguientes clases
    public void CalcularDigitos() {
        int num2 = num;
        int digitos = 0;
        while (num2 != 0) {
            num2 = num2 / 10;
            digitos++;
        }
        CalcularPotencia(digitos);
    }

    //Clase para calcular la potencia de cada letra de "num".
    //Hago uso de num3 como auxiliar, por la misma razón de antes.
    public void CalcularPotencia(int digitos) {
        int num3 = num;
        //La lista de aux es donde meto todos los numeros de "num" digito por digito con la misma operación matemática.
        //que usé para el ejercicio de capicuá.
        int[] aux = new int[digitos];
        for (int i = 0; i < digitos; i++) {
            aux[i] = num3 % 10;
            num3 = num3 / 10;
            //Math.pow() para calcular las potencias de cada una de los elementos del array
            //y cambio el valor de los elementos del array por el de las potencias.
            aux[i] = (int) Math.pow(aux[i], digitos);
        }
        CalcularSumaP(digitos, aux);
    }

    //Clase para sumar todas las potencias.
    public void CalcularSumaP(int digitos, int[] aux) {
        int suma = 0;
        for (int i = 0; i < digitos; i++) {
            suma = suma + aux[i];
        }
        ValidacionSpencer(suma);

    }

    //Clase para validar, que las sumas sea o no un numero Spencer.
    public void ValidacionSpencer(int suma) {
        if (suma == num) {
            cantidadSpencer++;
            System.out.println("[" + cantidad + "] " + suma);
            cantidad++;
        }
    }
    //La mejora que apliqué es mostrar la lista de números Spencer enumerandolos por orden ([i]).
}