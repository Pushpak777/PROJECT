package interfacetopic;

import java.util.Objects;

class Student{
	int rollno;
	String sname;
	public Student(int rollno, String sname) {
		super();
		this.rollno = rollno;
		this.sname = sname;
	}
	
	
	/*@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + "]";
	}*/
}
public class MainClass {

	public static void main(String[] args) {
		Student s=new Student(21,"Ram");
		System.out.println(s);
	}

}
