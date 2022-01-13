package interfacetopic;
interface Rocket{
	void fly();
}
interface Car
{
	void moveonGround();
	
}
 class Flight implements Rocket,Car
{
	 public void fly()
	{
		System.out.println("Flyng..............");
	}
	 public void moveonGround()
	 {
		 System.out.println("Ground...");
	 }
	
}

public class MainClass6 {
	public static void main(String[] args) {
	Flight f1=new Flight();
	f1.fly();
	f1.moveonGround();
}

}
