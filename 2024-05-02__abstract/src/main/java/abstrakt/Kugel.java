package abstrakt;

public class Kugel extends Bauklotz {
    private double r;

    public Kugel(double dichte, double r) {
        super(dichte);
        this.r = r;
    }

    @Override
    double volumen() {
        return 4.0/3.0*r*r*r*Math.PI;
    }
}
