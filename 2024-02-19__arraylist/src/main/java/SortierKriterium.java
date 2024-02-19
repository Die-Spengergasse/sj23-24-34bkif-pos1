import java.util.Comparator;

public class SortierKriterium implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.println("vergleiche " + o1 + " mit " + o2);
        return o2-o1;
    }
}
