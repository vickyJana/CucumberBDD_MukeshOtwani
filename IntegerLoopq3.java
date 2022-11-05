package nov052022;

import java.util.Arrays;
import java.util.Iterator;

public class IntegerLoopq3 {

	public static void main(String[] args) {
		// Write a program which can store List of Integer values and print all the values using for iterator

		Double[] array = { 1.5, 2.6, 3.7, 4.8, 5.9};  
		
		
		
		Iterator<Double> it = Arrays.asList(array).iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
	}

}
