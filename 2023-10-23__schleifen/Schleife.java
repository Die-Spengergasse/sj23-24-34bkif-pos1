public class Schleife {
    public static void main(String[] args) {
        System.out.println();
        long prepre = 0;
        long pre = 1;

        for (long fib = pre + prepre; fib > 0; fib = pre + prepre) {
            System.out.println(fib);
            prepre = pre;
            pre = fib;
        }
    }
}
