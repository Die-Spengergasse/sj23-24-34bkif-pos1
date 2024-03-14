public class Main {
    public static void main(String[] args) {
        Singleton sgt;
        sgt = Singleton.getInstance();
        System.out.println(sgt.getDbPool());
        if (sgt == Singleton.getInstance()) {
            System.out.println("same");
        }
    }
}
