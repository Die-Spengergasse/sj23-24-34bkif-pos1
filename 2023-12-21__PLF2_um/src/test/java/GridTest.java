import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridTest {

    @Test
    void exceptionTestLine24() {
        boolean exeptionThrown = false;
        try {
            String x = Grid.drawGrid(2, 4); // wrong lines
        } catch (Exception e) {
            exeptionThrown = true;
        }
        assertEquals(true, exeptionThrown);

    }
    @Test
    void exceptionTestLine74() {
        boolean exeptionThrown = false;

        try {
            String x = Grid.drawGrid(7, 4); // OK
        } catch (Exception e) {
            exeptionThrown = true;
        }
        assertEquals(false, exeptionThrown);

    }
    @Test
    void exceptionTestColumn55() {
        boolean exeptionThrown = false;
        try {
            String x = Grid.drawGrid(5, 5); // wrong columns
        } catch (Exception e) {
            exeptionThrown = true;
        }
        assertEquals(true, exeptionThrown);

    }
    @Test
    void exceptionTestColumn59() {
        boolean exeptionThrown = false;
        try {
            String x = Grid.drawGrid(5, 10); // OK
        } catch (Exception e) {
            exeptionThrown = true;
        }
        assertEquals(false, exeptionThrown);

    }

    @Test
    void testDrawGrid57() {
        String         expected = """
                # # # # # # #
                # . . # . . #
                # # # # # # #
                # . . # . . #
                # # # # # # #""";
        assertEquals(expected, Grid.drawGrid(5, 7));
    }
    @Test
    void testDrawGrid77() {
        String expected = """
                # # # # # # #
                # . . # . . #
                # # # # # # #
                # . . # . . #
                # # # # # # #
                # . . # . . #
                # # # # # # #""";
        assertEquals(expected, Grid.drawGrid(7, 7));

    }
    @Test
    void testDrawGrid11() {
        String expected = "#";

        assertEquals(expected, Grid.drawGrid(1, 1));

    }
    @Test
    void testDrawGrid510() {
        String expected = """
                # # # # # # # # # #
                # . . # . . # . . #
                # # # # # # # # # #
                # . . # . . # . . #
                # # # # # # # # # #""";
        assertEquals(expected, Grid.drawGrid(5, 10));
    }


}