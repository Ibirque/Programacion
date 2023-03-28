
package Uf4;


public class ProtectoraMain {

  
    public static void main(String[] args) {
        Protectora[] perros = new Protectora[5];
        
        perros[0] = new Protectora("Carlos javier", "azul", "elefante");
        perros[1] = new Protectora("Juan Carlos", "verde", "ornitorrinco");
        perros[2] = new Protectora("Antonio Jesus", "rojo", "paloma");
        perros[3] = new Protectora("Jorge Javier", "lila", "unicornio");
        perros[4] = new Protectora("Daenerys, the unburnt, Queen of Meereen, the andals, first men, breaker of chains, mother of dragons, khaleesi of the great sea", "Negro", "Dragon");
        
        System.out.println("Datos de los chuchos: ");
        
        for(int i=0; i<5; i++){
            System.out.println("Perro nº "+(i+1));
            System.out.println("Nombre: "+perros[i].getNombre());
            System.out.println("Color: "+perros[i].getColor());
            System.out.println("Raza: "+perros[i].getRaza());
            System.out.println("******");
        }
    }
    
}
