package abstrakt;

public class Quader extends Bauklotz {
    private double a,b,c;
    public Quader(String[] splitter) {
        super(splitter[1], splitter[2]);
        this.a = Double.parseDouble(splitter[3]);
        this.b = Double.parseDouble(splitter[4]);
        this.c = Double.parseDouble(splitter[5]);
    }

    double volumen () {
        return a*b*c;
    }
}
