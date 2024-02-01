import java.util.Arrays;

public class CarCompany {
    private Car[] cars;

    public CarCompany(Car[] cars) {
        if (cars == null || cars.length == 0) {
            throw new IllegalArgumentException("cars null oder leer");
        }
        this.cars = cars;
    }

    public Car[] getCars() {
        // TODO: implement
        return this.cars;
    }

    public Car getFastestCar() {

        return cars[fastestCarIndex()];

    }

    public Car getSlowestCar() {
        return cars[slowestCarIndex()];
    }

    public int fastestCarIndex() {
        if (cars == null || cars.length == 0) {
            throw new IllegalArgumentException("cars null oder leer");
        }
        // array ist nicht leer
        int fastestCarIndex = 0;
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getTopSpeed() > cars[fastestCarIndex].getTopSpeed()) {
                fastestCarIndex = i;
            }
        }
        return fastestCarIndex;
    }

    public int slowestCarIndex() {
        return slowestCarIndex(0);
    }

    public int slowestCarIndex(int abWo) {

        // array ist nicht leer
        int slowestCarIndex = abWo;
        for (int i = abWo + 1; i < cars.length; i++) {
            if (cars[i].getTopSpeed() < cars[slowestCarIndex].getTopSpeed()) {
                slowestCarIndex = i;
            }
        }
        return slowestCarIndex;

    }

    public void sortCars() {
        Arrays.sort(cars);
    }

    private void swap(int i, int j) {
        Car temp = cars[i];
        cars[i] = cars[j];
        cars[j] = temp;
    }
}
