public class Arguments {

  public static void main(String[] args) {
    // print the # of args
    System.out.println(args.length + " arguments were provided");
    
    System.out.println();
    
    // iterate over them and print them, along with their length
    for (String arg : args) {
      System.out.println(arg + " is a string with length " + arg.length());
    }
  }
}