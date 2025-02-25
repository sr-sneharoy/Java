//Command Line Arguments
public class J5_CLA {

  //(String[] args) <= CLA
  public static void main(String[] args) {   //we can give value when we run this file 
// to compile we need to write in cmd  => javac J5_CLA.java
//to run the file need to write in cmd => java J5_CLA
//when we run the file we can pass some value => java J5_CLA sneha 42 roy london

    for(int i = 0; i < args.length; i++){ 
      System.out.println(args[i]);
    }

    System.out.println("Hello World!!!");
  }
}
