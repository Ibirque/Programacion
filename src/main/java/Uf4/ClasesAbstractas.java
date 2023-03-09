package Uf4;

/*  Las clases abstractas nos permiten definir atributos generales que pueden compartir distintos elementos
    es decir, a la hora de hablar de elementos geometricos, hay elementos comunes, como el area, o el color, pero
    no tienen porque tener el mismo numero de lados*/
public class ClasesAbstractas {

    public static void main(String[] args) {
        ClasesAbstractas prog = new ClasesAbstractas();
        prog.inicio();
    }

    public void inicio() {
        Forma s1 = new Circulo("Rojo", 2.2);
        Forma s2 = new Rectangulo("Amarillo", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }

    /*  
        Nuestras clases 
        Ejemplo de clase abstracta
        Aqui creamos nuestra clase abstracta Forma, y luego 
        sus dos hijos "RECTANGULO" y "CIRCULO" que HEREDAN los atributos de
        "FORMA", estas clases tienen sus propias caracteristicas
    */
    abstract class Forma {

        String color;

        //Metodos abstractos
        abstract double Area();

        /*@Override manda una orden al compilados para hacerle saber que vamos 
        a saltarnos un metodo en una clase padre*/
        /*Le mandamos al compilador el siguiente mensaje:
            "Hey compilador, voy a cambiar lo que Area() hace"
            y el compilador puede respondernos:
            "Lo estas escribiendo mal"
            o bien, hacer el cambio correcto, como veremos mas abajo:
        
            @Override <--Esto esta en Circulo
            double Area() {
                return Math.PI * Math.pow(radio, 2);
            }
        
            @Override <--Esto esta en Rectangulo
            double Area() {
                return longitud * anchura;
            }
        
        */
        
        @Override
        public abstract String toString();

        //Nuestra clase puede tener un constructor
        public Forma(String color) {
            System.out.println("Hemos llamado al constructor de forma");
            this.color = color;
        }

        //Esto es un metodo concreto
        public String obtenerColor() {
            return color;
        }
    }

    /*  
        Nuestro circulo carece de lados, por lo que solo tenemos color que viene
        dado por la clase principal, y el radio que es atributo propio
    */
    class Circulo extends Forma {
        double radio;
        public Circulo(String color, double radio) {
            //Llamamos al constructor de forma
            super(color);
            System.out.println("Hemos llamado al constructor de circulo");
            this.radio = radio;
        }

        @Override
        double Area() {
            return Math.PI * Math.pow(radio, 2);
        }

        @Override
        public String toString() {
            return "El color del circulo es " + super.obtenerColor() + " y el area es: " + Area();
        }

    }
    
    /*  
        En nuestra clase rectangulo tenemos longitud y anchura
    */
    class Rectangulo extends Forma {

        double longitud;
        double anchura;

        public Rectangulo(String color, double longitud, double anchura) {
            //Llamamos al constructor
            super(color);
            System.out.println("Hemos llamado al constructor de rectangulo");
            this.longitud = longitud;
            this.anchura = anchura;
        }

        @Override
        double Area() {
            return longitud * anchura;
        }

        @Override
        public String toString() {
            return "El color del rectangulo es " + super.obtenerColor()
                    + " y el area es: " + Area();
        }
    }    
}
