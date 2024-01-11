public class SortPersonen {
    private Person[] meinePrivatenPersonen;

    public SortPersonen(Person[] meinePrivatenPersonen) {
        this.meinePrivatenPersonen = meinePrivatenPersonen;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Georg", 53);
        Person p2 = new Person("Katharina", 25);
        Person p3 = new Person("Donald", 78);
        Person p4 = new Person("Joe", 83);
        Person p5 = new Person("Lena", 2);
        Person[] array = new Person[]{p1, p2, p3, p4, p5};
        SortPersonen instanz = new SortPersonen(array);
        System.out.println(instanz);
        instanz.bubblesort();
        System.out.println(instanz);
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

    public void bubblesort() {
        for (int obergrenze = meinePrivatenPersonen.length; obergrenze > 1; obergrenze--) {
            for (int i = 1; i < obergrenze; i++) {
                if (meinePrivatenPersonen[i - 1].compareTo(meinePrivatenPersonen[i]) > 0) {
                    tausche(i, i - 1);
                }
            }
        }
    }

    public void tausche(int index1, int index2) {
        Person tmp = meinePrivatenPersonen[index1];
        meinePrivatenPersonen[index1] = meinePrivatenPersonen[index2];
        meinePrivatenPersonen[index2] = tmp;
    }
}

