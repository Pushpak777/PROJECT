package collection;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {	
		int a[]=new int[3];
		//dynamic array --ArrayList:
		//1.can contain duplicate values
		//2.maintains insertion order
		//3.not Synchronized
		//4.allows random access to fetch the element beecause it stores the values on basis of indexes
		ArrayList ar=new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		ar.add(50);
		ar.add("test");
		System.out.println(ar.size());//size of arraylist
		System.out.println(ar.get(4));//togetvalue from index
		//to print all the values from arraylist:
		//1.for loop
		//2.using iterator
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		//non generic vs generic:
		ArrayList<Integer>ar2=new ArrayList<Integer>();
		ar.add(100);
		//ar.add("java")
		ArrayList<E>ar3=new ArrayList<E>();
		
	}

}
