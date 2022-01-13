package interfacetopic;

public class A extends Thread{
	static
	{
		 System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Thread t =Thread.currentThread();
		System.out.println("Get name is ="+t.getName());
		System.out.println("Prirory of Thread ="+t.getPriority());
		
	}

	
}
