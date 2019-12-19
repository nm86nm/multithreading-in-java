package one_thread;

public class MainThread {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(10);
        numbers.run();
    }
}
