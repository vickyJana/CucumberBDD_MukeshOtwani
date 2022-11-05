package nov052022;

import java.util.ArrayList;

public class listString {

	public static void main(String[] args) {
//		Write a program which will display true if list contains Mobile else prints false
//		List  - Web Automation, API Automation, Mobile Automation.
//		Output – True 

		
		ArrayList list = new ArrayList();
		list.add(0, "Web Automation");
		list.add(0, "API Automation");
		list.add(0, "Mobile Automation");
		System.out.println(list);
		if(list.contains(list)) {
			System.out.println("True");
		}else
		System.out.println("false");
		Object[] array = list.toArray();
		
		for(Object x :array) {
			System.out.print(x);
			
		}
		
		
		
	}

}
