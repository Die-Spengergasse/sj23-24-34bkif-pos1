package at.spengergasse.tiere;

import java.io.Serializable;

public class Tier extends Object implements Serializable {
    public String getArt() {
        return art;
    }

    public void writeObject () {

    }
    private final String name;

    public String getUnterArt() {
        return unterArt;
    }

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
