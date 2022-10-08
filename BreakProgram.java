package octO82022;

public class BreakProgram {

	public static void main(String[] args) {
		// Write a program which will break the current execution if it find number 85
		//Input – [12,34,66,85,900]
		
	String[] input = {"12","34","66","85","900"} ;
	
	int i = 0;
	while (i < input.length ) {
	if (input[i].equals("85") ) {

			i++;
			break;
			
		}
	
	System.out.println(input[i++]);
	

	}
	}
}
