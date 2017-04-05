public class Arguments {

  public static void main(String[] args) {
    // print the # of args
    System.out.println(args.length + " arguments were provided");
    
    System.out.println();
    
    // iterate over them and print them, along with their length
    for (String arg : args) {
      System.out.println(arg + " is a string with length " + arg.length());
    }
    
    System.out.println();
    
    // Lab02.7 - calculate their sum
    double sum = 0.0;
    
    for (String arg : args) {
      double argValue = Double.parseDouble(arg);
      sum = sum + argValue;
    }
    System.out.println("The sum of the arguments is: " + sum);
  }
}