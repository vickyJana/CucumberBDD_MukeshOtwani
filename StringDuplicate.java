package nov062022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class StringDuplicate {
	

	public static int removeDuplicateElements(String arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        String[] temp = new String[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
      

	public static void main(String[] args) {
		// Write a program that will remove duplicate values from List
//		Input – Java, TestNG, Maven, Java, 
//		Output – Java, TestNG, Maven
//
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Java");
//		list.add("TestNG");
//		list.add("Maven");
//		list.add("Java");
//
//		System.out.println(list);
//
//		System.out.println(list.contains("Java"));
 
	    
	        String[] arr = {"Java", "TestNG", "Maven","Java", "Maven","Jana","Jenkins"};//unsorted array  
	        Arrays.sort(arr);//sorting array  
	        int length = arr.length;  
	        length = removeDuplicateElements(arr, length);  
	        //printing array elements  
	        for (int i=0; i<length; i++)  
	           System.out.print(arr[i]+" ");  
	    }  


	}


