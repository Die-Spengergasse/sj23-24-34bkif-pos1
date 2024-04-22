import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new FileReader("tierarten.csv"))) {
            String line;
            int lines = 0;
            HashSet<String> arten = new HashSet<>();
            while ((line = input.readLine()) != null) {
                lines++;
                arten.add(line);
            }
            System.out.println(lines + " Zeilen in der Datei");
            System.out.println(arten.size() + " *verschiedene* Arten, nämlich:");
            ArrayList<String> array = new ArrayList<>(arten);
            array.sort(null);
            for (String s: array) System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
