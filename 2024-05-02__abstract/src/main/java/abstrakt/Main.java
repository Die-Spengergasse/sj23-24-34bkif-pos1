package abstrakt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bauklotz> sammlung = new ArrayList<>();
        try (BufferedReader input = new BufferedReader(new FileReader("geschenke.csv"))) {
            HashMap<Class, ArrayList<Bauklotz>> baukastenNachAbteilungen = new HashMap<>();
            input.lines().map((line) -> {
                String[] splitter = line.split(";");
                String erstesWort = splitter[0];
                Bauklotz aktuell;
                switch (erstesWort) {
                    case "Würfel": {
                        aktuell = new Wuerfel(splitter);
                        break;
                    }
                    case "Quader": {
                        aktuell = new Quader(splitter);
                        break;
                    }
                    case "Zylinder": {
                        aktuell = new Zylinder(splitter);
                        break;
                    }
                    case "Kugel": {
                        aktuell = new Kugel(splitter);
                        break;
                    }
                    default: {
                        aktuell = null;
                    }
                }
                return aktuell;
            }).filter(bauklotz -> {
                return bauklotz != null;
            }).forEach(bauklotz -> {
                Class klasse = bauklotz.getClass();
                if (!baukastenNachAbteilungen.containsKey(klasse)) {
                    baukastenNachAbteilungen.put(klasse, new ArrayList<>());
                }
                baukastenNachAbteilungen.get(klasse).add(bauklotz);
            });
            for (Class c : baukastenNachAbteilungen.keySet()) {
                ArrayList l = baukastenNachAbteilungen.get(c);
                l.sort(null);
                System.out.println("Abteilung: " + c.getClass());
                l.forEach(b-> System.out.println(b));
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            System.exit(1);
        }

    }
}
