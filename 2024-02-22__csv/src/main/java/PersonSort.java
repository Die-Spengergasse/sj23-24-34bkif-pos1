import java.io.*;
import java.util.ArrayList;

public class PersonSort {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ARG 0: infile, ARG 1: outfile");
            System.exit(1);
        }
        ArrayList<Person> personen = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while (null != (line = reader.readLine())) {
                try {
                    personen.add(new Person(line));  // TODO hier könnten Exeptions passieren
                } catch (RuntimeException e) {
                    System.out.println("Cannot parse: " + line + " (" + e.getMessage() + ")");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        personen.sort(null);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            for (Person p : personen) {
                writer.write(p.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Es gab Probleme beim Schreiben: " + e.getMessage());

        }
        int personenZahl = personen.size();
        int unterGewichtZahl=0;
        int normalGewichtZahl = 0;
        int ueberGewichtZahl = 0;
        for (Person p : personen) {
            if (p.isUntergewichtig()) {
                unterGewichtZahl++;
                continue;
            }
            if (p.isNormalgewichtig()) {
                normalGewichtZahl++;
                continue;
            }
            if (p.isUebergewichtig()) {
                ueberGewichtZahl++;
                continue;
            }
        }
        float untergewichtPct = 100f * unterGewichtZahl / personenZahl;
        float uebergewichtPct = 100f * ueberGewichtZahl / personenZahl;
        float normalgewichtPct = 100f * normalGewichtZahl / personenZahl;
        System.out.println(untergewichtPct + "% der Personen sind untergewichtig");
        System.out.println(uebergewichtPct + "% der Personen sind übergewichtig");
        System.out.println(normalgewichtPct + "% der Personen sind normalgewichtig");
    }
}

