/* Angabe Fizz - Buzz
Schleife von 0 bis 25
Modulo Operator
Wenn Zahl teilbar durch 3: Ausgabe "FIZZ"
Wenn teilbar durch 5: Ausgabe "BUZZ"
Wenn teilbar durch 3 und 5 "FIZZ-BUZZ"
Ansonsten: Zahl
 */

// TODO zurückbauen auf "continue" Struktur
public class FizzBuzz {
    public static void main(String[] args) {  // Hallo Welt ich bin da
        int i;
        for (i = 0; i <= 25; i++) {
            if (i % 15 == 0) {
                System.out.println("Fizz-Buzz");
            } else {
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    if (i % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
