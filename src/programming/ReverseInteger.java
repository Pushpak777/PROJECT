package programming;

public class ReverseInteger {
	public static void main(String[] args) {
		int num=654321;
		int rev=0;
		while (num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println(rev);
		//int num1=12345;
		//System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		/*long n=987654321;
		long rev=0;
		long rem=0;
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev * 10 + rem;
			n=n/10;
			
		}
		System.out.println(rev);*/

	}
	
}
