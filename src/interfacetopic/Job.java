package interfacetopic;

interface Job {
	void corejava();
	void manualTesting();
	void selenium();

}
abstract class StudentV1 implements Job
{
	public void corejava()
	{
		System.out.println("Core java");
	}
	public void manualTesting()
	{
		System.out.println("manualTesting");
	}
}
abstract class StudentV2 extends StudentV1
{
	
}
class StudentV3 extends StudentV2
{
	public void selenium()
	{
		System.out.println("selenium");
	}
}
class MainClass4
{
	public static void main(String[] args) {
		StudentV3 ref=new StudentV3();
		ref.corejava();
		ref.selenium();
		
	}
}
