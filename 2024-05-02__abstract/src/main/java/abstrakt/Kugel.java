package abstrakt;

public class Kugel extends Bauklotz {
    private double r;
    public Kugel(String[] splitter) {
        super(splitter[1], splitter[2]);
        this.r = Double.parseDouble(splitter[3]);
    }

    @Override
    double volumen() {
        return 4.0/3.0*r*r*r*Math.PI;
    }
}
