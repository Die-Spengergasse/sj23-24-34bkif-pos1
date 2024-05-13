package abstrakt;

public abstract class Bauklotz implements Comparable<Bauklotz> {

    private double dichte;
    private String farbe;
    private String material;

    public Bauklotz(String farbe, String material) {
        this.setFarbe(farbe);
        this.setMaterial(material);
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setMaterial(String material) {
        this.material = material;
        switch (material) {
            case "Fichtenholz": {
                this.setDichte(0.46);
                break;
            }
            case "Eichenholz": {
                this.setDichte(0.67);
                break;
            }
            case "Buchenholz": {
                this.setDichte(0.68);
                break;
            }
            case "Kiefernholz": {
                this.setDichte(0.52);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unbekanntes Material");
            }
        }
    }

    abstract double volumen();

    public double gewicht() {
        return this.volumen() * this.dichte;
    }


    public void setDichte(double dichte) {
        if (dichte < 0) {
            throw new IllegalArgumentException("Spezifisches Gewicht sollte nicht negativ sein");
        }
        this.dichte = dichte;
    }

    public int compareTo(Bauklotz other) {
        double diff = this.gewicht() - other.gewicht();
        return Math.round((float) diff);
    }

    public String toString() {
        return this.getClass().getName().split("\\.")[1] + " Volumen: " + this.volumen() + " Gewicht: " + this.gewicht();
    }
}
