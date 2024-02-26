import java.io.*;
import java.util.ArrayList;

public class PersonSort {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            throw new IllegalArgumentException("ARG 0: infile, ARG 1: outfile");
        }
        ArrayList<Person> personenArrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line = reader.readLine();
        while (null != (line = reader.readLine())) {
            personenArrayList.add(new Person(line));  // TODO hier könnten Exeptions passieren
        }
        reader.close();
        personenArrayList.sort(null);
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        for (Person p: personenArrayList) {
            writer.write(p.toString());
            writer.newLine();
        }

    }
}

