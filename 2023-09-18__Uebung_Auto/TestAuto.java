
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



