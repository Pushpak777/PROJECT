package programming;

public class ReverseString {
	public static void main(String[] args) {
		String s1="My Name is Pushpak";
		int len=s1.length();
		System.out.println("s1="+s1);
		String rev="";
		for (int i=len-1; i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}

}
