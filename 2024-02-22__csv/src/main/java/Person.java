public class Person implements Comparable<Person> {
    private String uuid;
    private String fullname;
    private char sex;
    private float groesseM;
    private int gewicht;
    private String csvLine;
    public Person(String csvLine) {
        this.csvLine = csvLine;
        String[] splitter = csvLine.split(";");
        this.uuid = splitter[0];
        this.fullname = splitter[1];
        String sex = splitter[2];
        if (sex.equals("male")) {
            this.sex = 'm';
        } else if (sex.equals("female")) {
            this.sex = 'f';
        } else {
            throw new IllegalArgumentException("cannot parse sex: " + sex);
        }
        this.groesseM = Float.valueOf(splitter[3]);
        this.gewicht = Integer.valueOf(splitter[4]);
    }

    @Override
    public int compareTo(Person other) {
        if (this.sex == other.sex) {
            return Float.valueOf(this.getBMI() - other.getBMI()).intValue();
        }
        // Hier ist ein 'f' und ein 'm'
        if (this.sex == 'f') {
            return -1;
        }
        // hier ist sicher this.sex = 'm' UND other.sex = 'f' ;;
        return 1;
    }

    private float getBMI() {
        return this.gewicht/(this.groesseM*this.groesseM);
    }

    @Override
    public String toString() {
        return this.csvLine;
    }
}
