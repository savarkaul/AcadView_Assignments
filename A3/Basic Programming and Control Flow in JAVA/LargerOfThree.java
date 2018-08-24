import java.util.Scanner;
class LargerOfThree
{
	public static void main(String[] args)
	{
		int num1,num2,num3;
		Scanner l=new Scanner(System.in);
		System.out.println("enter num1");
		num1=l.nextInt();
		System.out.println("enter num2");
		num2=l.nextInt();
		System.out.println("enter num3");
		num3=l.nextInt();
		if (num1>num2 && num1>num3)
		{
			System.out.println("larger is "+num1);
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("larger is "+num2);
		}
		else
		{
			System.out.println("larger is "+num3);
		}
	}
}