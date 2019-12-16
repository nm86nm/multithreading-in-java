package example1;

class Example1 implements Runnable{

    private String threadName;

    public Example1(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i=1; i<=4; i++) {
            System.out.println("Thread name is: " + threadName + ", number = " + i);
        }
    }
}
