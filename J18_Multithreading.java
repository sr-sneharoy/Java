// 1) Using Runnable Interface

// Thread class build in java
// Runnable interface build in java

// Constructor in Thread class only receive Runnable type of data
// Runnable is Interface (cannot have any object) but its child can have 
// So make Process1 and Process2 child of Runnable interface
// Runnable interface has one function name "run" => we need to override it

class Process1 implements Runnable{
  public void run(){
    for(int i = 0; i < 10; i++)
      System.out.println("Process1 : " + i);
  }
}

class Process2 implements Runnable{
  public void run(){
    for(int i = 0; i < 10; i++)
      System.out.println("Process2 : " + i);
  }
}

public class J18_Multithreading {
  public static void main(String[] args) {
    Process1 p1 = new Process1();
    Process2 p2 = new Process2();

    Thread t1 = new Thread(p1);
    Thread t2 = new Thread(p2);
    t1.start();
    t2.start();
  }
}
