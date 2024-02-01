import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CarTest extends Object {
    private Car[] cars;
    private CarCompany carCompany;

    @BeforeEach
    void setUp() {
        cars = new Car[]{
                new Car("BMW 5", 250),
                new Car("Porsche", 300),
                new Car("Koenigsegg Agera RS", 447),
                new Car("Audi A3 Diesel", 180),
                new Car("Ferrari", 350),
                new Car("Lamborghini", 351),
                new Car("Bugatti Veyron", 418),
        };
        carCompany = new CarCompany(cars);
    }

    @Test
    void getName() {
        assertEquals("BMW 5", cars[0].getName());
        assertEquals("Porsche", cars[1].getName());
        assertEquals("Koenigsegg Agera RS", cars[2].getName());
        assertEquals("Audi A3 Diesel", cars[3].getName());
        assertEquals("Ferrari", cars[4].getName());
    }

    @Test
    void setName() {
        assertThrows(IllegalArgumentException.class, () -> cars[0].setName(null));
        assertThrows(IllegalArgumentException.class, () -> cars[0].setName("abcd"));
    }

    @Test
    void getTopSpeed() {
        assertEquals(250, cars[0].getTopSpeed());
        assertEquals(418, cars[6].getTopSpeed());
    }

    @Test
    void setTopSpeed() {
        assertThrows(IllegalArgumentException.class, () -> cars[0].setTopSpeed(49));
        assertThrows(IllegalArgumentException.class, () -> cars[0].setTopSpeed(501));
        cars[0].setTopSpeed(50);
        assertEquals(50, cars[0].getTopSpeed());
        cars[0].setTopSpeed(500);
        assertEquals(500, cars[0].getTopSpeed());
    }

    @Test
    void compareTo() {
        Car[] sortedCars = Arrays.stream(cars).sorted().toArray(Car[]::new);
        Car first = sortedCars[0];
        for (int i = 1; i < sortedCars.length; i++) {
            Car second = sortedCars[i];
            assertTrue(first.getTopSpeed() < second.getTopSpeed());
            first = second;
        }
    }

    @Test
    void getCars() {
        assertArrayEquals(cars, carCompany.getCars());
    }

    @Test
    void getFastestCar() {
        assertEquals(cars[2], carCompany.getFastestCar());
    }

    @Test
    void getSlowestCar() {
        assertEquals(cars[3], carCompany.getSlowestCar());
    }

    @Test
    void fastestCarIndex() {
        assertEquals(2, carCompany.fastestCarIndex());
    }

    @Test
    void slowestCarIndex() {
        assertEquals(3, carCompany.slowestCarIndex());
    }

    @Test
    void sortCars() {
        carCompany.sortCars();
        Car[] sortedCars = Arrays.stream(cars).sorted().toArray(Car[]::new);
        assertArrayEquals(sortedCars, carCompany.getCars());
    }
    @Test
    void strcomp () {
        String[] x = {"a", "b", "c", " ", "_","ß","z","A", "B", "C"};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }
}