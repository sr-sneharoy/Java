// Inheritance =>
// 1) Single Inheritance  => one parent one child
// 2) Multilevel Inheritance  => parent class => child class(parent) => child class
// 3) Hierarchical Inheritance => one parent multiple child


// 1) Single Inheritance  => one parent one child
class Nokia1{
  int x, y;
  void f1(){
    System.out.println("Nokia1");
  }
}
class Nokia2 extends Nokia1{  
  int z;
  void f2(){
    System.out.println("Nokia2");
  }
}


// 2) Multilevel Inheritance  => parent class => child class(parent) => child class
class Mobile{
  int m;
  void callHistory(){
    System.out.println("Call History feature add");
  }
}

class Vivo extends Mobile{
  int camera;
  void music(){
    System.out.println("Music is playing");
  }
}

class VivoY19 extends Vivo{ 
  int battery;
}


// 3) Hierarchical Inheritance => one parent multiple child
class Animal{
  int legs;
  void live(){
    System.out.println("Lives in jungle");
  }
}

class Tiger extends Animal{
  int roar;
}
class Elephant extends Animal{
  int weight;
}



public class J9_Inheritance {
  public static void main(String[] args) {
    
  }
}
