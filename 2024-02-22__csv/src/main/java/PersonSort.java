import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonSort {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            throw new IllegalArgumentException("ARG 0: infile, ARG 1: outfile");
        }
        ArrayList<Person> personenArrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        for (String line = reader.readLine(); line != null; line = reader.readLine()) {
            personenArrayList.add(new Person(line));  // TODO hier könnten Exeptions passieren
        }
        reader.close();
        personenArrayList.sort(null);
        for (Person p: personenArrayList) {
            // outfile.write(p.toString())
        }
    }
}

