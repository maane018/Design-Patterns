package SingletonPattern;

public class Application {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();
//        Observe: Same instance
        System.out.println(instance);
        System.out.println(instance1);
    }
}
