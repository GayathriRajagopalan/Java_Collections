package arryListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Declaring_Arrays {

	public static void main(String[] args) {
		
		//1. Declaring values thro Constructor
		ArrayList<String>tags=new ArrayList<String>(Arrays.asList("id","name","class"));
		
		//System.out.println(tags);
		
		ArrayList<String>locators=new ArrayList<String>(Arrays.asList("xpath","css","linkText","PartialLinkText"));
		
		//2. Declaring values thro ADD Method
		locators.add("tagName");
		
		//System.out.println(locators);
					
		ArrayList<Integer>numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(numbers);
		
		//Removing even nos from the list
		numbers.removeIf(num -> num%2==0);
		System.out.println(numbers);
		
		//Removing odd nos from the list
		numbers.removeIf(num1 -> num1%2!=0);
		System.out.println(numbers);
		
		//RetainAll--Retain only the specified value from the list
		ArrayList<String>names=new ArrayList<String>(Arrays.asList("Mary","Bella","Angel", "Carry","Mary"));
		System.out.println(names);
		names.retainAll(Collections.singleton("Mary"));
		System.out.println(names);
		
		//Creating Sublist
		ArrayList<Integer>number1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		ArrayList<Integer>sublist = new ArrayList<Integer>(number1.subList(2, 5));
		System.out.println(sublist);
		
		//Converting ArrayList to 1D Array
		
		Object arr0[]=names.toArray();
		System.out.println(Arrays.toString(arr0));
		
		for(Object e : arr0) {
			System.out.println(e);
		}
		
	}

}
