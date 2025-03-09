// Cursors => 1) Enumeration  (interface)  => only available for vector & stack   => move in single direction
//         => 2) Iterator   (interface) => available for all Collection Child  => move in single direction

// 2) Iterator => child interface => 1) ListIterator    (interface)  => bi-directional cursor

import java.util.*;

public class J37_Cursors {
  public static void main(String [] args){
    //Enumeration
    Vector <Integer> vc1 = new Vector<>();
    Collections.addAll(vc1, 7, 8, 9, 2);

    Enumeration <Integer> k1 = vc1.elements();
    while(k1.hasMoreElements()){
      System.out.print(k1.nextElement() + "    ");
    }

    System.out.println();


    // Iterator

    Iterator <Integer> i1 = vc1.iterator();
    while(i1.hasNext()){
      System.out.print(i1.next() + "    ");
    }

    System.out.println();


    // ListIterator
    ListIterator <Integer> l1 = vc1.listIterator();

    while(l1.hasNext()) {
      System.out.print(l1.next() + "    ");
    }
    
    while(l1.hasPrevious()) {
      System.out.print(l1.previous() + "    ");
    }


  }
}
