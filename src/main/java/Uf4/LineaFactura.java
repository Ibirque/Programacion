
package Uf4;

public class LineaFactura {
    private String id;    
    private String nombre;
    private int cantidad;
    private double precioUnitario;

    public LineaFactura(String id, String nombre, int cantidad, double precioUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    //getters
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }   
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    //setters
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }   
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    public double total(){
        return this.cantidad*this.precioUnitario;        
    }

    @Override
    public String toString() {
        return "LineaFactura{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + '}';
    }
    
    
    
}
