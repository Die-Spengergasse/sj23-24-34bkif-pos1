import java.util.ArrayList;
import java.util.Random;

public class Board {
    // true: player 'X'
    // false: CPU   'O'
    // null: free
    private Boolean[][] fields;
    Random rnd;

    public Board() {
        fields = new Boolean[3][3];
        rnd = new Random();
    }

    public void placePiece(int place, boolean player) {
        int zeile = getZeileNrFromPlace(place);
        int spalte = getSpalteNrFromPlace(place);
        if (fields[zeile][spalte] != null) {
            throw new IllegalArgumentException("Da ist schon was: " + (fields[zeile][spalte] ? "X" : "O"));
        }
        fields[zeile][spalte] = player;
    }

    private Boolean[] getZeile(int nr) {
        return this.fields[nr];
    }

    private Boolean[] getSpalte(int spalteNr) {
        Boolean[] rv = new Boolean[3];
        for (int zeile = 0; zeile < 3; zeile++) {
            rv[zeile] = fields[zeile][spalteNr];
        }
        return rv;
    }

    private Boolean[] getDiagonaleLinks() {
        Boolean[] rv = new Boolean[3];
        for (int nummer = 0; nummer < 3; nummer++) {
            rv[nummer] = fields[nummer][nummer];
        }
        return rv;
    }

    private Boolean[] getDiagonaleRechts() {
        Boolean[] rv = new Boolean[3];
        for (int zeile = 0; zeile < 3; zeile++) {
            rv[zeile] = fields[zeile][2 - zeile];
        }
return rv;
    }


    private int getZeileNrFromPlace(int place) {
        if (place < 1 || place > 9) {
            throw new IllegalArgumentException("invalid place: " + place);
        }
        return (place - 1) / 3;
    }

    private int getSpalteNrFromPlace(int place) {
        if (place < 1 || place > 9) {
            throw new IllegalArgumentException("invalid place: " + place);
        }
        return (place - 1) % 3;
    }
    private int getPlaceFromZeileUndSplate(int zeile, int spalte) {
        return zeile*3 + spalte +1;
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
    boolean isOnTwoPlacesInArrayAndTheThirdIsNull (Boolean[] dreierArray, boolean player) {
        int nullCount = 0;
        int playerCount = 0;
        int otherCount = 0;
        for (int i = 0; i < dreierArray.length; i++) {
            if (dreierArray[i] == null) {
                nullCount++;
                continue;
            }
            if (dreierArray[i] == player) {
                playerCount++;
                continue;
            }
            otherCount++;
        }
        if (playerCount==2 && nullCount==1) {
            return true;
        } else {
            return false;
        }
    }
    boolean isOnAllPlacesInArray(Boolean[] dreierArray, boolean player) {
        for (int i = 0; i < dreierArray.length; i++) {
            if (dreierArray[i] == null) {
                return false;
            }  //ab hier: not null
            if (dreierArray[i] != player) {
                return false;
            }
        }
        return true;
    }

    public boolean checkWinner(boolean player) {
        // in allen Zeilen und Spalten suchen
        for (int i = 0; i < 3; i++) {
            if (isOnAllPlacesInArray(getZeile(i), player) || isOnAllPlacesInArray(getSpalte(i), player)) {
                return true;
            }
        }
        if (isOnAllPlacesInArray(getDiagonaleLinks(), player) || isOnAllPlacesInArray(getDiagonaleRechts(), player)) {
            return true;
        }
        // allen spalten suchen
        return false;
    }
    private int whereIsNull (Boolean[] dreierArray) {
        for (int i = 0; i< dreierArray.length; i++) {
            if (dreierArray[i] == null) return i;
        }
        throw new IllegalStateException("Now you need a debugger!");
    }
    public int findBestPlaceFor(boolean player) {
        Integer result;
        result = gewinnPlatz(player);
        if (result != null) {
            return result;  // ich gewinne!
        }
        result = gewinnPlatz(!player);
        if (result != null) {
            return result;  // gegner würde sonst gewinnen
        }
        if (fields[1][1] == null) {
            return getPlaceFromZeileUndSplate(1,1);
        }
        ArrayList<Integer> freieFelder = new ArrayList<>();
        for (int place = 1; place <=9; place++) {
            if (fields[getZeileNrFromPlace(place)][getSpalteNrFromPlace(place)] == null) {
                freieFelder.add(place);
            }
        }
        assert (!freieFelder.isEmpty());
        return freieFelder.get(rnd.nextInt(freieFelder.size()));
    }
    private Integer gewinnPlatz(boolean player) {
        for (int i = 0; i < 3; i++) {  // i Zeile bzw. Spalte
            if (isOnTwoPlacesInArrayAndTheThirdIsNull(getZeile(i), player)) {
                // gefunden!!! Zeile
                int nullSpalte = whereIsNull(getZeile(i));
                return getPlaceFromZeileUndSplate(i, nullSpalte);
            }
            // i wird ab hier als spalte gesehen
            if (isOnTwoPlacesInArrayAndTheThirdIsNull(getSpalte(i), player)) {
                int zeileMitNull = whereIsNull(getSpalte(i));
                return getPlaceFromZeileUndSplate(zeileMitNull, i);
            }
        }
        Boolean[] diagonale;
        diagonale = getDiagonaleLinks();
        if (isOnTwoPlacesInArrayAndTheThirdIsNull(diagonale, player)) {
            int nullPlace = whereIsNull(diagonale);
            return getPlaceFromZeileUndSplate(nullPlace, nullPlace);
        }
        diagonale = getDiagonaleRechts();
        if (isOnTwoPlacesInArrayAndTheThirdIsNull(diagonale, player)) {
            int nullPlace = whereIsNull(diagonale);
            return getPlaceFromZeileUndSplate(nullPlace, 2-nullPlace);
        }
        return null;  // player kann nicht jetzt gewinnen
    }
}
