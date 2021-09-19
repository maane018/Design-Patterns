package SingletonPattern;

public class Singleton2 {
    private static Singleton2 instance = new Singleton2();
//    This is early loading
    public static Singleton2 getInstance() {
        return instance;

    }
}
