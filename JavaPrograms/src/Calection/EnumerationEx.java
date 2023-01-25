package Calection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		 
		 for(int i=0; i<10;i++)
		 {
			 v.addElement(i);
		 }
		 System.out.println(v);
		 
		 Enumeration<E> e = v.elements();
		 while(e.hasMoreElements())
		 {
			 Integer i = (Integer)e.nextElement();
			
			 if(i%2==0)
			 {
				 System.out.println(i);
			 }
			 else
			 {
				 v.remove(i);
			 }
			 
		 }
		 System.out.println(v);

	}
	

}
