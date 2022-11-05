package nov052022;

import java.util.ArrayList;

public class listOperations {

	public static void main(String[] args) {
//		Create a list of numbers 33,44,55,66,77,88 and perform below operation
//		Remove second element from list using index
//		Remove second element from list using value
//		Add 90 at index 3
//		Get the length of list
//		Print all values from list using any values
//		Convert List into array.
		
		ArrayList list = new ArrayList();
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.remove(2);
		//list.remove("55");
		System.out.println(list);
		list.add(2, 90);
		System.out.println(list);
		System.out.println(list.size());
		
		
		   // Converting List to array
        // using toArray() method
        Object[] arr = list.toArray();
 
        // Printing elements of array
        // using for-each loop
        for (Object x : arr)
            System.out.print(x + " ");
    }
		
		 
		


	}


