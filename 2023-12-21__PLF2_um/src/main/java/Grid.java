public class Grid {
    public static void main(String[] args) {
        drawGrid(3, 4);
    }

    public static String drawGrid(int lines, int columns) {
        // lt Angabe darf lines nicht gerade sein
        if (lines % 2 == 0 || lines < 1) {
            throw new IllegalArgumentException("lines must be odd");
        }
        if (columns %3 != 1 || columns < 1) {
            throw new IllegalArgumentException("columns wrong");
        }
        String rueck = "";
        for (int zeile = 1; zeile <= lines; zeile++) {
            for (int spalte = 1; spalte <= columns; spalte++) {
                boolean braucheRaute = false;
                if (zeile % 2 == 1) {
                    braucheRaute = true;
                }
                if (spalte % 3 == 1) {
                    braucheRaute = true;
                }
                if (braucheRaute) {
                    rueck += "# ";
                } else {
                    rueck += ". ";
                }
            }
            rueck = rueck.stripTrailing();
            rueck = rueck + "\n";
        }
        return rueck.stripTrailing(); // TODO Aufgabe
    }
}
