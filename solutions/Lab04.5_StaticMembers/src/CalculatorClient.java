import com.math.util.Calculator;

public class CalculatorClient {

  public static void main(String[] args) {
    System.out.println(Calculator.add(2, 3));
    System.out.println(Calculator.subtract(5.5, 1.1));
    System.out.println(Calculator.multiply(4.1, 5));
    System.out.println(Calculator.divide(5, 2));
    System.out.println(Calculator.squareRoot(9));
  }
}