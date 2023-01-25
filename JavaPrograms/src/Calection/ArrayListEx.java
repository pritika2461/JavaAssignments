package Calection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("Pritika");
		al.add("Rani");
		al.add("Puja");
		
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add("Pranjali");
		
		al2.add(al);
		
		System.out.println(al2);
		al.set(1, "Jayshree");
		System.out.println(al);
		
		List l1 = new ArrayList();
		l1.add("P");
		l1.add("R");
		l1.add("I");
		l1.add("T");
		l1.add("I");
		System.out.println(l1);
	}

}
