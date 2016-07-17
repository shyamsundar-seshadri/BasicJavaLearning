import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import sun.reflect.generics.tree.Tree;



public class CollectionsDemo {
	/**
	 * @author Shyam, Ganesh
	 * @category Demo class
	 * @see Set ,List, Map, SortedSet, SortedMap, HashSet, TreeSet, ArrayList, LinkedList
	 * @see Vector, Arrays, AbstractCollection
	 * */
	
	public static void main(String[] args) {
		/**
		 * Note : List, Map, Set are interface
		 */
		System.out.println("Hello World !!" +System.lineSeparator()+"Welcome to Collections Demo !!");
//		HashTableDemo();
		//arrayList();
		//stackDemo();
//		System.out.println("------------------------------------");
//		vectorDemo();
//		System.out.println("------------------------------------");
//		dictionaryDemo();
//		System.out.println("------------------------------------");
//		linkedListDemo();
//		System.out.println("------------------------------------");
		hashMapDemo();
//		System.out.println("------------------------------------");
//		hashSetDemo();
//		System.out.println("------------------------------------");
//		treeSetDemo();
//		System.out.println("------------------------------------");
//		treeMap();

		System.out.println("------------------------------------");
		System.out.println("------------------------------------------------------------" +
				"\n\t\t\tThank you . . Babye !! \n"+
				"------------------------------------------------------------");
	}

	private static void linkedHashMapDemo(){
		LinkedHashMap LHM = new LinkedHashMap();
	}
	private static void HashTableDemo(){
		Hashtable ht = new Hashtable();
		ht.put("","");
		ht.put(0,0);
		System.out.println(ht);
		
	}
	private static void arrayList(){
		ArrayList al = new ArrayList(2);
		System.out.println(al.size());
		int two = 2;
		al.add(two);
		al.add("sf");
		al.add(2);
		System.out.println(al.size());
		al.ensureCapacity(0);
		al.add(3);
		al.set(0, 1);
		System.out.println(al);
		System.out.println();
	}
	private static void treeSetDemo() {
		/**
		 * Note: Tree Set is a serialized class .
		 * It extends  abstract class AbstractSet 
		 * It implements NavigableSet interface which extends SortedSet interface
		 * 
		 * */
		System.out.println("TreeSet Demo");
		TreeSet ts = new TreeSet();

		
		ts.add(1);
		ts.add(3);
		ts.add(2);
//		ts.add(null);
		System.out.println("Elements of TreeSet are "+ts);
		System.out.println(ts.ceiling("three"));
		}

	private static void treeMap(){
		
		TreeMap hm = new TreeMap();
		hm.put("one", 1);
		hm.put("aye",2);
		hm.put("azm", 7);
		hm.put("man", 5);
		System.out.println(hm.ceilingKey("a"));
		System.out.println("Elements of TreeMap are "+hm);

		
		
	}
	private static void hashSetDemo() {
		/**
		 * Note : Hash Set implements Set. It extends the abstract class AbstractSet
		 * It is set of element without duplicates
		 * */ 
		System.out.println("--------Entering Hash Set Demo-------");
		HashSet hs = new HashSet();
	
		hs.add(1);
		hs.add(2);
		hs.add(null);
		Boolean b= hs.add(null);
		System.out.println("Second attempt is "+b);
		System.out.println("Hash set elements are "+hs);
		System.out.println("Attempting to add another element 1");
		System.out.println(hs.add(1) ? "Success":"Pusss");
		System.out.println("Hash Set elements after attempting to add Dups "+hs+"\nSo Hash don't take Dups :)");
		Iterator i= hs.iterator();
		System.out.println("Printing elements using iterator");
		while (i.hasNext()){
			System.out.println(i.next());
		}
		Spliterator si = hs.spliterator();
	
	}

