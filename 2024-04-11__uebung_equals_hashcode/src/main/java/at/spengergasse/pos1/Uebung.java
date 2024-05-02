package at.spengergasse.pos1;

import at.spengergasse.tiere.Tier;
import java.util.Comparator;

public class Uebung implements Comparator<Tier> {
    @Override
    public int compare(Tier o1, Tier o2) {
        int cmp = o1.getArt().compareTo(o2.getArt());
        if (cmp == 0) {
            return o1.getUnterArt().compareTo(o2.getUnterArt());
        }
        return cmp;    }
}
