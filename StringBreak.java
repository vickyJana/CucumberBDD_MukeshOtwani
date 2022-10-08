package octO82022;

public class StringBreak {

	public static void main(String[] args) {
		// Write a program which will break the current execution if it find “Selenium”
		//Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]

		String[] input = {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		int i =0;
		
		while(i<=input.length) {
			
			if(input[i].equals("Selenium")) {
				i++;
				break;
			}
			System.out.println(input[i++]);
		}

	}

	

}
