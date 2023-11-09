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
                if (zeile == 1 || zeile == kantenlaenge
                        || spalte == 1 || spalte == kantenlaenge) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
