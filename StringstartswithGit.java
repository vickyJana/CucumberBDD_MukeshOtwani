package nov062022;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringstartswithGit {

	public static void main(String[] args) {


//		Write a program which will accept List of String and produce another List of string of which will have only values which starts with git
//		Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
//		Output- Git, Github, Gitlab, GitBash
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		//LinkedList<String> list = new LinkedList();
		
		list.add("Git");
		list.add("Github");
		list.add("GitLab");
		list.add("GitBash");
		list.add("Selenium");
		list.add("Java");
		list.add("Maven");
		
		System.out.println(list);
		
//		System.out.println(list.contains("Git"));
		
		for(String str:list) {
			//boolean contains = str.contains("Git");
			System.out.println(str.contains("Git"));
		
			}
	
		
	System.out.println(list.contains("Git"));
	System.out.println(list.subList(0, 4));
		
		}
	

		
}	

	

		
//		if(list.toString().startsWith("G")) {
//			System.out.println("Git, Github, GitLab,GitBash");
//		}
//		else
//			System.out.println("Not satrts with G");
		
//		String[] strArray = {"Git", "Github", "GitLab","GitBash", "Selenium", "Java"," Maven"};
//		boolean startsWith = strArray.toString().startsWith("G");
//		System.out.println(startsWith);




