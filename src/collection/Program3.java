package collection;
import java.util.ArrayList;
import java.util.LinkedList;
public class Program3 {
	public static void main(String[] args) {
		//ArrayList al=new ArrayList();
		LinkedList al=new LinkedList();
		System.out.println(al.size());
		al.add(new Mobile("apple", 523, 25.36));
		al.add(new laptop("black", 16));
		al.add(new Pen(25.00 , "White"));
		al.add(new Mobile("vivo", 41, 853.36));
		
		System.out.println("retrive elements for array list using get method");
		for (int i= 0; i<al.size(); i++)
		{
			Object ob=al.get(i);
			System.out.println(ob);
		}
		ArrayList l2=new ArrayList(al);
		l2.add("second");
		System.out.println("l2.size()="+l2.size());
		System.out.println("retrive elements for second array list using get method");
		for (int i=0; i<l2.size(); i++)
		{
			Object ob=l2.get(i);
			if(ob instanceof Mobile)
			{
				Mobile mt=(Mobile)ob;
				System.out.println("brand="+mt.brand);
				System.out.println("cost="+mt.cost);
				System.out.println("imei="+mt.imei);
				
			}
			else if (ob instanceof laptop)
			{
				laptop lt=(laptop)ob;
				System.out.println("colour="+lt.colour);
				System.out.println("ram="+lt.ram);
			}
			else if (ob instanceof Pen)
			{
				Pen pt=(Pen)ob;
				System.out.println("colour="+pt.colour);
				System.out.println("cost="+pt.cost);
			}
		}
		
	}

}
