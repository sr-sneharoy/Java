// Abstract Class cannot have any object   => still have "CONSTRUCTOR"
// Abstract Class's child can have object

// Function can be abstract but its class also have to be abstract too
// If any member in a class is abstract then the class have to be abstract too

// Abstract Function => 
// abstract void f();  // not "{}"

abstract class Animal{   //Animal class cannot have any object

  int x;

  abstract void f1();

  void f2(){
    System.out.println("f2 is called!!!!");
  }

  //Although Animal class cannot have any object , but still it will always have constructor
  Animal(){
    System.out.println("Parent's Constructor");
  }
}


//here we inherit Animal class <= all the Animal class's member will present here in Tiger
//Meaning Tiger going to have one "Abstract Function"  <= then Tiger class has to be "abstract" too <= cannot have any child
// to avoid this we use "Function Overriding" 
// in "Function Overriding" <= parent's f1 will never be called <= Tiger don't have to be "abstract"
class Tiger extends Animal{
  int t;

  void f1(){
    System.out.println("Tiger's f1 is called!!!");
  }

  Tiger(){
    System.out.println("Child's Constructor");
  }

}

public class J14_Abstract {
  public static void main(String[] args){
    // Animal ani = new Animal();  //cannot have object

    Tiger ti = new Tiger();

    ti.f1();
  }
}
