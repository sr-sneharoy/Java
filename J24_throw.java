// In bank if withdraw money is greater than balance then it is an error 
// but in java it is not an error . it will store balance in negative value
// to handle this type of error we use throw keyword 
// we can also use throw keyword to set error messages

import java.util.*;
public class J24_throw {
  public static void main(String[] args) {
    int cb = 10000;

    System.out.println("\nEnter how much you want to withdraw : ");
    Scanner sc = new Scanner(System.in);
    int wb = sc.nextInt();
    sc.close();

    try{
      if(cb < wb){
        throw new ArithmeticException("Insufficient Balance!!");   //set error message
      }

    cb = cb - wb;
    System.out.println("Withdraw Successful");
    System.out.println("Current Balance is : " + cb);
    }
    catch(ArithmeticException err){
      System.out.println(err.getMessage());
      System.out.println("Current Balance is : " + cb);
    }
  }
}
