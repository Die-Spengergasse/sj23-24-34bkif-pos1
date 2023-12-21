import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @org.junit.jupiter.api.Test
    void exceptionTestLowerFail() {
        boolean exeptionThrown = false;
        try {
            long[] x = Fibonacci.getFirstFibonaccis(-1);
        } catch (Exception e) {
            exeptionThrown = true;
        }
        assertEquals(true, exeptionThrown);
    }
    @org.junit.jupiter.api.Test
    void exceptionTestLowerSuccess() {
        boolean exeptionThrown = false;


        try {
            long[] x = Fibonacci.getFirstFibonaccis(0);  // OK
        } catch (Exception e) {
            exeptionThrown = true;
        }
        assertEquals(false, exeptionThrown);
    }

    @org.junit.jupiter.api.Test
    void exceptionTestUpperFail() {
        boolean exeptionThrown = false;
        try {
            long[] x = Fibonacci.getFirstFibonaccis(31);
        } catch (Exception e) {
            exeptionThrown = true;
        }
        assertEquals(true, exeptionThrown);  // too big

    }
    @org.junit.jupiter.api.Test
    void exceptionTestUpperSuccess() {
        boolean exeptionThrown = false;

        try {
            long[] x = Fibonacci.getFirstFibonaccis(30);  // OK
        } catch (Exception e) {
            exeptionThrown = true;
        }
        assertEquals(false, exeptionThrown);
    }

    @org.junit.jupiter.api.Test
    void correctResultsTest2() {
        assertArrayEquals(new long[]{0, 1}, Fibonacci.getFirstFibonaccis(2));
        } @org.junit.jupiter.api.Test
    void correctResultsTest5() {
         assertArrayEquals(new long[]{0, 1, 1, 2, 3}, Fibonacci.getFirstFibonaccis(5));
     } @org.junit.jupiter.api.Test
    void correctResultsTest6() {
         assertArrayEquals(new long[]{0, 1, 1, 2, 3, 5}, Fibonacci.getFirstFibonaccis(6));
    } @org.junit.jupiter.api.Test
    void correctResultsTest23() {
         assertArrayEquals(new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711}, Fibonacci.getFirstFibonaccis(23));
    }
}