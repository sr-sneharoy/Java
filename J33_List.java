// 1) List => child class => 1) ArrayList   2) LinkedList   3) Vector  => child class => Stack

// NOTE => "E" represent any datatype
// Function in List =>  1) void add(int index, E element)                => it will insert element in a particular index 
//                      2) E set(int index, E element)                   => it will replace element in a particular index and also return the element
//                      3) E get(int index)                              => it will return an element of given index
//                      4) int indexOf(Object o)                         => it will return index of given element
//                      5) int lastIndexOf(Object o)                     => it will return last index of given element (for multiple occurrence of given elements)
//                      6) E remove(int index)                           => it will remove and return of given index's element
//                      7) List<E> subList(int fromIndex, int toIndex)   => it will return a subList

 
// ArrayList = > 1) It is defined using dynamic Arrays
//               2) It is resizable
//               3) Duplicates are allowed
//               4) Insertion Order of elements are preserved
//               5) Null insertion is possible
//               6) Heterogeneous objects are allowed
// all child of List has this same characteristics


// ArrayList                                             LinkedList
// Access element through index is very faster           slower
// so Searching is also faster
// insertion deletion is complicated                     easier no need to shift any elements
// element shifting is need


import java.util.*;

public class J33_List {
  @SuppressWarnings("rawtypes")
  public static void main(String [] args){
    ArrayList <Integer> al = new ArrayList<>();
    Collections.addAll(al, 8, 9, 5, 2);

    // al.add(1,10);
    // System.out.println(al);

    // System.out.println(al.set(3, 30));
    // System.out.println(al);

    Iterator it = al.iterator();
    while(it.hasNext()){
      int n = (int) it.next();
      if(n != 9 ) System.out.println(n);
    }

  }
}
