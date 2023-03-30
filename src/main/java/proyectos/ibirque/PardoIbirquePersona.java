package proyectos.ibirque;

public class PardoIbirquePersona {

    /*     
    Crea un programa que haga lo siguiente:
    Pide al usuario el nombre, la edad, número del DNI, sexo, peso y altura.
    Para cada objeto instanciado (persona), deberá:
    Devolver la letra de su DNI
    Comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal.
    Indicar si es mayor de edad.
    Mostrar la información completa de cada objeto
     */
    //ESPECIFICACIONES
    /*
    - El sexo será ·”OTRO” por defecto, por si no se introduce H o M
    - Índice de Masa Corporal: peso en kg/(altura^2 en m)
    Declarar un método que calcule el IMC y devuleva:
    -1 si devueve un número entre menor que 20 (peso por debajo del normal)
    0 si devuelve un número entre 20 y 25 (peso ideal)
    1 si devuelve un número mayor que 25 (sobrepeso)
    
    -Array para calcular la letra del DNI:
    char letras[ ] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
     */
    //Hacemos un arraylist para guardar todos los datos
    private String nombre;
    private int edad;
    private int numDNI;
    private String sexo;
    private int peso;
    private float altura;

    public PardoIbirquePersona(String nombre, int edad, int numDNI, String sexo, int peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.numDNI = numDNI;
        this.sexo = "Otro";
        this.peso = peso;
        this.altura = altura;
    }

    /*SETTERS & GETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(int numDNI) {
        this.numDNI = numDNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    /*TO STRING*/
    @Override
    public String toString() {
        String cadena = "\n-------------------------------";
        cadena += "\nNombre: " + this.nombre;
        cadena += "\nEdad: " + this.edad;        
        cadena += "\nSexo: " + this.sexo;
        cadena += "\nPeso: " + this.peso;
        cadena += "\nAltura: " + this.altura;
        cadena += "\nNumero de DNI: " + this.numDNI + CalculoLetraDNI(numDNI);
        return cadena;
    }

    /*CLASES ESPECIFICAS*/
    public char CalculoLetraDNI(int numeroDNI) {
        //Queremos devolver la letra de su DNI, usaermos el array siguiente
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        //Calculo del resto        
        return letras[numeroDNI % 23];
    }

    public int PesoIdeal(int peso, float altura) {
        //Queremos comprobar su peso ideal, usaremos la siguiente formula:
        /*
        Índice de Masa Corporal: peso en kg/(altura^2 en m)
        Si "IMC < 20" devolver -1 (Peso por debajo de lo normal)
        Si "IMC > 20 && IMC < 25" devolver 0 (Peso ideal)
        Si "IMC > 25" devolver 1 (Sobrepeso)
        */

        float IMC = peso / (altura * altura);
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }

    }
    
    public boolean MayoriaEdad(int edad) {
        //Si edad > 18, es mayor de edad
        return edad >= 18;
    }
}
