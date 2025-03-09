// 2) Set => child class     => 1) HashSet => child class => LinkedHashSet
// 2) Set => child interface => 2) SortedSet => child interface => NavigableSet => child class => TreeSet

// HashSet      => 1) Duplicates are not allowed
//              => 2) Insertion order is not preserved but element insert according to hash table
//              => 3) Load factor is 0.75(by default can be changed)  Default capacity is 16
//              => 4) Null insertion is possible
//              => 5) Provide efficient searching
//              => 6) Heterogeneous objects are allowed


// HashSet create     => 1) HashSet(int capacity)
//                    => 2) HashSet(int capacity, float loadFactor)
//                    => 3) HashSet(Collection c) 

// LinkedHashSet    => 1) Insertion order is preserved
//                  => 2) Doubly LinkedList and HashSet both are used here  (Hybrid Data Structure)
//                  => 3) Load factor is 0.75(by default can be changed)  Default capacity is 16


// SortedSet => NavigableSet => TreeSet => 1) Heterogeneous objects are not allowed
//                                      => 2) Elements are in sorted order
  

import java.util.*;

public class J36_Set {
  public static void main(String [] args){
    HashSet <Integer> hs1 = new HashSet<>();
    Collections.addAll(hs1, 7, 8, 9);
    System.out.println(hs1);
  }

}
