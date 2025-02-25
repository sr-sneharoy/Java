//Java is ALMOST 100% OOP Language
//We always have to write any function inside a class 
// But we can write variables outside of the class 


//But we can make JAVA 100% OOP Language by using Wrapper Class
// Boolean,  Character, Byte, Short, Integer, Long, Float, Double  <= Wrapper Class

public class J3_WrapperClass {
  public static void main (String[] args){
    int x = Integer.parseInt("1234");
    System.out.println(x);

    int x2 = Integer.parseInt("1234", 8);  //treat as octal number
    System.out.println(x2);

    Integer x3 = Integer.valueOf("111101");
    int y3 = x3.intValue();
    System.out.println(y3);


    Integer x4 = Integer.valueOf("111101", 2);   //treat as binary number
    int y4 = x4.intValue();
    System.out.println(y4);
  }
}
