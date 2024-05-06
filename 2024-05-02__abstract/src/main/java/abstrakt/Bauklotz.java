package abstrakt;

public abstract class Bauklotz implements Comparable<Bauklotz> {

    private double dichte;
    public Bauklotz(double dichte) {
        this.setDichte(dichte);
    }
    abstract double volumen();
    public double gewicht() {
        return this.volumen()*this.dichte;
    }


    public void setDichte(double dichte) {
        if (dichte < 0) {
            throw new IllegalArgumentException("Spezifisches Gewicht sollte nicht negativ sein");
        }
        this.dichte = dichte;
    }
    public int compareTo(Bauklotz other) {
        double diff = this.volumen()-other.volumen();
        return Math.round((float)diff);
    }
    public String toString() {
        return this.getClass().getName().split("\\.")[1] + " Volumen: " + this.volumen() + " Gewicht: " + this.gewicht();
    }
}
