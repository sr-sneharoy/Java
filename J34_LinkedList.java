// Function in LinkedList  =>  1) void addFirst(Object o1) 
//                         =>  2) void addFirst(Object o1)
//                         =>  3) Object getFirst()
//                         =>  4) Object getLast()
//                         =>  5) Object removeFirst()
//                         =>  6) Object removeLast()

// Create LinkedList => LinkedList l1 = new LinkedList(); 
//                   => LinkedList l1 = new LinkedList(a1);
//NOTE => here a1 is an ArrayList => so basically we can also send an collection as argument and create a linked list using these collection's data

import java.util.*;

public class J34_LinkedList {
  public static void main(String[] args){
    LinkedList <Integer> l1 = new LinkedList<>();
    l1.addFirst(5);
    l1.addFirst(8);
    System.out.println(l1);
    Collections.addAll(l1, 18, 29, 15, 12);
    System.out.println(l1);


    ArrayList <Integer> a1 = new ArrayList<>();
    Collections.addAll(a1, 8, 9, 5, 2);
    LinkedList <Integer> l2 = new LinkedList<>(a1);
    System.out.println(l2);

  }
}
