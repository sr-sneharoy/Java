// main() method can be overloaded.
// but main function with "String[] args" this argument will always be called

// although we can call other main function inside this  public static void main(String[] args) {}

public class J15_mainOverloading {

  public static void main(int n) {
    System.out.println("Inside int n");
    System.out.println(n);
  }

  public static void main(String[] args) {
    System.out.println("Inside String[] args");
    for(int i = 0; i < args.length; i++)
      System.out.print(args[i]);
      System.out.print("    ");
    
    //   System.out.println();

    // main(5);
    // main("Hello");
  }

  public static void main(String str) {
    System.out.println("\nInside String str");
    System.out.println(str);
  }
}



// normally run it 

// then run it by passing different arguments
// javac J15_mainOverloading.java
// java J15_mainOverloading 

