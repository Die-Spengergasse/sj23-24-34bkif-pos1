package at.spengergasse;

import java.util.Random;

public class Main {
    private final int[] array;

    public Main() {
        Random rnd = new Random();
        this.array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(3001);
        }
    }

    static int getMaxSteigung(int[] ar) {
        int start, maxSteigung = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            int steigung = ar[i + 1] - ar[i];
            if (steigung > maxSteigung) {
                maxSteigung = steigung;
                start = i;
            }
        }
        return maxSteigung;
    }

    public static int getSummeBergauf(int[] ar) {
        int rw = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            int steigung = ar[i + 1] - ar[i];
            if (steigung > 0) {
                rw = rw + steigung;
            }
        }
        return rw;
    }

    public static int getSummeBergab(int[] ar) {
        int rw = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            int steigung = ar[i + 1] - ar[i];
            if (steigung < 0) {  // ist hier immer negativ
                rw = rw - steigung;
            }
        }
        return rw;
    }

    public static void main(String[] args) {
        //System.out.print("Please use a test class");
        Main x = new Main();
        // System.out.println(getSummeBergauf(x.array));
        System.out.println(getSummeBergab(x.array));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}