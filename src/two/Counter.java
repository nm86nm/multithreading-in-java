package two;

public class Counter implements Runnable{

    private int number = 0;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public Counter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for(int i=number; i>0; i--)
            System.out.print("(id=" + id + ",i=" + i + ")");
    }
}
