package arryListConcept;

public class Static_Array_Demo {

	public static void main(String[] args) {
		
		//static array
		//int i[] = new int[4];
		int i[] = {10, 30, 40, 60};
		/*
		 * i[0] = 10; i[1] = 20; i[2] = 10; i[3] = 30;
		 */
		int s =0;
		for(int j=0;j<i.length;j++) {
			 s = s + i[j];
			
		}
		System.out.println(s);

	}

}
