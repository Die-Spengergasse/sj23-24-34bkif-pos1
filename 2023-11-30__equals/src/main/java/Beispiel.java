/*
Aufgabe: equals derart modifizieren, dass bei einer Abweichung von unter 10%
equals == true ausgegeben wird.
 */

public class Beispiel {
    private String stadt;
    private int Einwohner;

    public Beispiel(String stadt, int einwohner) {
        setStadt(stadt);
        setEinwohner(einwohner);
    }

    // Referenzgleichheit !!!
    // System.out.println(e1 == e2);  // false
    // System.out.println(e2 == e2);  // true
    // INhalts Gleichheit
    public static void main(String[] args) {
        Beispiel e1 = new Beispiel("Wien", 2000000);
        Beispiel e2 = new Beispiel("Marseille", 2000000);
        System.out.println(e1.equals(e2));  //
        System.out.println(e1.equals("Marseille")); //
        System.out.println(e1.equals(null));   //
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (!(other instanceof Beispiel)) return false;
        boolean istGleich = this.getEinwohner() == ((Beispiel) other).getEinwohner();
        return istGleich;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public int getEinwohner() {
        return Einwohner;
    }

    public void setEinwohner(int einwohner) {
        Einwohner = einwohner;
    }

}