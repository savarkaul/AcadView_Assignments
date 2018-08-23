import java.util.Scanner;
class Findprime
{
	public static void main(String[] args)
	{
		int num,flag=0,i;
		Scanner n=new Scanner(System.in);
		System.out.println("enter the number");
		num=n.nextInt();
		for (i=2;i<num/2;i++)
		{
			if (num%i==0)
			{
				flag=1;
				break;
			}
		}
		if (flag==1)
		{
			System.out.println("not a prime number");
		}
		else
		{
			System.out.println("prime number");
		}
	}
}