public class Auto
{
    private String farbe;
    private String marke;
    private int ps;
    
    public Auto () {

    }

    public Auto (String farbe) {

    }
    
    public Auto (String farbe, int ps) {
        
    }
    
    public Auto (int ps, String marke) {
        setMarke(marke);
    }
    
    public void setMarke (String neuMarke) {
        // Mögliche Fehlerquellen
        // 1) Leerstring ""
        // 2) Marke nicht eine von "VW", "Audi", "Skoda"
        
        // Parameterprüfungen
        if (neuMarke.equals("")) {
            throw new IllegalArgumentException("FEHLER: Marke ist Leerstring");
        }
        this.marke = neuMarke;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
