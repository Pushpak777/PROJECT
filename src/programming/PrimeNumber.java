package programming;

import java.util.Scanner;

public class PrimeNumber {
	/*public static boolean isPrimeNumber(int num) {
		if (num<=1) {
			return false;
		}
		for (int i=2;i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void getPrimeNumber(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i))
			System.out.println(i +" ");
		}
	}
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(100));
		
		
	}*/
	public static void main(String[] args) {
		/*for(int n=1;n<=100;n++)
		{
		
		int temp=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		
			
		}
		if(temp==0)
		{
			System.out.println(n);
		}
		
			
		}	*/
		Scanner s=new Scanner(System.in);
		System.out.println("enter no");
		int n=s.nextInt();
		int temp=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
			if(temp<0)
			{
				System.out.println("not prime");
			}
			else
			{
				System.out.println("prime");
			}
		}
				
	}
	
	

}

