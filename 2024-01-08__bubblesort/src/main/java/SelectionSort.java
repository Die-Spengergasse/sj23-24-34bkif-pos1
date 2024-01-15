public class SelectionSort {
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

    private void selectionSort() {
    }

}
