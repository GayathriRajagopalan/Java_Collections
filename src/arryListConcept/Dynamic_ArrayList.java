package arryListConcept;

import java.util.ArrayList;

public class Dynamic_ArrayList {

	public static void main(String[] args) {
		//arraylist stores value using indexes
		//Not thread safe
		//Random access is allowed
		//accepts duplicate values
		//accepts null values
		
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
		
		//size of arraylist
		System.out.println("Size of arrayList---->" +ar.size());
		System.out.println("Lower Index of arraylist --->0");
		System.out.println("Higher Index of arraylist --->" + (ar.size()-1));
		
		//By default 10 virtual memory will be allocated
		//Only on adding values to ArrayList Physical memory will get created
		//To change the virtual memory pass the size in the constructor of ArrayList
		ArrayList<String> ar1 = new ArrayList<String>(15);//Virtual memory for 15 will be created
		ar1.add("Id");
		ar1.add("name");
		ar1.add("class");
		ar1.add("xpath");
		ar1.add("css");
		ar1.add("Tagname");
		ar1.add("LinkText");
		ar1.add("PartialLinkText");
		
		//Add all
		//ar1.addAll(ar);//It will add in the end
		ar1.addAll(2, ar);//This will add in the 2nd index
		System.out.println(ar1);
		System.out.println(ar1.size());
		System.out.println(ar);
		System.out.println("____________________");
		
		//RetrieveAll
		ar1.retainAll(ar);
		System.out.println(ar1);
		System.out.println(ar1.size());
		System.out.println("____________________");
		
		//Remove
		System.out.println(ar.remove(7));
		System.out.println(ar.size());
		
		//clear
		ar1.clear();
		System.out.println(ar1);
		System.out.println(ar);
	
		//clone
		ArrayList<String>cloneList= (ArrayList<String>)ar.clone();
		System.out.println(cloneList);
		
		//contains and IndexOf--->To check whether the element is present or not
		
		System.out.println(ar.contains("java"));
		System.out.println(ar.contains("C"));
		
		System.out.println(ar.indexOf("Python")>0);
		System.out.println(ar.indexOf("Python"));
		}

}
