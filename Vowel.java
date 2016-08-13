import java.util.Scanner;

public class Vowel

{

    public static void main(String[] args) throws Exception 

    {

       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character you want to check");
        String n=sc.next();
            if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')

            System.out.println("The given character "+n+" is vowel");
            else

            System.out.println("The given character "+n+" is consonant");

    }

}
