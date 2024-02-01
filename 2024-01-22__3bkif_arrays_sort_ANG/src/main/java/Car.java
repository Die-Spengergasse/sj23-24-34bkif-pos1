public class Car {
    private String name;
    private int topSpeed;

    public Car(String name, int topSpeed) {
        setName(name);
        setTopSpeed(topSpeed);

    }

    public String getName() {

        return  this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 5) {
            throw new IllegalArgumentException("name null oder zu kurz");
        }
    this.name = name;
    }

    public int getTopSpeed() {

        return this.topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        // TODO: minimum 50 (throw IllegalArgumentException)
        // TODO: maximum 500 (throw IllegalArgumentException)
        if (topSpeed < 50 || topSpeed > 500) {
            throw new IllegalArgumentException("topSpeed zu klein oder zu gross");
        }
        this.topSpeed = topSpeed;
    }


    public int compareTo(Car other) {
        return this.getTopSpeed() - other.getTopSpeed();
    }
}
