import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new FileReader("persons_with_dups.csv"))) {
            HashMap<String, Person> dict = new HashMap<>();
            String line;
            while (null != (line = input.readLine())) {
                String name = line.split(";")[0];
                dict.put(name, new Person(line));
            }  // dcit aufgebaut
            System.out.println(dict.size() + " verschiedene Personen");
            System.out.println(dict.get("Daniel Aschenbroich"));
            System.out.println(dict.get("Dr. Kilian Strogies"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}