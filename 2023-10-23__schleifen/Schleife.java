/* Angabe Fizz - Buzz
Schleife von 0 bis 25
Modulo Operator
Wenn Zahl teilbar durch 3: Ausgabe "FIZZ"
Wenn teilbar durch 5: Ausgabe "BUZZ"
Wenn teilbar durch 3 und 5 "FIZZ-BUZZ"
Ansonsten: Zahl
 */

public class Schleife {
    public static void main(String[] args) {  // Hallo Welt ich bin da
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("In Schleife, i ist: " + i);
        }
        System.out.println("Nach Schleife, i ist: " + i);
    }
}
