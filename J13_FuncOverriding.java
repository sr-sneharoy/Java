//Function Overriding  <= occur between parent and child
//Function name and arguments both are same

class Animal{
  int x;
  
  void display(){
    System.out.println("Parent's display");
  }
}

class Tiger extends Animal{
  int y;

  void display(){
    System.out.println("Child's display");
  }
}

public class J13_FuncOverriding {
  public static void main(String[] args) {
    Tiger t = new Tiger();
    t.display();
  }
}
