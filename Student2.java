package oct202022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student2 {

	String name;
	String email;
	String phone;
	String address;

	String[] studentDetails1;
	ArrayList<String> list;

	Scanner s;

	public Student2(String studentname, String studentemail, String phoneNumber, String studentAddress) {

		this.name = studentname;
		this.email = studentemail;
		this.phone = phoneNumber;
		this.address = studentAddress;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("how many students information you want to store:");
		int n = 0;
		n = s.nextInt();
		for (int i = 0; i < n; i++) {
		
		
		
		System.out.print("Enter your name: ");
		s.nextLine();
		String name = s.nextLine();
		System.out.println("Name is: " + name);

		System.out.print("Enter email:");
		//s.nextLine();
		String email = s.nextLine();
		System.out.println("email is: " + email);

		System.out.print("Enter phone:");
		//s.nextLine();
		String phone = s.nextLine();
		System.out.println("Phone is: " + phone);

		System.out.print("Enter address:");
		//s.nextLine();
		String address = s.nextLine();
		System.out.println("Address is: " + address);

		
	}
		System.out.println("Please enter the which student details you want");

		n = s.nextInt();
		if(n==2){
			System.out.println();
			
		}
		
		s.close();
}}
//		// Task 3 – Create a program which will store students information and print the
//		// output.
////		Program should ask how many students information you want to store. For each students it should ask name, email, phone, address, status
////		Once all entries are done, program should ask which user information you want to fetch and should print the same.
////		Note- Use scanner class for dynamic students
//		Student2 st = new Student2(null, null, null, null);
//		// int nr =0;
//
//		
//		int n = 0;
//		Scanner s = new Scanner(System.in);
//
//		System.out.print("how many students information you want to store:");
//
//		n = s.nextInt();
//		ArrayList<String> list = new ArrayList<String>();
//
//		for (int i = 0; i < n; i++) {
//
////					list.add(s.next());
////					String[] studentDetails12 = st.studentDetails1("name","email","phone","address");
////					boolean add = list.add("studentDetails12");
//
//			st.studentDetails1();
//			for (int j = 0; j < args.length; j++) {
//		 list.add(s.next());
//				
//			}
//
//		}
//
//		System.out.println("Please enter the which student details you want");
//
//		n = s.nextInt();
//		System.out.println(list.add(s.next()));
//		
//
//		// s.close();
//
//	}
//
//	public String name(String studentName) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter name:");
//		name = s.nextLine();
//		// name = s.next();
//		return name;
//	}
//
//	public String email(String studentEmail) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter email:");
//		email = s.nextLine();
//
//		// email = s.next();
//		return email;
//	}
//
//	public String phone(String studentPhoneNumber) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter phone:");
//		phone = s.nextLine();
//		// phone = s.next();
//		return phone;
//	}
//
//	public String address(String studentAddress) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter address:");
//		address = s.nextLine();
//		// address = s.next();
//		return address;
//	}
//
//	public void studentDetails() {
//
//		name(name);
//		s.nextLine();
//		email(email);
//		s.nextLine();
//		phone(phone);
//		s.nextLine();
//		address(address);
//		s.nextLine();
//
//		// return studentDetails();
//	}
//	
//	public void display(){
//		
//		System.out.println("Name" + this.name);
//		
//		System.out.println("Name" + this.email);
//		
//		System.out.println("Name" + this.phone);
//		
//		System.out.println("Name" + this.address);
//	}
//
//	public String[] studentDetails1() {
//		Scanner s = new Scanner(System.in);
//
//		System.out.print("Enter name:");
//		// name = s.nextLine();
//		name = s.next();
//		System.out.print("Enter email:");
//		email = s.next();
//		System.out.print("Enter phone:");
//		phone = s.next();
//		System.out.print("Enter address:");
//		address = s.next();
//
//		return studentDetails1;
//	}
//
//}
