//2 ways to create synchronized ArrayList
//->Collections.synchronizedList   method
//->CopyOnWriteArrayList class--->Synchronized version of ArrayList(Thread safe variant of ArrayList)

package arryListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronized_ArrayList {

	public static void main(String[] args) {
		//1. Collections.synchronized List method
		List<String>SyncList=Collections.synchronizedList(new ArrayList<String>(Arrays.asList("Tom","Alex","Bob")));
		
		//For Adding/Removing from Synchronised Array List we don't need external Synchronization block
		//For fetching/Traversing from Synchronised Array List we need external Synchronization block
		
		synchronized (SyncList) {
			Iterator<String>it=SyncList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		//2. CopyOnWriteArrayList class
		CopyOnWriteArrayList<String>employee=new CopyOnWriteArrayList<String>(Arrays.asList("Steve","Emma","George"));
		
		//We don't need external Synchronization block for any operations
		//Class is thread safe by default
		
		System.out.println("#################################");
		for(String o : employee) {
			System.out.println(o);
		}
		
		//Traversing using Lamda
		System.out.println("#################################");
		employee.stream().forEach(emp -> System.out.println(emp));
	}

}
