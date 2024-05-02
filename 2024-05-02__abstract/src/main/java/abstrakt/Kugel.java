package abstrakt;

public class Kugel extends Koerper {
    private double r;

    public Kugel(double sg, double r) {
        super(sg);
        this.r = r;
    }

    @Override
    double volumen() {
        return 4.0/3.0*r*r*r*Math.PI;
    }
}
