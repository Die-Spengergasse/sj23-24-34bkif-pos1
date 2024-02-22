import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PersonSort {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
