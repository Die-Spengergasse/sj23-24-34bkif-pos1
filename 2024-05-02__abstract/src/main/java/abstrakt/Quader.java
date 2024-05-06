package abstrakt;

public class Quader extends Bauklotz {
    private double a,b,c;

    public Quader(double dichte, double a, double b, double c) {
        super(dichte);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double volumen () {
        return a*b*c;
    }
}
