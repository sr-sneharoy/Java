// Constructor in Inheritance
//this <= is an object pointer
class Nokia1{
  int x, y;

  Nokia1(int x, int y){
    this.x = x;
    this.y = y;
    System.out.println("Parent's Constructor is Called");
  }

  void display(){
    System.out.println(this.x);
    System.out.println(this.y);
  }
}
class Nokia2 extends Nokia1{  
  int z;

  Nokia2(int x, int y, int z){
    //by default super() is added 
    // super();  //to called parent's constructor
    //super() can be used to pass some argument to parent constructor

    super(x, y);
    this.z = z;

    System.out.println("Child's Constructor is Called");
  }

  void f2(){
    System.out.println("Nokia2");
  }
}

public class J10_Super {
  public static void main(String[] args){
    Nokia2 n2 = new Nokia2(4, 8, 9);
    System.out.println(n2.x + "   " + n2.y + "   " + n2.z);
    n2.display();
  }
}
