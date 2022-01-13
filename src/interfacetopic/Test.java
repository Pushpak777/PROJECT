package interfacetopic;

public class Test extends Thread  {
	


	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	{
		for (int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		Test t=new Test();
		t.start();
		Test t1=new Test();
		t1.start();
		t1.getPriority();
		// TODO Auto-generated method stub

	}

}
