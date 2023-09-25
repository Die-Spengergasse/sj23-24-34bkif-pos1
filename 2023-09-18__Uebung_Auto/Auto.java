public class Auto
{
    private String farbe;
    private String marke;
    private int ps;

    public Auto () {
        setFarbe("blau");
        setMarke("VW");
        setPS(90);
    }

    public Auto (String farbe) {
        setFarbe(farbe);
        setMarke("VW");
        setPS(90);
    }

    public Auto (String farbe, int ps) {
        setFarbe(farbe);
        setMarke("VW");
        setPS(ps);
    }

    public Auto (int ps, String marke) {
        setPS(ps);
        setMarke(marke);
        setFarbe("blau");

    }

    public void setPS(int neuPS) {

        if (neuPS < 30) {
            System.err.println("FEHLER: Zu wenige PS!");
            throw new IllegalArgumentException("FEHLER: Zu wenige PS!");
        }
        if (neuPS > 300) {
            System.err.println("FEHLER: Zu viele PS!");
            throw new IllegalArgumentException("FEHLER: Zu viele PS!");
        }
        // Folgendes IF wird nie wahr sein!!
        if (neuPS < 30 || neuPS > 300) {
            throw new IllegalArgumentException("FEHLER: Falsche PS!");
        }
        this.ps = neuPS;
    }

    public void setMarke (String neuMarke) {
        // Mögliche Fehlerquellen
        // 1) Leerstring ""
        // 2) Marke nicht eine von "VW", "Audi", "Skoda"

        // Parameterprüfungen
        if (neuMarke.equals("VW") || neuMarke.equals("Audi") || neuMarke.equals("Skoda")) {
            this.marke = neuMarke;
        } else {
            throw new IllegalArgumentException("FEHLER: Marke ist keine der erlaubten!");
        }
    }

    public void setFarbe(String neuFarbe) {
        // TODO implement
        // fünf Farben aussuchen
        if (neuFarbe.equals("rot")
        || neuFarbe.equals("grün")
        || neuFarbe.equals("blau")
        || neuFarbe.equals("gelb") 
        || neuFarbe.equals("lila")) {
            this.farbe = neuFarbe;   
        }
        else {
            throw new IllegalArgumentException("FEHLER: Farbe ist keine der erlaubten!");  
        }
    }

}
