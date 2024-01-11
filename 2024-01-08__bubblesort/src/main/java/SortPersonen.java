import java.util.Arrays;

public class SortPersonen {
    private Person[] meinePrivatenPersonen;

    public SortPersonen(Person[] meinePrivatenPersonen) {
        this.meinePrivatenPersonen = meinePrivatenPersonen;
    }

    @Override
    public String toString() {
        String rw = "array [\n";
        for (Person p : meinePrivatenPersonen) {
            rw = rw + p + "\n";
        }
        rw += "]";
        return rw;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Georg", 53);
        Person p2 = new Person("Katharina", 25);
        Person p3 = new Person("Donald", 78);
        Person p4 = new Person ("Joe", 83);
        Person p5 = new Person ("Lena", 2);
        Person[] array = new Person[]{p1, p2, p3, p4, p5};
        SortPersonen instanz = new SortPersonen( array);
        System.out.println(instanz);
        instanz.bubblesort();
        System.out.println(instanz);
    }

    private void bubblesort() {
        // TODO
    }
}
