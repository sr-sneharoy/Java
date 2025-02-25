// Array in java
import java.util.*;
public class J4_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array : ");
    int n = sc.nextInt();

    int a[] = new int[n]; //a is a referencing variable which point to an object which contain 'n' blocks and one extra block(for length)
 
    System.out.println("Enter elements for the array :");
    for(int i = 0; i < a.length; i++){
      a[i] = sc.nextInt();
    }
    sc.close();

    for(int i = 0; i < a.length; i++)
      System.out.println(a[i]);
    }

    
}
