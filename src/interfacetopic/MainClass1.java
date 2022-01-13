package interfacetopic;
interface ATMScreen{
	abstract void withdraw();
	abstract void miniStatement();	
}
abstract class Softwarev1 implements ATMScreen
{
	public void miniStatement()
	{
		System.out.println("generate mini statement");
	}
}
class SoftwareV2 extends Softwarev1
{
	public void withdraw()
	{
		System.out.println("Withdraw");
	}
	
}

public class MainClass1 {
	public static void main(String[] args) {
		SoftwareV2 ref=new SoftwareV2();
		ref.withdraw();
		ref.miniStatement();
	}
	

}
