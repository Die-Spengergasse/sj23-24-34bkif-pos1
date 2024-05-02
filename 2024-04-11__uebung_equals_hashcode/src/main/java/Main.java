import at.spengergasse.pos1.Uebung;
import at.spengergasse.tiere.Tier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new FileReader("tiere.csv"))) {
            int lines = 0;
            HashMap<String, LinkedList<Tier>> alleTiere = new HashMap<>();
            String line = input.readLine(); // erste Zeile einlesen (und verwerfen)
            while ((line = input.readLine()) != null) {
                // Elwin;Crazy ant;insect;
                String name, unterArt, Art;
                String[] splitter = line.split(";");
                name = splitter[0];
                Tier aktuellesTier = new Tier(splitter);
                if (!alleTiere.containsKey(name)) {
                    alleTiere.put(name, new LinkedList<>());
                }
                alleTiere.get(name).add(aktuellesTier);
            }
            String gesucht = args[args.length - 1];
            if (alleTiere.containsKey(gesucht)) {
                LinkedList<Tier> gefunden = alleTiere.get(gesucht);
                gefunden.sort(new Uebung());
                for (Tier tier : gefunden) {
                    System.out.println(tier);
                    tier.writeObject()
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
