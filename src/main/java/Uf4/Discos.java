
package Uf4;

public class Discos {
    //encapsular atributos
    //generamos un menu que nos de varias opciones
    
    private String autor;
    private String titulo;
    private String genero;
    //He decidido cambiar a int el identificador de nuestra clase
    private int id;
    private int duracion;

    public Discos(String autor, String titulo, String genero, int id, int duracion) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.id = id;
        this.duracion = duracion;
    }    
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public String toString(){
        String cadena = "\n-------------------------------";
        cadena += "\nId: "+this.id;
        cadena += "\nAutor: "+this.autor;
        cadena += "\nTitulo: "+this.titulo;
        cadena += "\nGenero: "+this.genero;
        cadena += "\nLa duracion es de: "+this.duracion;
        
        return cadena;
    }
    
   
    
}
