package nov062022;

import java.util.ArrayList;

public class StringinReverseOrder {

	public static void main(String[] args) {
//		Create a list of String and print the values in reverse order
//		Input – Java, Selenium, TestNG, Git, Github
//			Output- Github, Git, TestNG, Selenium, Java

		//ArrayList<String> strArray = new ArrayList();
		
		String[] strArray ={"Java","Selenium","TestNG","Git","Github"};
		
		
		
//		strArray.add(0, "Java");
//		strArray.add(1, "Selenium");
//		strArray.add(2, "TestNG");
//		strArray.add(3, "Git");
//		strArray.add(4, "Github");
		//System.out.println(strArray);
		
//		for(String str:strArray) {
//			System.out.println(str);
//			
//		}
//		
//	    StringBuilder input1 = new StringBuilder();
//	    
//        // append a string into StringBuilder input1
//        input1.append(strArray);
//        
//        
//  
//        // reverse StringBuilder input1
//        input1.reverse();
//  
//        // print reversed String
//        System.out.println(input1);
        
		//Integer[] intArray = {10,20,30,40,50,60,70,80,90};
      //print array starting from first element
        System.out.println("Original Array:");
        for(int i=0;i<strArray.length;i++)
             System.out.print(strArray[i] + "  ");
         
        System.out.println();
         
        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
             for(int i=strArray.length-1;i>=0;i--)
             System.out.print(strArray[i] + "  ");
        }
    }
		
	


