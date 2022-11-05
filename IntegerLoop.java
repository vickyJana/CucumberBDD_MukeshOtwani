package nov052022;

public class IntegerLoop {

	public static void main(String[] args) {
		// Write a program which can store List of Integer values and print all the values using for loop.
		
		int i[] = {2,3,45,6,5};
		
//		for(int j=0; j<=i.length-1;j++) {
//			
//			System.out.println(i[j]);
//			
//		}
		
		for(int j:i) {
			System.out.println(j);
		}
		
		
		
		
	}

}
