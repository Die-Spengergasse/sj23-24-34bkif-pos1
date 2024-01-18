public class ComparablePerson implements Comparable<ComparablePerson> {
    private String vorname;
    private String nachname;

    public ComparablePerson(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public int compareTo(ComparablePerson other) {
        int thisLaenge = this.vorname.length() + this.nachname.length();
        int otherLaenge = other.vorname.length() + other.nachname.length();
        return thisLaenge - otherLaenge;
    }

    @Override
    public String toString() {
        return "\n" + this.vorname + " " + this.nachname;
    }
}
