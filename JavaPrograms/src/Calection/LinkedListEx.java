package Calection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) 
	{
	    LinkedList ll = new LinkedList();	
	    
	    ll.add(12);
	    ll.add(13);
	    ll.add(14);
	    ll.add(15);
	    
	    System.out.println(ll);
	    
	    ll.remove(2);
	    
	    System.out.println(ll);
	    
	    boolean con = ll.contains(12);
	    
	    System.out.println(con);
	    
	    LinkedList l1 = new LinkedList();
	   //  l1.add(11);
	    l1.addAll(ll);
	    
	    System.out.println(l1);
	    
	    
	    if(ll.equals(l1))
	    {
	    	 System.out.println("Both are Equals...");
	    }
	    
	    ll.addFirst(11);
	    System.out.println(ll);
	    
	    ll.addLast(16);
	    System.out.println(ll);
	    
	    ll.clear();
	    System.out.println(ll);
	    

	}

}
