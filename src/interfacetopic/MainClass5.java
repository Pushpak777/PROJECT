package interfacetopic;
interface Program1{
	void walk();
	
}
interface Program2 extends Program1
{
	void run();
}
abstract class Program3 implements Program2,Program1
{
	public void walk()
	{
		System.out.println("waling");
	}
}
class Program4 extends Program3
{
	public void run()
	{
		System.out.println("Running");
	}
	
}
public class MainClass5 {
	public static void main(String[] args) {
		Program4 ref=new Program4();
		ref.run();
		ref.walk();
	}

}
