// Collections => class  => all function here is static  => has lot function like (sort , ....) => this function take argument as Collection's objects
//                                                                                => example =>  Collections.sort(ArrayList arr)

// Collection => interface  <=  it is what we are going to study right now
// Collection => child interface =>  1) List    2) Set    3) Queue

// 1) List => child class => 1) ArrayList   2) LinkedList   3) Vector  => child class => Stack

// 2) Set => child class     => 1) HashSet => child class => LinkedHashSet
// 2) Set => child interface => 2) SortedSet => child interface => NavigableSet => child class => TreeSet

// 3) Queue => child class  => 1) PriorityQueue
//                          => 2) BlockingQueue  => child class => 1) PriorityBlockingQueue    2) LinkedBlockingQueue


// Map => interface
// Map => child class        => 1) HashMap => child class => LinkedHashMap
//                           => 2) WeakHashMap
//                           => 3) IdentityHashMap
//                           => 4) Hashtable => child class => Properties
//     => child interface    => 1) SortedMap => child interface => NavigableMap => child class => TreeMap


// NOTE =>  Array VS Vector
// ARRAY                                             VECTOR
// Unsynchronize                                     Synchronize
// Not Thread Safe (Data can be lost)                Thread Safe
// Fast                                              Slow

// ArrayList  => can store heterogeneous data  => size can be increase 

import java.util.*;

public class J31_Collection{
  public static void main(String[] args) {
    ArrayList <String> l1 = new ArrayList<>(5);
    l1.add("A");
    l1.add("B");
    l1.add("C");
    System.out.println(l1);
  }
}