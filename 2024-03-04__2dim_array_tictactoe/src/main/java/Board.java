public class Board {
    // true: player 'X'
    // false: CPU   'O'
    // null: free
    private Boolean[][] fields;

    public Board() {
        fields = new Boolean[3][3];
    }

    public void placePiece(int place, boolean player) {
        int zeile = (place - 1) / 3;
        int spalte = (place - 1) % 3;
        if (fields[zeile][spalte] != null) {
            throw new IllegalArgumentException("Da ist schon was: " + (fields[zeile][spalte] ? "X" : "O"));
        }
        fields[zeile][spalte] = player;
    }

    @Override
    public String toString() {
        String leerZeile = "+-+-+-+\n";
        String rw = leerZeile;
        for (int zeile = 0; zeile < 3; zeile++) {
            rw += "|";
            for (int spalte = 0; spalte < 3; spalte++) {
                rw += getSymbol(zeile, spalte) + "|";
            }
            rw += "\n" + leerZeile;
        }
        return rw;
    }

    private String getSymbol(int zeile, int spalte) {
        if (fields[zeile][spalte] == null) {
            return " ";
        }
        return fields[zeile][spalte] ? "X" : "O";
    }

}
