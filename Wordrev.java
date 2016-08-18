import java.util.Scanner;

public class Wordrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String s2[]=new String[s1.length];
		int j=0;
		for(int i=s1.length-1;i>=0;i--)
		{
			s2[j]=s1[i];
			j++;
		}
		for(int i=0;i<s2.length;i++)
		{
			System.out.print(s2[i]+" ");
		}

	}

}
