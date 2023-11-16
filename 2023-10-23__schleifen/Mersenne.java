public class Mersenne {
    public static void main(String[] args) {
        for (long i = 2; i <= 62; i++) {  // zweierpotenzen / hochzahlen
            long testZahl = mersenne(i);
            if (isPrim(testZahl))
                System.out.println(mersenne(i));
        }
    }

    private static boolean isPrim(long testZahl) {
        long wurzel = (long) Math.sqrt(testZahl);
        if (testZahl % 2L == 0) return false;
        for (long n = 3; n <= wurzel; n = n + 2) {
            if (testZahl % n == 0) return false;
        }
        return true;
    }

    private static long mersenne(long i) {
        // i .. potenz
        long rv = 1;
        for (int zahler = 0; zahler < i; zahler++) {
            rv = rv * 2;
        }
        return rv - 1;
    }

    /*
    Eine Mersenne-Zahl wird folgendermaßen gebildet:
    2**n -1

    Manche Mersenne Zahlen sind prim, z.b. 3 und 7
    2**2 - 1 == 3
    2**3 - 1 == 8 -1 == 7

    Finden Sie alle Mersenne Primzahlen im Zahlenbereich "long"
     */
}
