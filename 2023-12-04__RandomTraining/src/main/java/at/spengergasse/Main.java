package at.spengergasse;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

    }

    public static int max (int[] katzi) {
        if (katzi == null || katzi.length == 0) {
            throw new IllegalArgumentException("Array null oder leer");
        }
        // Array ist mindestens length 1
        int bisherigesMaximum = katzi[0];
        for (int i = 1; i < katzi.length; i++) {
            if (katzi[i] > bisherigesMaximum) {
                bisherigesMaximum = katzi[i];
            }
        }
        return bisherigesMaximum;
    }
    public static int min(int[] arg) {
        return 2;  // TODO
    }
    public static double avg (int[]arg) {
        return 51.3;  // TODO
    }
}
