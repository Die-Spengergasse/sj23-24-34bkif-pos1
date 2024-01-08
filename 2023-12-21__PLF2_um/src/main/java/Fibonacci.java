public class Fibonacci {
    public static long[] getFirstFibonaccis(int amount) {
        if (amount > 30 || amount < 0) {
            throw new IllegalArgumentException("amount im falschen Bereich");
        }
        if (amount == 0) {
            return new long[0];  // TODO Aufgabe
        }
        if (amount == 1) {
            return new long[]{0};
        }
        if (amount == 2) {
            return new long[]{0, 1};
        }
        long [] rueck = new long[amount];
        rueck[0] = 0;
        rueck[1] = 1;
        for (int i = 2 ; i < amount; i++) {
            rueck[i] = rueck[i-1] + rueck[i-2];
        }
        return rueck;
    }
}
