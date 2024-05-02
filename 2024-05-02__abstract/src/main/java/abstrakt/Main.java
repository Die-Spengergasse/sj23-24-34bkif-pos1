package abstrakt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bastel b = new Bastel();
        Koerper k1, k2, k3;
        k1 = new Quader(1.5,2, 3, 4);
        k2 = new Kugel(5, 5);
        ArrayList<Koerper> sammlung = new ArrayList<>();
        sammlung.add(k1);
        sammlung.add(k2);
        sammlung.sort(null);
    }
}
