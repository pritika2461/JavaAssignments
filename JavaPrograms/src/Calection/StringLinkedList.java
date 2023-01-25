package Calection;

import java.util.LinkedList;

public class StringLinkedList {

	public static void main(String[] args) 
	{
	        LinkedList<String> ll = new LinkedList<String>();
	        ll.add("Pritika");
	        ll.add("Puja");
	        System.out.println(ll);
	        
	        ll.addFirst("Shraddha");
	        System.out.println(ll);
	        
	        ll.addLast("Jayshree");
	        System.out.println(ll);
	        
	        ll.add(2, "Rani");
	        System.out.println(ll);
	        
	        ll.remove("Rani");
	        System.out.println(ll);
	        
	        ll.remove(2);
	        System.out.println(ll);
	        
	        ll.add("Pritika");
	        System.out.println(ll);
	        
	        ll.removeFirstOccurrence("Pritika");
	        System.out.println(ll);
	        
	        ll.removeLastOccurrence("Pritika");
	        System.out.println(ll);
	        
	        ll.removeFirst();
	        System.out.println(ll);
	        
	        ll.removeLast();
	        System.out.println(ll);
	        
	        ll.add("Prajali");
	        System.out.println(ll);
	        
	        ll.add("Jyoti");
	        System.out.println(ll);
	        
	        ll.containsAll(ll);
	        System.out.println(ll);
	        
	        ll.clear();
	        System.out.println(ll);
	        
	        

	}

}
