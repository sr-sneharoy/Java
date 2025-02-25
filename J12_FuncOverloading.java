//Function overloading
//Compiler decide which function to call <= Polymorphism
class Num{
  int x;

  void setter(int x){
    this.x = x;
  }

  void setter(){
    x = 6;
  }
}

public class J12_FuncOverloading {
  public static void main(String[] args) {
    Num n = new Num();
    n.setter();
    // n.setter(8);
    System.out.println(n.x);
  }
}
