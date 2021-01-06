package hashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap_Basics {

	public static void main(String[] args) {
	
		//stores data in the form of Key and value pair
		//Not thread safe
		//duplicates are not allowed
		//accepts 1 null key and multiple null values
		
		HashMap<String,String>carMap=new HashMap<String,String>();
		carMap.put("Honda", "Civic");
		carMap.put("Nissan", "Versa");
		carMap.put("Toyota", "Camry");
		carMap.put("Tata", "Nano");
		carMap.put("Hyundai","Santro");
		
		carMap.remove("Tata");
		
	System.out.println(carMap.get("Nissan"));
	
	//1. Iterate over the keys using Key set
	Iterator<String>it=carMap.keySet().iterator();
	while(it.hasNext()) {
		String key=it.next();
		String value=carMap.get(key);
		System.out.println("Key:" + key + "  and value :" + value);
	}
		
   //2. Iterate over the pair using Entry set
	System.out.println("-------------------");
	Iterator <Entry<String, String>>it2=carMap.entrySet().iterator();
	while(it2.hasNext()) {
		Entry<String, String>entry=it2.next();
		System.out.println("Key :" + entry.getKey() + " Value :" +entry.getValue());
			
	}
	
	//3. Iterate using Lamda(JDK 8)
	System.out.println("-------------------");
	carMap.forEach((k,v) -> System.out.println("Key :" + k + " and value :" +v));
	}

}
