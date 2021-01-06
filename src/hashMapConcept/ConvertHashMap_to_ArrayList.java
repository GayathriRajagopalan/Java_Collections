package hashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertHashMap_to_ArrayList {

	public static void main(String[] args) {
		Map<String,Integer>compMap=new HashMap<>();
		compMap.put("Amazon", 10000);
		compMap.put("Google", 60000);
		compMap.put("Microsoft", 90000);
		compMap.put("Apple", 100000);
		
		Iterator<Entry<String, Integer>> it=compMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<String,Integer>entry=it.next();
			System.out.println("Key = " + entry.getKey() + "value = " + entry.getValue());
		}
		//creating ArrayList for keys
		List<String>compNames = new ArrayList<>(compMap.keySet());
		System.out.println(compNames);
		
		compNames.forEach(names -> System.out.println(names));
		
		//creating ArrayList for values
		ArrayList<Integer>totalEmp=new ArrayList<>(compMap.values());
		System.out.println(totalEmp);
		for(int t : totalEmp) {
			System.out.println(t);
		}
	}

}
