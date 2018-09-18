import java.util.Scanner;

class Greater

{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter two numbers");
    String x=s.nextLine();
    String y=s.nextLine();
    int m=Integer.parseInt(x);
    int n=Integer.parseInt(y);
    System.out.print("The bigger number is ");
	if(m>n)	
	{
           System.out.println(m);
	}
	else
	{
	System.out.println(n);
	}

	}

}