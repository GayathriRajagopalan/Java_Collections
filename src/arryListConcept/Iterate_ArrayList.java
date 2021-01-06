package arryListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_ArrayList {

	public static void main(String[] args) {
		
    ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("java");
		ar.add("Perl");
		ar.add("JS");
		ar.add("Ruby");
		ar.add("Python");
		ar.add("PHP");
		ar.add("C#");
		ar.add("C#");
		System.out.println(ar);
		
		//For Loop 
		System.out.println("**********Using For Loop**********");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//For Each Loop
		System.out.println("**********Using For Each Loop**********");
		for(String str : ar) {
			System.out.println(str);
		}
		
		//Using Iterator
		System.out.println("**********Using Iterator**********");
		Iterator<String>it= ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//using while loop
		System.out.println("**********Using while loop**********");
		int i=0;
		while(i < ar.size()) {
			System.out.println(ar.get(i));
			i++;
		}
		//using Stream and Lamda 
		System.out.println("**********Using Lamda**********");
		ar.stream().forEach(ele -> System.out.println(ele));

	}

}
