public class Tier extends Object {
    private final String name;
    private final String unterArt;
    private final String art;
    // Elwin;Crazy ant;insect;
    public Tier(String[] splitter) {
        this.name = splitter[0];
        this.unterArt = splitter [1];
        this.art = splitter[2];
    }

    @Override
    public String toString() {
        return name + ": is a(n) " + art + " (" + unterArt + ")";
    }
}
