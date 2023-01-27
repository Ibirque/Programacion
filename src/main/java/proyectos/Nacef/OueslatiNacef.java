package proyectos.Nacef;


public class OueslatiNacef {
    
    public static final int[] TAM = new int[20];

    public static void main(String[] args) {
        OueslatiNacef programa = new OueslatiNacef();
        programa.inicio();
    }
    
    public void inicio(){
        NumSpen(TAM);
    }
    
    public int NumSpen(int[]tab){
        int n;
        int m;
        int s;
        int num = 153;
        int contador = 0;
        
        int copyNum = num;
        
       for(int i = 1; i <= tab.length; i++){
           //System.out.println("ssw");
           n = num % 10;
           m = num / 10;
           int w = m % 10;
           s = num / 100;
           System.out.println(n);
           System.out.println(w);
           System.out.println(s);
       }
        
        
        return num;
    }

}
