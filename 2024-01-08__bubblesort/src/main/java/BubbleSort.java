import java.util.Arrays;

public class BubbleSort {
    private int[] intArray;

    public BubbleSort(int[] newArray) {
        this.intArray = newArray;
    }

    public static void main(String[] args) {
        BubbleSort instanz = new BubbleSort(new int[]{4, 8, 1, 4, 9, 1, 2, -1, 3, 7, 4});
        System.out.println(instanz);
        instanz.bubbleSort();
        System.out.println(instanz);
    }

    public void bubbleSort() {
        for (int obergrenze = intArray.length; obergrenze > 1; obergrenze--) {
            for (int i = 1; i < obergrenze; i++) {
                if (intArray[i] < intArray[i - 1]) {
                    tausche(i, i - 1);
                }
            }

        }
    }

    public void tausche(int index1, int index2) {
        int tmp = intArray[index1];
        intArray[index1] = intArray[index2];
        intArray[index2] = tmp;
    }

    public String toString() {
        return Arrays.toString(this.intArray);
    }
}
