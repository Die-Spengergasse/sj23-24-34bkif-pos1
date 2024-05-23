package abstrakt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bauklotz> sammlung = new ArrayList<>();
        try (BufferedReader inputObjekt = new BufferedReader(new FileReader("geschenke.csv"))) {
            HashMap<Class, Collection<Bauklotz>> baukastenNachAbteilungen = new HashMap<>();
            inputObjekt.lines().map((line) -> {
                String[] splitter = line.split(";");
                String erstesWort = splitter[0];
                Bauklotz aktuell;
                try {
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
                            System.err.println(String.format("Nope for: %s", line));
                            aktuell = null;
                        }
                    }
                } catch (Exception e) {
                    System.err.println(line);
                    System.err.println(e.getMessage());
                    aktuell = null;
                    // throw e;
                }
                return aktuell;
            }).filter(bauklotz -> bauklotz != null).forEach(bauklotz -> {
                Class klasse = bauklotz.getClass();
                if (!baukastenNachAbteilungen.containsKey(klasse)) {
                    baukastenNachAbteilungen.put(klasse, new ArrayList<>());
                }
                baukastenNachAbteilungen.get(klasse).add(bauklotz);
            });  // Ende Stream
            for (Class c : baukastenNachAbteilungen.keySet()) {
                ArrayList l = (ArrayList) baukastenNachAbteilungen.get(c);
                l.sort(null);
                System.out.println("Abteilung: " + c.getName());
                l.forEach(b-> System.out.println(b));
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            System.exit(1);
        }

    }
}
