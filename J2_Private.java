//Only one class can be public in one java file
// normal class cannot be private or protected
// we can make another class inside a class . It is called inner class it can be private or protected
class A{
  private int x;  //instance member variable

  private static int y;
  
  void setter(){
    y = 22;
  }

  void getter(){
    System.out.println(y);
  }

  void setter2 (){
    y = 42;
  }

  void setterX (){
    x = 5;
  }
  void getterX (){
    System.out.println(x);
  }

}

public class J2_Private {
  public static void main(String[] args){
      A obj1 = new A();

      obj1.getter();
      obj1.setter();

      A obj2 = new A();

      obj2.getter();
      obj2.setter2();
      obj1.getter();

      //so basically y is a common variable. if y = 42 then it is 42 for both of them obj1 and obj2 


// x is the private instance member variable
      obj1.setterX();
      obj1.getterX();
      obj2.getterX();
// x is different for both of them obj1 and obj2

  }
}
