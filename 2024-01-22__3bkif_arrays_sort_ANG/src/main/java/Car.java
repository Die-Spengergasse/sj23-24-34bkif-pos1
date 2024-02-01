public class Car implements Comparable<Car> {
    private String name;
    private int topSpeed;

    public Car(String name, int topSpeed) {
// TODO implement
    }

    public String getName() {
        // TODO: implement
        return null;
    }

    public void setName(String name) {
        // TODO: not null check (throw IllegalArgumentException)
        // TODO: minlength 5 check (throw IllegalArgumentException)
    }

    public int getTopSpeed() {
        // TODO implement
        return -1;
    }

    public void setTopSpeed(int topSpeed) {
        // TODO: minimum 50 (throw IllegalArgumentException)
        // TODO: maximum 500 (throw IllegalArgumentException)
        // TODO: implement
    }

    @Override
    public int compareTo(Car o) {
        // TODO: implement
        return 0;
    }
}
