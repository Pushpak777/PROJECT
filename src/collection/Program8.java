package collection;
import java.util.Comparator;
import java.util.TreeSet;
class Movie implements Comparable
{
	String name;
	int noOFDays;
	double budget;
	public Movie(String name, int noOFDays, double budget) {
		super();
		this.name = name;
		this.noOFDays = noOFDays;
		this.budget = budget;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", noOFDays=" + noOFDays + ", budget=" + budget + "]";
	}

	@Override
	public int compareTo(Object ob) {
		Movie mt=(Movie)ob;
		//System.out.println(this.noOFDays+"-"+mt.noOFDays);
		//return this.noOFDays-mt.noOFDays;
		//return (int)(this.budget-mt.budget);
		String s1=this.name;
		String s2=mt.name;
		int value=s1.compareTo(s2);
		return value;
		
	}
}
class SortBasedOnBudget implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Movie mt1=(Movie)o1;
		Movie mt2=(Movie)o2;
		// TODO Auto-generated method stub
		return (int)(mt1.budget-mt2.budget);
	}
	
}
class SortBasedOnDays implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Movie mt1=(Movie)o1;
		Movie mt2=(Movie)o2;
		// TODO Auto-generated method stub
		return mt1.noOFDays-mt2.noOFDays;
	}
	
}
public class Program8 {
	public static void main(String[] args) {
		Movie m1=new Movie("the scam",500,50.36);
		Movie m2=new Movie("KGF",200,631.25);
		Movie m3=new Movie("Dj",150,241.25);
		Movie m4=new Movie("KGF",300,501.25);
		TreeSet ts=new TreeSet();
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		ts.add(m4);
		System.out.println("1 sorting");
		for (Object ob : ts)
		{
			System.out.println(ob);
		}
		TreeSet ts2=new TreeSet(new SortBasedOnBudget());
		ts2.add(m1);
		ts2.add(m2);
		ts2.add(m3);
		ts2.add(m4);
		System.out.println("2 sorting");
		for (Object ob : ts2)
		{
			System.out.println(ob);
		}
		TreeSet ts3=new TreeSet(new SortBasedOnDays());
		ts3.add(m1);
		ts3.add(m2);
		ts3.add(m3);
		ts3.add(m4);
		System.out.println("3 sorting");
		for (Object ob : ts3)
		{
			System.out.println(ob);
		}
			
			
	}
}

