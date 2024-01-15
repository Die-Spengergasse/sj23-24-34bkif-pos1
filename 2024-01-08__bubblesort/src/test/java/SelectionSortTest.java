import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    @Test
    void selectionSort() {
        int[] eingabe = new int[]{4, 8, 1, 4, 9, 1, 2, -1, 3, 7, 5};
        int[] ausgabe = new int[]{-1, 1, 1, 2, 3, 4, 4, 5, 7, 8, 9};
        SelectionSort instanz = new SelectionSort(eingabe);
        assertArrayEquals(eingabe, instanz.getIntArray());
        instanz.selectionSort();
        assertArrayEquals(ausgabe, instanz.getIntArray());
    }
}