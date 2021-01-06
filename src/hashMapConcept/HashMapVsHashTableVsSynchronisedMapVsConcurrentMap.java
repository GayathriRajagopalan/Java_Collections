package hashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVsHashTableVsSynchronisedMapVsConcurrentMap {

	public static void main(String[] args) {

		// HashMap
		// 1.Not Thread Safe
		// 2. Allows Null key and multiple null values

		// HashTable
		// 1. Thread safe(but lock will be applied at object level for both read and
		// write access)
		// 2. Slow Performance
		// 3. Does not allow Null key and values

		// SynchronisedMap
		// 1. Thread safe(but lock will be applied at object level for both read and
		// write access)
		// 2. Slow Performance
		// 3. Allows Null key and multiple null values

		// Concurrent HashMAp
		// 1. Thread Safe(lock will be applied at segment levels for write
		// operations-obj will be divided into 16 segments)
		// multiple read only threads are allowed
		// 2. fast performance
		// 3. Null key and values are not allowed

		// How to create SynchronisedMap
		Map<String, String> map1 = new HashMap<>();
		map1.put("A", "Alex");
		map1.put("B", "Bella");
		map1.put("C", "Carrie");

		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap.get("A"));
		
		//How to create Concurrent HashMap---It does not throw concurrent Modification exception
		ConcurrentHashMap<String, String>concurrentMap=new ConcurrentHashMap<>();
		concurrentMap.put("1", "Amelia");
		concurrentMap.put("2", "Bob");
		concurrentMap.put("1", "cac");
		System.out.println(concurrentMap.get("2"));

	}

}
