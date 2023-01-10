package proyectos.ibirque;

public class PrimaEmpleados {

    //Estas variables no las usamos ahora, las usariamos en caso de tener user input
    //private static String nom;
    //private static String directiu;
    //private static int antiguitat;

    public static void main(String[] args) {
        int pp;
        PrimaEmpleados programa = new PrimaEmpleados();

        //AQUI VA EL INPUT DEL USUARIO
        //inputUsuario();
        
        //Aqui le mandariamos el input del usuario a CalculoAntiguedad2,
        //aunque no haria falta mandarle la variable NOMBRE porque no la usa
        pp = programa.CalculoAntiguedad2("Carla", "S", 13);
        if (pp != 0) {
            //Donde esta carla podemos sustituirlo por la variable global Nom
            System.out.println("La prima que li correspon a" + "Carla" + " es: " + pp + "€");
        }
    }

    public void CalculoAntiguedad(String n, String s, int par) {
        int p = 0;
        if (par >= 0 && par < 1000) {
            if (s == "S") {
                if (par > 12) {
                    p = 600;
                } else {
                    p = 400;
                }
            } else if (s == "N") {
                if (par > 12) {
                    p = 150;
                } else {
                    p = 100;
                }
            } else {
                System.out.println("El codi del càrrec ha de ser 'S' o 'N'");
            }
            if (p != 0) {
                System.out.println("La prima que li correspon a " + n
                        + " es de " + p + " Euros");
            }
        } else {
            System.out.println("La antiguitat ha de ser un nombre entre 0 i 999");
        }

    }

    public void inputUsuario(){
        //input nos guardaria lo que nos ha mandado el usuario por teclado
        //para poder mandarselas de manera correcta a calculoantiguedad
    }
    
    public int CalculoAntiguedad2(String nom, String s, int par) {
        int p = 0;
        if (par >= 0 && par < 1000) {
            if (s == "S") {
                if (par > 12) {
                    p = 600;
                } else {
                    p = 400;
                }
            } else if (s == "N") {
                if (par > 12) {
                    p = 150;
                } else {
                    p = 100;
                }
            } else {
                System.out.println("El codi del càrrec ha de ser 'S' o 'N'");
            }
        } else {
            System.out.println("La antiguitat ha de ser un nombre entre 0 i 999");
        }
        return p;

    }
}//end
