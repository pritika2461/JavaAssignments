package Calection;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList v = new ArrayList();
		v.add("Motarcycle");
		v.add("Bycycle");
		v.add("Bus");
		v.add("Car");
		v.add("Jeep");
		v.add("Realway");
		v.add("Two Wheeler");
		
		System.out.println(v);
		
		ArrayList v1 = new ArrayList();
		v1.add("Riksha");
		v1.addAll(v);
		
		System.out.println(v1);

	}

}