	private static void linkedListDemo() {
		/**
		 * Note: Linked List implements List and extends abstract class AbstractSequentialList
		 * */
		System.out.println("------------Entering List Demo------------");
		LinkedList ll=new LinkedList();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		for (int i=0;i<ll.size() ;i++){
			System.out.print(i+"th element is "+ll.get(i)+". ");
		}
		System.out.println();
		System.out.println("Elements in descending order using descendingIterator is ");
		Iterator i = ll.descendingIterator();
	
		while (i.hasNext()){
			System.out.print(" "+i.next()+" ");
		}
		System.out.println("\n Normal Iterator is ");
		Iterator ii = ll.iterator();
		while (ii.hasNext()){
			System.out.print(" "+ii.next()+" ");
		}
		
		//List Iteraor is an interface . 
		//Below is the example of ListIterator implementation in LinkedList in a method listIterator
		//It helps in navigation of linked list in either direction
		System.out.println();
		ListIterator li= ll.listIterator(3);
		while (li.hasPrevious()){
			System.out.print(" "+li.previous());
		}
		
		System.out.println();
	}

	static void hashMapDemo() {
		/**
		 * Note : Hash Map implements Map and extends abstract class AbstractMap
		 * */
		System.out.println("------------Entering HashMap Demo------------");
		HashMap m = new HashMap();
		m.put("one", null);
		m.put("Key", null);
		m.put(null, 2);
		m.put("three", 3);
		m.put("",5);
		System.out.println("Map is" + m);
		System.out.println("Map have key one ? " + m.containsKey("one"));
		System.out.println("Map have key five ? " + m.containsKey("five"));
		System.out.println("Map have value 2 ? " + m.containsValue(2));
		m.remove("two");
		System.out.println("Does map have key two after removal? "
				+ m.containsKey("two"));
		Collection S= m.values();
//		LinkedList ll = (LinkedList) m.keySet();    Impossible . . Can type cast though it doesnt show error !!
		System.out.println("Key Values are " +m.keySet());
		System.out.println("Collection value is "+S);
		System.out.println("Attempting to put different value in same map");
		System.out.println("Providing value 6 to key one");
		m.put("one", 6);
		System.out.println("Value of key one is "+m.get("one")); // value is overridden
//		m.clear();
		
		Iterator i=  m.entrySet().iterator();
		while (i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println("Test");
//		System.out.println(mE.getKey());
		System.out.println("after clear " + m);
	}

	static void dictionaryDemo() {
		System.out.println("------------Entering dictionary Demo------------");
		/**
		 *It's an abstract class and all methods under it are abstract . .
		 *Cannot be instantiated 
		 *Need to extend it and override logic for all its abstract methods.
		 *This method is obsolete . Better to extend Map interface 
		 **/
	}

	static void stackDemo() {
			/**
			 * Note: Stack is a subclass of Vector
			 **/
		System.out.println("------------Entering stackDemo------------");
		Stack s = new Stack();
		s.add(1);
		s.push(6);
		s.push(5);
		s.set(1, 8);
		System.out.println("Stack contains element 2 ? "+s.contains(2));
		System.out.println("What is the element at position 0 ? "+s.elementAt(0));
		System.out.println("Peek " + s.peek());
		System.out.println("Pop " + s.pop());
		System.out.println("Peek " + s.peek());
		s.remove(1);
		System.out.println("Peek " + s.peek());
	}

	static void vectorDemo() {
		/**
		 * Note : Vector implements List interface
		 * */
		System.out.println("------------Entering Vector Demo------------");
		Vector V = new Vector(2);
		V.addElement(5); // Adding Element 5
		System.out.println("First element is " + V.firstElement());
		System.out.println("Capacity is " + V.capacity());
		V.addElement(7); //Adding element 7
		System.out.println("V contains 1? "+V.contains(1) != null ? "Yes" : "No");
		System.out.println("Capacity is " + V.capacity());
		System.out.println("Vector size is " + V.size());
		V.addElement(10);
		System.out.println("Capacity is " + V.capacity());
		System.out.println("Vector size is " + V.size());
		V.remove(0);				// Removing first element
		V.removeElement(10);		// Removing element having value 10
		int index = V.indexOf(10);
		System.out.println("Capacity is " + V.capacity());
		System.out.println("Vector size is " + V.size());
		System.out.println("Vector Index is " + index);
		String a = V.contains(7) ? "Y" : "N";	//checking Vector contains value 7
		System.out.println("A value is" + a);
		if (V.contains(10)) {
			System.out.println("Contains. Value is " + V.firstElement());
		} else
			System.out.println("Not Contain" + V.firstElement());
		System.out.println("Element at 0 is " + V.elementAt(0));
	}
	
}
