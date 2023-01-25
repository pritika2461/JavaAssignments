package Calection;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(11);
		v.add(12);
		v.add(13);
		System.out.println(v);
		
		v.add(3, 14); 
		System.out.println(v);
		
		 System.out.println(v.size());
		 System.out.println(v.capacity());
		 
		 for(int i=0; i<10;i++)
		 {
			 v.addElement(i);
		 }
		 System.out.println(v);
		 
		 System.out.println(v.capacity());

		

	}

}
