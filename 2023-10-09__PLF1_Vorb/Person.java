public class Person
{
    private String name;
    private boolean maennlich;
    private int groesse;
    private int gewicht;

    public Person (String name, boolean maennlich, int groesse,
    int gewicht) {
        this.setName(name);
        this.maennlich = maennlich;
        this.setGroesse(groesse);
        this.setGewicht(gewicht);
    }

    public void setGroesse(int groesse) {
        if (groesse < 110 || groesse > 220) {
            throw new IllegalArgumentException("Groesse nicht im Bereich");
        }
        // komme nur hierher wenn groesse OK ist
        this.groesse = groesse;
    }

    // Name darf nicht null und auch nicht leer sein
    public void setName(String name) {
        if (name == null || name.equals("")  ) {
            System.out.println("Fehler: name null");
            throw new IllegalArgumentException("Name darf nicht null sein!");
        } else {
            this.name = name;
        } 
    }

    public void setGewicht (int gewicht) {
        if (gewicht < 30 || gewicht > 150) {
            throw new IllegalArgumentException("Gewicht nicht im erlaubten Bereich");
        }
        this.gewicht = gewicht;
    }

    public String toString () {
        return "Name: " + name + "Groesse: " + groesse + "cm, Gewicht: " + gewicht;
    }
    public void printPerson () {
        System.out.println(this);
    }
    
    public String getName () {
        return name;
    }
    public boolean getMaennlich() {
        return this.maennlich; // auch möglich
    }
    public int getGroesse () {
        return groesse;
    }
    public int getGewicht () {
        return gewicht;
    }
    public float bmiBerechnen () {
        float groesseInM = groesse/100f;
        return gewicht/(groesseInM*groesseInM);
    }
}
