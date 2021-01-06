package hashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMap_Comparison {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1= new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		
		HashMap<Integer, String> map2= new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(2, "B");
		map2.put(1, "A");
		
		HashMap<Integer, String> map3= new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		
		//1. Comparison on the basis of key value pair : equals method
		
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));

		//2. Compare hashmaps for the same keys : keyset()
		
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));//duplicate values will be ignored
		
		//3. Find Extra keys - Using HashSet
		
		//HashSet--->Stores only unique elements(duplicates will be ignored
		//Combine/Union the keys
		//1. Create Hashset for map1 keys
		//2. Add map4 keys with map1 keys(duplicate keys will be removed)
		//3. Remove map1 keys from combined key set
		HashMap<Integer, String> map4= new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		HashSet<Integer>CombineKeys=new HashSet<>(map1.keySet());
		CombineKeys.addAll(map4.keySet());
		CombineKeys.removeAll(map1.keySet());
		System.out.println(CombineKeys);
		
		
		//4. Comparing Hashmap values
		//if duplicates are not allowed--->using ArrayList
		
		HashMap<Integer, String> map5= new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		map5.put(4, "C");
		
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map5.values())));
		System.out.println("_____________________________");
		
		//if duplicates are allowed
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map5.values())));
	}

}
