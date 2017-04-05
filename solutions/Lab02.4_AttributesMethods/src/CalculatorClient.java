public class CalculatorClient {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.add(2, 3));
    System.out.println(calc.subtract(5.5, 1.1));
    System.out.println(calc.multiply(4.1, 5));
    System.out.println(calc.divide(5, 2));
    System.out.println(calc.squareRoot(9));
  }
}