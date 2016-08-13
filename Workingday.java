import java.util.Scanner;

public class Workingday

{

    public static void main(String[] args)  

    {

       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character you want to check");
        String n=sc.next();
            if(n=='monday'||n=='tuesday'||n=='wednesday'||n=='thursday'||n=='friday'||n=='saturday')

            System.out.println("true");
            else

            System.out.println("false");

    }

}
