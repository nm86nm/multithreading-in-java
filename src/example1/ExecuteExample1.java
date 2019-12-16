package example1;

public class ExecuteExample1 {
    public static void main(String[] args) {
        Example1 example1_1 = new Example1("Thread1");
        example1_1.run();

        Example1 example1_2 = new Example1("Thread2");
        example1_2.run();
    }
}
