package proyectos.ibirque;

public class PrimaEmpleados {

    public static void main(String[] args) {
        int pp;
        PrimaEmpleados programa = new PrimaEmpleados();
        programa.CalculoAntiguedad("Elvira", "S", 11);
        
        pp = programa.CalculoAntiguedad2("Carla", "S", 13);
        System.out.println("La prima es " + pp);
    }

    public void CalculoAntiguedad(String nom, String s, int par) {
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
                System.out.println("La prima que li correspon a " + nom
                        + " es de " + p + " Euros");
            }
        } else {
            System.out.println("La antiguitat ha de ser un nombre entre 0 i 999");
        }

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
            if (p != 0) {
                System.out.println("La prima que li correspon a " + nom
                        + " es de " + p + " Euros");
            }
        } else {
            System.out.println("La antiguitat ha de ser un nombre entre 0 i 999");
        }
        return p;

    }

}//end
