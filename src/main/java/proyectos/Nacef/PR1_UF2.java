package proyectos.Nacef;

public class PR1_UF2 {
    public static int print() {
        int count = 0;
        System.out.println("Los primeros 20 números Spencer son: ");
        for (int i = 0; count < 20; i++) {
            if (numS(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        return count;
    }

    public static boolean numS(int num) {
        if (num < 0) {
            return false;
        }

        String numStr = Integer.toString(num);
        int numTAM = numStr.length();
        int numSuma = 0;

        for (int i = 0; i < numTAM; i++) {

            int digit = Character.getNumericValue(numStr.charAt(i));

            numSuma += Math.pow(digit, numTAM);

        }
        return numSuma == num;
    }
}
