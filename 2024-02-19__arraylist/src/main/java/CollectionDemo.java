import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CollectionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i<21; i++) {
            list.add (rnd.nextInt(199)-99);
        }
        // list.add(null);
        System.out.println(list);
        System.out.println(list.size());
        list.sort(new SortierKriterium());
        // zkukunftsmusik list.sort((a,b) -> b-a);
        System.out.println(list);

    }
}
