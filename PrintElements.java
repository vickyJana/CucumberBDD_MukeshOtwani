package nov062022;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintElements {

	public static void main(String[] args) {
//		Create a list of values and print the second element, second last element.
//		Input – 10,45, 90,45, 23, 90, 44
//		Output – 45,90
		int size =0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean empty = list.isEmpty();
		System.out.println(empty);
		System.out.println(size);
		list.add(10);
		list.add(45);
		list.add(90);
		list.add(3, 45);
		list.add(23);
		list.add(90);
		list.add(44);
		System.out.println(list);
		size = list.size();
		System.out.println(size);
		//System.out.println(++size);
		System.out.println(list.toString().lastIndexOf(6));
		
		
		System.out.println("Second element: "+ list.get(size-6) ); 
		System.out.println("Second last element: "+ list.get(size-2) ); 
		//System.out.println("last element: "+a[a.length-1]);
		
	}

}
