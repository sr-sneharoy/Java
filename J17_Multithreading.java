// Multithreading => 1) Using Runnable Interface
//                   2) Using Thread Class

// Thread States   => 1) New Thread
//                    2) Runnable
//                    3) Not Runnable
//                    4) Dead


//NOTE => interface cannot have any object but it can have reference variable of it's child object => by using this reference variable we acn access only the parent's members

interface Demo{
  int x = 8;
  void f1();
}

class Box implements Demo{
  int z;

  public void f1(){
      System.out.println("f1 overridden function is called in Box!!!");
    }

  void f2(){
    System.out.println("f2 function in Box is called!!!!");
  }

}


public class J17_Multithreading {
  public static void main(String[] args) {
    // Demo d1 = new Box();
    // System.out.println(d1.x);

    // d1.f2();  // d1 cannot access child member
  }
}
