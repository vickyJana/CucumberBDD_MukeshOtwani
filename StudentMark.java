package octO82022;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		// Write a program to print below students marks who have scored above 80
		// Example- 78,12,89,55,35
		// Output- 78,89

		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of subject:");
		n = s.nextInt();
		int marks[] = new int[n];
		
		System.out.println("Enter marks out of 100:");
		
		for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
            if (marks[i] >= 80)
            {
               System.out.println("Excellent Marks");
            }

            break;
            
        	
        }
		
		

	}
}
