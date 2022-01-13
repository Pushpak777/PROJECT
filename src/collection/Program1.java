package collection;
class Employee
{
	int id;
	double sal;
	float exp;
	String dept;
	public Employee(int id, double sal, float exp, String dept)
	{
		this.id=id;
		this.sal=sal;
		this.exp=exp;
		this.dept=dept;
	}
	public String toString() {
		return "id="+id+" "+"sal="+sal+" "+"exp="+exp+" "+"dept="+dept;
	}
}

public class Program1 {
	public static void main(String[] args) {
		System.out.println("start of java code");
		Employee [] ref=new Employee[5];
		Employee e1=new Employee(14,2563.25,2.6f,"development");
		ref[0]=e1;
		ref[1]=new Employee(25, 5863.25, 4.7f,"testing");
		ref[2]=new Employee(36, 383.25, 3.7f,"development");
		ref[3]=new Employee(25, 186.25, 9.7f,"testing");
		
		for (int i=0;i<ref.length;i++)
		{
			System.out.println(ref[i]);
			
		}
		System.out.println("end of java code");
		
		
		
	}

}
