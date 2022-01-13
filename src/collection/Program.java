package collection;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	System.out.println("start of java code");
	try 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		System.out.println("s1="+s1);
		System.out.println("enter an integer");
		int index=sc.nextInt();
		System.out.println("index="+index);
		char ch=s1.charAt(index);
		System.out.println("ch="+ch);
	}
	catch(Exception ref) {
		System.out.println("Exception handelded");
	}
}
}

