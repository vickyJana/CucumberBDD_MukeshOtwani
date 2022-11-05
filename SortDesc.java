package nov052022;

public class SortDesc {

	public static void main(String[] args) {
	      //Initialize array     
        int [] n = new int [] {54, 243, 84, 7, 12};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < n.length; i++) {     
            System.out.print(n[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < n.length; i++) {     
            for (int j = i+1; j < n.length; j++) {     
               if(n[i] < n[j]) {    
                   temp = n[i];    
                   n[i] = n[j];    
                   n[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < n.length; i++) {     
            System.out.print(n[i] + " ");    
        }    
    }    



	}


