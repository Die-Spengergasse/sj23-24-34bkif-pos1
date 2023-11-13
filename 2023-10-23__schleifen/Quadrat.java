public class Quadrat {
    public static void main(String[] args) {

        try {
            System.out.println("Argument 1: " + args[0]);
            zeichne(Integer.parseInt(args[0]));
        } catch (NumberFormatException e) {
            System.out.println("Ungültig! " + args[0] + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Brauche ein Argument");
        }
      /*  zeichne(2);
        zeichne(4);*/
    }

    public static void zeichne(int kantenlaenge) {
        for (int zeile = 1; zeile <= kantenlaenge; zeile++) {
            for (int spalte = 1; spalte <= kantenlaenge; spalte++) {
                if (mussSternZeichnen(zeile, spalte, kantenlaenge)) {
                    System.out.print("X ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    // ob ich einen Stern muss
    private static boolean mussSternZeichnen(int zeile, int spalte, int kantenlaenge) {
        boolean mussSternZeichnen = false;
        if (zeile == 1)   // erste Zeile
            mussSternZeichnen = true;
        else if (zeile == kantenlaenge) // letzte Zeile
            mussSternZeichnen = true;
        else if (spalte == 1)    // erste Spalte
            mussSternZeichnen = true;
        else if (spalte == kantenlaenge)   // letzte Spalte
            mussSternZeichnen = true;
        else if (zeile == spalte)   // Diagonale li oben => re unten
            mussSternZeichnen = true;
        else if (zeile + spalte == kantenlaenge + 1)   // andere Diagonale
            mussSternZeichnen = true;
        return mussSternZeichnen;
    }
}
