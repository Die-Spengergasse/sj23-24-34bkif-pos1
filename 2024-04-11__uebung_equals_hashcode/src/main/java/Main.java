import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new FileReader("tiere.csv"))) {
            int lines = 0;
            HashMap<String, ArrayList<Tier>> alleTiere = new HashMap<>();
            String line = input.readLine(); // erste Zeile einlesen (und verwerfen)
            while ((line = input.readLine()) != null) {
                // Elwin;Crazy ant;insect;
                String name, unterArt, Art;
                String[] splitter = line.split(";");
                name = splitter[0];
                Tier aktuellesTier = new Tier(splitter);
                if (!alleTiere.containsKey(name)) {
                    alleTiere.put(name, new ArrayList<>());
                }
                alleTiere.get(name).add(aktuellesTier);
            }
            String gesucht = args[args.length - 1];
            if (alleTiere.containsKey(gesucht)) {
                for (Tier tier: alleTiere.get(gesucht)) {
                    System.out.println(tier);
                }
            } else {
                System.err.println("nicht gefunden");
                System.exit(1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
