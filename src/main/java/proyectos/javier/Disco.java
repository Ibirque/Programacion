/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectos.javier;

/**
 *
 * @author Alumno
 */
public class Disco {
    private String id;
    private String Nombre;
    private String Genero;
    private String Grupo;
    private String tiempo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public Disco() {
    }

    @Override
    public String toString() {
        String cadena="";
        cadena += "\nid: " + this.id;
        cadena += "\nautor: " + this.Nombre;
        cadena += "\nGenero: " + this.Genero;
        cadena += "\nGrupo: " + this.Grupo;
        cadena += "\ntiempo: " + this.tiempo;
        return cadena;
    }

    
    
}

