package com.deloitte;

import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Set<Integer> items=new TreeSet<>();
		//Set<Integer> items=new HashSet<>();
		//List items = new ArrayList();
		//List items = new LinkedList();
		//Collection items = new ArrayList();
		//items.add("Hashir");
		items.add(25);
		items.add(25);
		items.add(25);
		items.add(2);
		items.add(5);
		items.add(20);
		//items.add(true);
		items.add(25);
		//items.add(20.6);
		//items.add(2,"Latif");
		
		for(int item:items) {
			System.out.println(item);
		}
		
		//items.remove(true);      // while passing list conversion to "Object" is necessary or else it will be read as an "index".
		
		System.out.println("\nAfter removing \n");
		
//		for(Object item:items) {		// using enhanced for loop.
//			System.out.println(item);
//		}
//		
//		Iterator it = items.iterator();	// using iterator.
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		for(int i=0;i<items.size();i++)
//		{
//			System.out.println(items.get(i));
//		}
		
//		items.forEach((item) -> System.out.println(item));		// using lambda.
		
		items.forEach(System.out::println);      // method reference. 
		
	System.out.println("Size : "+items.size());
	}

}
