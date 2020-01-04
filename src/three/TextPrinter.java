package three;

public class TextPrinter implements Runnable {
    private String textToPrint;

    public TextPrinter(String textToPrint) {
        this.textToPrint = textToPrint;
    }

    @Override
    public void run() {
        System.out.println(textToPrint);
    }
}
