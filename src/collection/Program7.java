package collection;

import java.util.HashSet;

class CurrencyNote
{
	int slid;
	int value;
	String color;
	public CurrencyNote(int slid, int value, String color)
	{
		this.slid=slid;
		this.value=value;
		this.color=color;
	}
	@Override
	public String toString() {
		return "CurrencyNote [slid="+ slid + ", value=" + value + ", color=" + color + "]";
	}
	@Override
	public int hashCode() {
		return slid;
	}
	@Override
	public boolean equals(Object obj) {
		CurrencyNote ct=(CurrencyNote)obj;
		return this.slid==ct.slid;
	}
}

public class Program7 {
	public static void main(String[] args) {
		CurrencyNote c1=new CurrencyNote(1234,5436,"pink");
		CurrencyNote c2=new CurrencyNote(1234,5436,"pink");
		CurrencyNote c3=new CurrencyNote(5316,1256,"grey");
		CurrencyNote c4=new CurrencyNote(456,1578,"yellow");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		HashSet hs=new HashSet();
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		System.out.println(hs.size());
		for(Object ob: hs )
		{
			System.out.println(ob);
		}
		
	}

}
