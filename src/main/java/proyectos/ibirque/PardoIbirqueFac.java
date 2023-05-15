package proyectos.ibirque;

/*OBJETIVOS*/
 /*
    O1 - devolver factura, con:
    item comrpado
    precio unitario
    cantidad
    precio total sin iva
    precio total con iva

    O2 - Que permita hacer facturas de varios items a la vez
    Diversos items comprados
    Precio unitario de cada uno
    cantidad de cada uno
    precio total sin iva
    precio total con iva

    O3 - Permite hacer un descuento de un 10% sobre algunos items
    diveros items comprados
    precio unitario
    descuento
    cantidad de cada uno
    precio total sin iva
    precio total con iva
 */

public class PardoIbirqueFac {

    private String item;
    private int cantidad;
    private float precio;

    /*CONSTRUCTOR*/
    public PardoIbirqueFac(String item, int cantidad, float precio) {
        this.item = item;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    /*FUNCION*/
    public float precioUnitario(){
        return this.precio / this.cantidad;
    }
    public float iva(){
        float precio2 = 0;
        return precio2 = this.precio * 1.21f;
    }
    public float descuento(){
        System.out.println("Se ha aplicado un descuento!");
        return this.precio = this.precio - (this.precio * 0.1f) ;
    }
    
    /*SETTERS*/
    public void setItem(String item) {
        this.item = item;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /*GETTERS*/
    public String getItem() {
        return item;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    /*
    @Override
    public String toStringOriginal() {
        return "item=" + item + ", cantidad=" + cantidad + ", precio=" + precio + ", precio unitario=" + precioUnitario() +", precio con IVA=" + iva() +'}';
    }
    */
    @Override
    public String toString() {
        return "ITEM:" + item +", PRECIO:" + precio +", Con IVA=" + iva();
    }

}
