package three;

public class Calculator {
    public static void main(String[] args) {
        new Thread(new Operations(5, 2)).start();

    }
}
