package abstrakt;

public abstract class Koerper implements Comparable<Koerper> {
    abstract double volumen();
    private double spezifischesGewicht;

    public void setSpezifischesGewicht(double spezifischesGewicht) {
        if (spezifischesGewicht < 0) {
            throw new IllegalArgumentException("Spezifisches Gewicht sollte nicht negativ sein");
        }
        this.spezifischesGewicht = spezifischesGewicht;
    }


    public Koerper(double spezifischesGewicht) {
        this.setSpezifischesGewicht(spezifischesGewicht);
    }

    public int compareTo(Koerper other) {
        double diff = this.volumen()-other.volumen();
        return Math.round((float)diff);
    }
}
