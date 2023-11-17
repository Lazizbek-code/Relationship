package uses;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double sum = calculator.sum(15, 25);
        System.out.println("sum = " + sum);
    }
}
