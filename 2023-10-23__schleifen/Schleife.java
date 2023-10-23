public class Schleife {
    public static void main(String[] args) {
        System.out.println();
        for (int zeile = 0; zeile < 10; zeile++) {
            for (int spalte = 0; spalte < 10; spalte++)
                System.out.print(zeile + " " + spalte + " | ");
            System.out.println();
        }
        System.out.println();
    }
}
