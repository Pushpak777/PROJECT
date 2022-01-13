package collection;

import java.util.PriorityQueue;

public class Program9 {

	public static void main(String[] args) {
		Movie m1=new Movie("the scam",500,50.36);
		Movie m2=new Movie("KGF",200,631.25);
		Movie m3=new Movie("Dj",150,241.25);
		Movie m4=new Movie("ll",300,501.25);
		PriorityQueue p1=new PriorityQueue();
		p1.add(m1);
		p1.add(m2);
		p1.add(m3);
		p1.add(m4);
		int len=p1.size();
		for (int i=0; i<len; i++) {
			Object ob=p1.poll();
			System.out.println(ob);
			
		}
		PriorityQueue p2=new PriorityQueue(new SortBasedOnDays());
		p2.add(m1);
		p2.add(m2);
		p2.add(m3);
		p2.add(m4);
		int len2=p2.size();
		for (int i=0; i<len; i++) {
			Object ob=p2.poll();
			System.out.println(ob);
			
		}
	}

}
