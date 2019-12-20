package two;

public class MainThread {
    public static void main(String[] args) {
        for(int i=0; i<4; i++)
            new Thread(new Counter(10)).start();
    }
}
