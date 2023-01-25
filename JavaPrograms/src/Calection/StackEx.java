package Calection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push("P");
		s.push("R");
		s.push("I");
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.search("P"));
		System.out.println(s.search("T"));

	}

}
