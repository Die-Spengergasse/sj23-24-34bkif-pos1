
public class TestAuto
{
    private Auto auto1, auto2, auto3, auto4, auto5;

    public TestAuto () {
        /*      auto1 = new Auto();  // Sollte gut gehen
        auto2 = new Auto("rot"); // sollte ebenfalls gehen    
        auto3 = new Auto ("blau", 110);  // Farbe, PS
        auto4 = new Auto (110, "Audi");
        auto5 = new Auto ("braun", 90); */
    }

    public boolean testSetzeMarkeInteraktiv (String neuMarke) {
        // return true, wenn new Auto () korrekt arbeitet!!!
        // sonst false
        // muss mich kpmmern, dass neuMarke nicht null ist:
        boolean sollKlappen; 
        if (neuMarke == null) {
            sollKlappen = false;
        } else {
            // Folgender Code verläßt sich darauf, dass neuMarke NOT NULL ist!!
            sollKlappen = neuMarke.equals("VW") || neuMarke.equals("Audi") || neuMarke.equals("Skoda");
        }
        try {
            Auto testAuto = new Auto (90, neuMarke);
            if (sollKlappen) {
                System.out.println("Es klappte und sollte auch");
                return true;
            } else {
                System.err.println("Es klappte, aber sollte nicht mit Marke: " + neuMarke);
                return false;
            }
        } catch (IllegalArgumentException e) {
            // Es ist ine Exception geworfen worden, jetzt prüfen wir, ob zurecht!
            if (sollKlappen) {  // Uiuiui eigentlich hätt ich ein Auto wollen!
                System.err.println ("Uiuiui eigentlich hätt ich ein Auto wollen!: " + neuMarke);
                return false; 
            } else {
                System.out.println ("Es klappte nicht und sollte auch nicht");
                return true;
            }
        }
    }

    public boolean testSetzePSInteraktiv (int testPS) {
        boolean sollKlappen = (testPS >=30) && (testPS <= 300);
        boolean testSuccessful;
        auto1 = null;
        try {
            auto1 = new Auto ("blau", testPS);  // Auto wu
            // Auto wurde erzeugt
            if (sollKlappen == true) { // also richtige PS
                testSuccessful = true;
            } else {
                testSuccessful = false;
                System.out.println("Nicht alles gut! Weil ps falsch, aber Auto erzeugt");
            }
        } catch (IllegalArgumentException e) {
            if (sollKlappen) {
                System.out.println("Nicht alles gut. Kein auto erzeugt obwohl ps ok waren");
                testSuccessful = false;
            } else {
                testSuccessful = true;
            }
        }
        return testSuccessful;
    }

    public boolean setzePSistKorrektMitZuwenig () {
        // Rückgabe: ob die setzePS Methode in Auto funktioniert
        // wahr oder falsch
        boolean testSuccessful = true;
        // Test 1: Ich gebe zu wenig PS
        try {
            auto1 = new Auto ("blau", 29); // sollte schiefgehen!!
            System.out.println ("Stelle erreicht .. Auto mit 20PS wurde erzeugt!");
            testSuccessful = false;
        } catch (IllegalArgumentException e) {
            System.out.println ("Bin im catch Block: " + e);

            testSuccessful = true;
        }
        return testSuccessful;
    }

    public boolean testSetzePSrichtig () {
        boolean testSuccessful;
        try {
            auto1 = new Auto ("blau", 90);
            testSuccessful = true;
        } catch (IllegalArgumentException e) {
            testSuccessful = false;
            System.out.println("Nicht gut - kann kein Auto mit 90PS anlegen");
        }
        return testSuccessful;
    }

    
}

