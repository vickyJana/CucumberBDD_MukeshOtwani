package octO82022;

public class SwapNumbers {

	public static void main(String[] args) {
		// Write a program to swap two number. For example a=10 and b=20 output should be a=20 and b=10
		
		int a=10;
		int b=20;
		
		System.out.println("before swapping: "+ a+" "+ b);
		
		
		int temp =a;
		a= b;
		b=temp;
		System.out.println("after swapping: "+ a+" "+ b);
		

	}

}
