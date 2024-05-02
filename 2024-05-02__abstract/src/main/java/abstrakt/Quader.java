package abstrakt;

public class Quader extends Koerper{
    private double a,b,c;

    public Quader(double sg, double a, double b, double c) {
        super(sg);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double volumen () {
        return a*b*c;
    }
}
