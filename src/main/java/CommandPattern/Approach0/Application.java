package CommandPattern.Approach0;

public class Application {
    public static void main(String[] args) {
        Remote remote = new Remote();
        remote.push(1);
        remote.push(3);
        remote.push(4);
        remote.push(2);
    }
}
