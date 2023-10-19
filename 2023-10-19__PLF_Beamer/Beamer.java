class Beamer {
    private String type;
    private boolean istAn;
    private int restdauer;
    public Beamer (String type){
        /*
         * Die Klasse Beamer modelliert einen Beamer. Der Konstruktor akzeptiert folgende 3 Typen: ["Stan-
        dard", "LED", "Laser"]. Die Lebensdauer der Lichtquelle ist bei diesen 3 unterschiedlich. Stan-
        dard: 2000 Betriebsstunden, LED: 60000 Betriebsstunden, Laser: 20000 Betriebsstunden. Bei
        ungültigen Parametern werfen Sie eine IllegalArgumentException, damit das Objekt nicht in-
        stanziert wird. Ebenso setzen sie im Konstruktor entsprechend die verbleibenden Reststunden.
         */
        setType(type);
    }

    public void setType(String type) {
        // if (type == null) {
            // throw new IllegalArgumentException("Fehler null");
        // }
        if ((type == null) || (!type.equals("Standard") && !type.equals("LED") && !type.equals("Laser"))) {
            throw new IllegalArgumentException("Fehler null");
        }
        if (type.equals("Standard")) {
            restdauer = 2000;
        } else if (type.equals("LED")) {
            restdauer = 60000;
        } else if (type.equals("Laser")) {
            restdauer = 20000;
        } else {
            System.err.println("should be unreachable");
        }
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setRestdauer (int stunden) {
        this.restdauer = stunden;
    }

    public int getRestdauer () {
        return restdauer;
    }

    public boolean einschalten () {
        // .. schaltet den Beamer ein. Der Rückgabewert (boolean) teilt dem Aufrufer mit, ob dies möglich
// ist, denn die Lebensdauer könnte schon verbraucht sein. Jeder Einschaltvorgang vermindert die
// Lebensdauer um 15 Stunden. Bei einer Restlaufzeit von weniger als 15 Stunden kann der Beamer
// somit nicht mehr eingeschaltet werden.
        if (restdauer < 15) {
            return false;
        }
        // hier lande ich nur wenn es geht
        /* this.*/restdauer -= 15; // restdauer = restdauer - 15; => restdauer wird um 15 verringert
         istAn = true;
         return istAn;
    }

    public boolean brauchtService () {
        // return restdauer < 15;
        if (restdauer < 15) {
            return true;
        } else {
            return false;
        }
    }

    public void ausschaltenNach (int stunden) {
        // Fleißaufgabe Parameter-check
        if (stunden < 0) {
            throw new IllegalArgumentException("Zeitreise???");
        }
        restdauer -= stunden;
        istAn = false;
    }

    public String toString () {
        // • Standard-Beamer: Restlaufzeit: 1500 Stunden (eingeschaltet)
        // • LED-Beamer: Restlaufzeit: 40200 Stunden (ausgeschaltet)
        // • Laser-Beamer: Restlaufzeit: 5 Stunden (eingeschaltet) BENÖTIGT SERVICE
        String ergebnis = type + "-Beamer: Restlaufzeit: " + restdauer + " Stunden (";
        if (istAn) {
            ergebnis += "eingeschaltet";
        } else {
            ergebnis += "ausgeschaltet";
        }
        ergebnis += ")";
        if (brauchtService() == true) {
            ergebnis += " BENÖTIGT SERVICE";
        }
        return ergebnis;
    }
}