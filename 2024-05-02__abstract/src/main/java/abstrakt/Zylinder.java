package abstrakt;

public class Zylinder extends Bauklotz {
    private double r, h;

    public Zylinder(double dichte, double r, double h) {
        super(dichte);
        this.r = r;
        this.h = h;
    }

    @Override
    double volumen() {
        return r * r * Math.PI * h;
    }
}