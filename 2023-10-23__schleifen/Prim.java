/* Challenge Primzahlen

1) erstellen einer Methode
   public static boolean isPrime (long arg) {}

2) in der main Methode alle Primahlen ausgeben, die < 300 sind
   und mit Wikipedia vergleichen

 */

public class Prim {
    public static void main(String[] args) {
        for (int testWert = 2; testWert <= 300; testWert++) {
            if (!istTeilbar(testWert)) {
                System.out.println("Primzahl: " + testWert);
            }
        }
    }

    public static boolean istTeilbar(int arg) {
        for (int teilVersuch = 2; teilVersuch < arg; teilVersuch++) {
            if (arg % teilVersuch == 0) {
                // teilbar ohne Rest, also nicht prim
                return true;
            }
        }
        return false;
    }
}
