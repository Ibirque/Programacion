package proyectos.ibirque;


public class PardoIbirquePersona {

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
        cadena += "\nNombre: "+this.nombre;
        cadena += "\nEdad: "+this.edad;
        cadena += "\nNumero de DNI: "+this.numDNI;
        cadena += "\nSexo: "+this.sexo;
        cadena += "\nPeso: "+this.peso;
        cadena += "\nAltura: "+this.altura;        
        return cadena;
    }
    
}
