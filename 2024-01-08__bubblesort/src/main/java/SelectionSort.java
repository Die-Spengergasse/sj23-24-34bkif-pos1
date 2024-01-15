import java.util.Arrays;

public class SelectionSort {
    public int[] getIntArray() {
        return this.intArray;
    }

    private int[] intArray;

    public SelectionSort(int[] newArray) {
        this.intArray = newArray;
    }

    public static void main(String[] args) {
        SelectionSort instanz = new SelectionSort(new int[]{4, 8, 1, 4, 9, 1, 2, -1, 3, 7, 4});
        // SelectionSort instanz = new SelectionSort(new int[]{3,2,1});
        System.out.println(instanz);
        instanz.selectionSort();
        System.out.println(instanz);
    }

    public void selectionSort() {
        for (int beginn = 0; beginn < intArray.length - 1; beginn++) {
            int indexVonKleinstem = getIndexVonKleinstemAb(beginn + 1);
            if (intArray[indexVonKleinstem] < intArray[beginn]) {
                tausche(beginn, indexVonKleinstem);
            }
        }
    }

    private void tausche(int index1, int index2) {
        int tmp = intArray[index1];
        intArray[index1] = intArray[index2];
        intArray[index2] = tmp;
    }

    private int getIndexVonKleinstemAb(int i) {
        int bisherKleinsterIndex = i;
        for (int j = i + 1; j < intArray.length; j++) {
            if (intArray[bisherKleinsterIndex] > intArray[j]) {
                bisherKleinsterIndex = j;
            }
        }
        return bisherKleinsterIndex;
    }

    public String toString() {
        return Arrays.toString(this.intArray);
    }
}
