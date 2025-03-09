// there are many type of exception it is not possible to remember / handle each one of them so we will use Exception
// Since Exception is Parent 
// Parent can catch their child

public class J22_ExceptionHandling {
  @SuppressWarnings("null")
  public static void main(String[] args) {
    String s1 = null;
    try{
      System.out.println(s1.length());
    }
    catch(Exception err){
      System.out.println(err.getMessage());
    }

    System.out.println("A");

    try{
      System.out.println(5/0);
    }
    catch(Exception err){
      System.out.println(err.getMessage());
    }

    System.out.println("B");
  }
}
