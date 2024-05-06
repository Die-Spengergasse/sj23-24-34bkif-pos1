package abstrakt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Bastel b = new Bastel();
        Bauklotz k1, k2, k3, k4;
        k1 = new Quader(1.5, 2, 3, 4);
        k2 = new Kugel(5, 5);
        k3 = new Wuerfel(1, 3);
        HashMap<Class, Collection<Bauklotz>> baukastenNachAbteilungen = new HashMap<>();
        // z.B abstrakt.Quader
        ArrayList<Bauklotz> sammlung = new ArrayList<>();
        sammlung.add(k1);
        sammlung.add(k2);
        sammlung.add(k3);
        //     sammlung.sort((x,y) -> Math.round((float)(x.gewicht()-y.gewicht())));
        sammlung.stream().forEach((e) -> System.out.println(e));
        sammlung.stream().forEach((e) -> System.out.println(e.gewicht()));
        sammlung.stream()
                .sorted((x, y) -> Math.round((float) (x.gewicht() - y.gewicht())))
                .mapToDouble((k) -> k.gewicht())
                .forEach((g) -> System.out.println(g));
        double gesamt = sammlung.stream()
                .mapToDouble((k) -> k.gewicht())
                .sum();
        System.out.println(gesamt);

    }
}
