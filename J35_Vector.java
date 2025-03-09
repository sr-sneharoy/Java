// Methods in vector is synchronous so it is thread safe



import java.util.*;

public class J35_Vector {
  public static void main(String[] args){
    Vector <Integer> v1 = new Vector<>();
    Collections.addAll(v1, 4, 8, 2, 6, 1);
    System.out.println(v1); 
  }
}
