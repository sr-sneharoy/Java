import java.util.*;

public class J32_Array_ArrayList{
  public static void main(String [] args){
    int [] arr = {8, 2, 9, 5, 1, 3};
    Arrays.sort(arr);
    for(int i = 0; i < arr.length; i++ ) System.out.print(arr[i] + "  ");
    System.out.println("\n");


    ArrayList <Integer> al = new ArrayList<>(2);
    System.out.println(al.size());
    al.add(15);
    al.add(7);
    System.out.println(al.size());
    al.add(8);
    al.add(2);
    System.out.println(al.size());

    System.out.println(al);
    Collections.sort(al);
    System.out.println(al);

  }
}