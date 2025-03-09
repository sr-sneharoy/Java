// 1) default throw default catch  => program will be terminated
// 2) our throw default catch  => program will be terminated
// 3) default throw our catch
// 4) our throw our catch


//Throwable Class  => has 2 functions => 1) getMessage()  2) setMessage()  => all its child class will have these functions as well
// Throwable Class  => child => 1) Error    2) Exception

// Exception  => child   => 1) IOException 
//                          2) SQLException
//                          3) ClassNotFoundException
//                          4) RuntimeException

// RuntimeException  => child   => 1) NullPointerException
//                                 2) ArithmeticException
//                                 3) ArrayIndexOutOfBoundsException
//                                 4) IllegalArgumentsException


// Note Compile time Exception  => IOException, SQLException,ClassNotFoundException


// Compile time Exception  => checked Exception
// RuntimeException        => unchecked Exception


// Keyword => 
// 1) try =>
// 2) catch =>
// 3) throw =>
// 4) finally =>
// 5) throws =>


public class J21_ExceptionHandling {
  @SuppressWarnings("null")
  public static void main(String[] args) {
    // String s1 = null;
    // System.out.println(s1.length());  //NullPointerException  => program will terminate here next line will not run

    // System.out.println("A");
    // System.out.println(5/0);  //ArithmeticException   => program will terminate here next line will not run
    // System.out.println("B");


    String s1 = null;
    try{
      System.out.println(s1.length());
    }
    catch(NullPointerException err){
      System.out.println(err.getMessage());
    }
    //since we handle the error so next line will run

    System.out.println("A");

    try{
      System.out.println(5/0);
    }
    catch(ArithmeticException err){
      System.out.println(err.getMessage());
    }

    System.out.println("B");
  

  }
}
