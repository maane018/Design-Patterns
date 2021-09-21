package SingletonPattern;

public class Singleton3 {
    private static Singleton3 instance = null;

    //    This is thread safe
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null)
                    instance = new Singleton3();
            }
        }
        return instance;

    }
}
