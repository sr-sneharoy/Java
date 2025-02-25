import java.util.*;
class Account{
  int bal;

  Account (int bal){
    this.bal = bal;
  }

  boolean isSufficientBal(int w){
    if(bal > w) return true;
    else return false;
  }

  void withdraw(int amt, String str){
    bal = bal - amt;
    System.out.println(str + " Transaction Successful");
    System.out.println(str + " Current Balance is " + bal);
  }
}

class Customer implements Runnable{
  Account x1;
  String str;
  Customer(Account j1, String s){
    x1 = j1;
    str = s;
  }

  public void run(){
    Scanner sc = new Scanner(System.in);
    synchronized(x1){
      System.out.println(str + " Enter amount to withdraw : ");
      int amt = sc.nextInt();
      if(x1.isSufficientBal(amt)) x1.withdraw(amt, str);
      else System.out.println(str + " Insufficient Balance!!!");
    }
  }
}

public class J20_Synchronization {
  public static void main(String[] args) {
    Account a1 = new Account(5000);
    Customer c1 = new Customer(a1, "Sneha");
    Customer c2 = new Customer(a1, "Itachi");
    Thread t1 = new Thread(c1);
    Thread t2 = new Thread(c2);

    t1.start();
    t2.start();
  }
}
