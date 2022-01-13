package collection;

import java.util.ArrayList;
import java.util.LinkedList;
public class Program4 {
	public static void main(String[] args) {
		//ArrayList al=new ArrayList();
		LinkedList al=new LinkedList();
		System.out.println(al.size());
		al.add(new Laptop("Hp",16,"Silver",50000.00));
		al.add(new Laptop("Dell",8,"black",40000.00));
		al.add(new Bike("Pulsar",220,"White",50000.00));
		al.add(null);
		al.add(3,"java");
		al.remove(3);
		System.out.println(al.size());
		for (int i=0; i<al.size();i++)
		{
			Object ob=al.get(i);
			System.out.println(ob);
		
		}
		ArrayList al1=new ArrayList(al);
		System.out.println("al1.size()="+al1.size());
		for (int i=0; i<al1.size();i++)
		{
			Object ob=al1.get(i);
			if(ob instanceof Laptop)
			{
				Laptop lp=(Laptop)ob;
				System.out.println("brand="+lp.brand);
			}
			else if(ob instanceof Bike)
			{
				Bike bk=(Bike)ob;
				System.out.println("model="+bk.model);
			}
		
		}
	}

}
