//Removing Duplicate elements from ArrayList can be done in 2 ways
//1.Using LinkedHashset

package arryListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateElements {

	public static void main(String[] args) {
		
		//1.Using LinkedHashset
		ArrayList<Integer>numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,7,8,6,7,8,8,6));
		
		LinkedHashSet<Integer>num = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer>numbersAfterRemovingDuplicates=new ArrayList<Integer>(num);
		
		System.out.println(numbersAfterRemovingDuplicates);
		
	   //2. Using JDK-8 Stream
		
		ArrayList<Integer>grades = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,7,8,6,7,8,8,6));
		
		List<Integer>UniqueGrades=grades.stream().distinct().collect(Collectors.toList());
		System.out.println(UniqueGrades);

	}

}
