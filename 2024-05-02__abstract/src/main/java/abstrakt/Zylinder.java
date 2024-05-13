package abstrakt;

public class Zylinder extends Bauklotz {
    private double r, h;
    public Zylinder(String[] splitter) {
        super(splitter[1], splitter[2]);
        this.r = Double.parseDouble(splitter[3]);
        this.h = Double.parseDouble(splitter[4]);
    }

    @Override
    double volumen() {
        return r * r * Math.PI * h;
    }
}