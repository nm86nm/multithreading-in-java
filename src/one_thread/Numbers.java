package one_thread;

public class Numbers implements Runnable {

    private int number = 0;

    public Numbers(int number) {
        this.number = number;
    }

    public String status(){
        return (number>0 ? number : "END") + ", ";
    }

    @Override
    public void run() {
        while(number-- > 0){
            System.out.print(status());
        }
    }
}
