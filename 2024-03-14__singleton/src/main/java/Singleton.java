public class Singleton {
    private static Singleton instance = null;
    private int dbPool;

    private Singleton() {
        this.dbPool = 42;
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public int getDbPool() {
        return dbPool;
    }

}
