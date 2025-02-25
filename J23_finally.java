public class J23_finally {
  public static void main(String[] args) {
    System.out.println("A");

    try{
      System.out.println(5/0);   // ArithmeticException  => but there is none to catch it so java will catch it and terminate it so "B" will never print
    }
    catch(NullPointerException err){
      System.out.println(err.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e.getMessage());
    }
    finally{
      System.out.println("B");
    }

    // System.out.println("B");   // to print "B" no matter what we will use finally 

    System.out.println("C");
  }
}

