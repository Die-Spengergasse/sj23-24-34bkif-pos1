public class Board {
    // true: player 'X'
    // false: CPU   'O'
    // null: free
    private Boolean[][] fields;

    public Board() {
        fields = new Boolean[3][3];
    }

    public void placePiece(int place, boolean player) {
        int zeile = getZeile(place);
        int spalte = getSpalte(place);
        if (fields[zeile][spalte] != null) {
            throw new IllegalArgumentException("Da ist schon was: " + (fields[zeile][spalte] ? "X" : "O"));
        }
        fields[zeile][spalte] = player;
    }

    private int getZeile(int place) {
        if (place < 1 || place > 9) {
            throw new IllegalArgumentException("invalid place: " + place);
        }
        return (place - 1) / 3;
    }

    private int getSpalte(int place) {
        if (place < 1 || place > 9) {
            throw new IllegalArgumentException("invalid place: " + place);
        }
        return (place - 1) % 3;
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
            rw += "\n";
        }
        rw += leerZeile;
        return rw;
    }

    private String getSymbol(int zeile, int spalte) {
        if (fields[zeile][spalte] == null) {
            return " ";
        }
        return fields[zeile][spalte] ? "X" : "O";
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (fields[i][j] == null) {
                    return false;
                }
            }

        }
        return true;
    }

    public boolean checkWinner(boolean player) {
        // in allen Zeilen suchen
        for (int i = 0; i < 3; i++) {
            boolean alleInZeile = true;  // gehe davon in dieser sind alle als "player" besetz
            for (int j = 0; i < 3; j++) {  // spalten
                if (fields[i][j] == null || fields[i][j] != player) {
                    alleInZeile = false;
                    break;
                }
            }
            if (alleInZeile) {
                return true;
            }
        }
        // allen spalten suchen
        for (int j = 0; j < 3; j++) {
            boolean alleInSpalte = true;
            for (int i = 0; i < 3; i++) {
                if (fields[i][j] == null || fields[i][j] != player) {
                    alleInSpalte = false;
                    break;
                }
            }
            if (alleInSpalte) {
                return true;
            }
        }
        boolean alleInDiagonale = true;
        for (int i = 0; i < 3; i++) {
            if (fields[i][i] == null || fields[i][i] != player) {
                alleInDiagonale = false;
                break;
            }
        }
        if (alleInDiagonale) {
            return true;
        }
        alleInDiagonale = true;
        for (int i = 0; i < 3; i++) {
            int j = 2 - i;
            if (fields[i][j] == null || fields[i][j] != player) {
                alleInDiagonale = false;
                break;
            }
        }
        if (alleInDiagonale) {
            return true;
        }
        return false;
    }
}
