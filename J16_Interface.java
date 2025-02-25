// Interface cannot have any object like Abstract Class <= Unlike abstract class interface don't have constructor
// Interface's child can have object
// But in Interface all the variables are public, final, static by default
// Since its variables are static by default we can access it directly through the Interface (without making any object)
// Function in Interface are public and abstract by default => meaning function cannot have body(cannot have "{}")
// but if we make the function static then it can have body "{}"
// but static function cannot be inherited
// static variable can be inherited 

// Interface don't have constructor => in Interface all the variables are final by default => need to assign value immediately
// since value need to initialized during declaration, constructor is not needed  

interface Car{
  int x = 5;

  // void f1(){}  // error
  void f1();

  static void f2(){  //static function cannot be inherited
    System.out.println("static function can have body in interface");
  }
}

interface Car2 extends Car{
  int y = 15;
}

//since Car interface has an abstract function => we either need to make BMW class abstract class or overriding f1 function also make it public
class BMW implements Car{
  int price;

  public void f1(){
    System.out.println("Overriding f1 function in BMW.");
  }
}

interface FancyCar{
  int speed = 100;
}

//Multiple Inheritance using Interface
class Lamborghini implements Car, FancyCar{
  public void f1(){
    System.out.println("Overriding f1 function in Lamborghini.");
  }
}

public class J16_Interface {
  public static void main(String[] args) {
    System.out.println(Car.x);
    System.out.println(Car2.x);

    BMW b = new BMW();
    // System.out.println(b.x);
    System.out.println(BMW.x);
    b.f1();
    // b.f2(); //static function cannot be inherited

  }
}


