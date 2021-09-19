package SingletonPattern;

public class Singleton1 {
    private static Singleton1 instance = null;
//    This is lazy loading
    public static Singleton1 getInstance() {
        if(instance == null) {
            instance = new Singleton1();
        }
        return instance;

    }
}
