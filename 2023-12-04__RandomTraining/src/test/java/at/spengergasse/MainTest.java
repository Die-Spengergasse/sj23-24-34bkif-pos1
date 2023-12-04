package at.spengergasse;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private int [] teddy;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        teddy = new int[]{77, 86, 77, 77, 5, 15, 7, 41, 82, 16, 88, 32, 36, 53, 99, 68, 101, 48, 16, 6};
    }

    @org.junit.jupiter.api.Test
    void max() {
        assertEquals(101, Main.max(this.teddy));
    }

    @org.junit.jupiter.api.Test
    void min() {
        assertEquals(5, Main.min(teddy));
    }

    @org.junit.jupiter.api.Test
    void avg() {
        assertEquals(51.5, Main.avg(teddy));
    }
}