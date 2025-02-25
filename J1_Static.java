//Only one class can be public in one java file
// normal class cannot be private or protected
// we can make another class inside a class . It is called inner class it can be private or protected

class Funny{

  int x; //instance (object) member variable

  static int y;

  static void fun1(){
    System.out.println("fun1");
  }

  //non-static function to access this we need to create a Funny variable
  void fun2(){  //instance (object) member function   <= since no static keyword
    System.out.println("fun2");
  }
}

public class J1_Static {
  public static void main(String[] args) {
    System.out.println("Main");
    Funny.fun1();   //since fun1 is static function. so it can be called directly
    Funny.y = 2;  //since y is static 
    // Funny.fun2();  //error

    Funny f = new Funny();
    f.fun2();
    System.out.println(f.x);   //by default variable store "0 "
  }
}