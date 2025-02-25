class Nokia1{
  int x, y;

}
class Nokia2 extends Nokia1{  
  int z, x;

  void setter(int a, int x, int y, int z){
    this.z = z;
    this.x = a;

    //to access parents members
    super.x = x; // we use super keyword because x present in both child and parent to specify the parent's x we need to use super
//super keyword only point to the parent's members 

//but this keyword point to the all members(including parent's members)
//since there is only one y so we can access it with both this and super keyword 
    this.y = y;
  }

  void display(){
    System.out.println(x);
    System.out.println(z);

    System.out.println(super.x);
    System.out.println(y);
  }

}


public class J11_SuperKeyword {
  public static void main(String[] args) {
    Nokia2 n2 = new Nokia2();

    n2.setter(20, 10, 5, 15);
    n2.display();
  }
}
