
package Uf4;


public class LineaFacturaMain {

  
    public static void main(String[] args) {
        LineaFactura uno = new LineaFactura("1", "Salchicha", 6, 12);
        
        System.out.println("El cliente con id: " + uno.getId()+
                "\nQuiere comprar el articulo: "+ uno.getNombre() +
                "\nCantidad: "+uno.getCantidad()+
                "\nPrecio Unitario: "+uno.getPrecioUnitario()+ 
                "\n*****\nTotal compra: "+uno.total());
    }
    
}
