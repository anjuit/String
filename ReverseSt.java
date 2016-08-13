import java.util.Scanner;

public class ReverseSt {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		StringBuffer s=new StringBuffer(sc.next());
		s=s.reverse();
		System.out.println(s);
		String s1=s.toString();
		  s1=s1.replaceAll("[aeiou]","");
		  System.out.println("output "+s1);
		
	}
