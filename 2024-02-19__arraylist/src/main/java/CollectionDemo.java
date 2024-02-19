import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(-7);
        System.out.println(list);
        list.sort(new SortierKriterium());
        System.out.println(list);

    }
}
