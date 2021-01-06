package arryListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Compare_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Java","Ruby","Python"));
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Java","Ruby","C#"));
		
		//1. Sort and equals
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1.equals(list2));
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("Ruby","C#","Java"));
		
		Collections.sort(list3);
		System.out.println(list2.equals(list3));
		
		
		//2. Find the Additional element in List1
	      //list1.removeAll(list2);
          //System.out.println(list1);
          
        //3. Find the missing element in List1
           list2.removeAll(list1);
          System.out.println(list2);
        
        //4. Common elements in both list
         
        ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("Java","Ruby","Python"));
  		
  		ArrayList<String> list5 = new ArrayList<String>(Arrays.asList("Java","Ruby","C#"));
  		
  		list4.retainAll(list5);
  		System.out.println(list4);

	}

}
