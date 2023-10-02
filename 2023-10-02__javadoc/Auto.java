public class Auto
{
    private String farbe;
    private String marke;
    private int ps;
    public int getPS () {
        return ps;
    }

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
        // this.ps = neuPS;
    }

    public String getMarke () {
        return marke;
    }

    public void setMarke (String neuMarke) {
        // Test jetzt if NOT OK!!
        if (neuMarke == null 
        || (!neuMarke.equals("VW") 
            && !neuMarke.equals("Audi") 
            && !neuMarke.equals("Skoda"))) {
            // throw new IllegalArgumentException("FEHLER: Marke ist keine der erlaubten!");
        } else {
            this.marke = neuMarke;
        }
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String neuFarbe) {
        // TODO implement
        // fünf Farben aussuchen
        if (neuFarbe == null) {
            throw new IllegalArgumentException("FEHLER: Farbe ist null, was verboten ist");
        }
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
