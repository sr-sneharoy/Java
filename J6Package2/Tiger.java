package J6Package2;
import J6Package1.*;

public class Tiger {
  public static void main (String [] args){
    System.out.println("Hello World");
    Animal a = new Animal();
    a.setData(5, 8);
    a.display();
  }
}


// To Compile
// D:\1_CODE\JAVA>javac J6Package2/Tiger.java 

// To Run
// D:\1_CODE\JAVA>java J6Package2.Tiger