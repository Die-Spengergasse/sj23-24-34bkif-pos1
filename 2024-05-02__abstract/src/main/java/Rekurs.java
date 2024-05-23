public class Rekurs {
    public static void main(String[] args) {
        System.out.println(fact(7));
        System.out.println(fact(5));
        System.out.println(fact(7));
        System.out.println(fact(13));
    }

    static long fact(int par) {
        if (par == 1) {
            return 1;
        }
        return par * fact(par - 1);
    }
}
