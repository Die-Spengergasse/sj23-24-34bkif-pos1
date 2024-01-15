public class Person implements Comparable {
    private String name;
    private int alter;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    @Override
    public String toString() {
        return "Person: {" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }

    @Override
    public int compareTo(Object other) {
        return this.alter - ((Person) other).alter;
    }
}
