import java.util.Comparator;

public class SortierKriterium implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.print("vergleiche " + o1 + " mit " + o2 + " -> ");
        boolean o1_gerade = o1 % 2 == 0;
        boolean o2_gerade = o2 % 2 == 0;
        if (o1_gerade && o2_gerade) {
            // beide gerade
            System.out.println(o1 - o2);
            return o1 - o2;
        }
        if (!o1_gerade && !o2_gerade) {
            // beide ungerade
            System.out.println(o2 - o1);
            return o2 - o1;
        }
        if (o1_gerade) {
            // o1 gerade UND o2 ungerade
            System.out.println(-1);
            return -1;
        }
        // o2 gerade und o1 ist ungerade
        System.out.println("+1");
        return 1;
    }
}
