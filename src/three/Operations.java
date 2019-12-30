package calculator;

public class Operations implements Runnable {

    private static double number1;
    private static double number2;

    public Operations(double number1, double number2) {
        Operations.number1 = number1;
        Operations.number2 = number2;
    }

    @Override
    public void run() {
        System.out.println(number1 + " + " + number2 + " = " + sum());
        System.out.println(number1 + " - " + number2 + " = " + difference());
        System.out.println(number1 + " * " + number2 + " = " + product());
        System.out.println(number1 + " / " + number2 + " = " + quotient());
    }

    public static double sum() {
        return number1 + number2;
    }

    public static double difference() {
        return number1 - number2;
    }

    public static double product() {
        return number1 * number2;
    }

    public static double quotient() {
        return number1 / number2;
    }
}
