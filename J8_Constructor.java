//Constructor => 
// Default Constructor
// Parameterized Constructor
// Copy Constructor

// There is no destructor in JAVA. There is a garbage collector.

//NOTE => constructor can be private but then this class cannot have any object


class Num{
  int x, y;

   Num(){
    System.out.println("Default Constructor");
   }

   Num(int a, int b){
    this.x = a;
    this.y = b;
    System.out.println("Parameterized Constructor");
   }

   Num(Num n){
    this.x = n.x;
    this.y = n.y;
    System.out.println("Copy Constructor");
   }
}

public class J8_Constructor {
  public static void main(String[] args) {
    Num n = new Num();
    System.out.println(n.x);

    Num m = new Num(5,8);
    System.out.println(m.y);

    Num l = new Num(m);
    System.out.println(l.x);


  }
}
