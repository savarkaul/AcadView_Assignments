import java.util.Scanner;
class VerifyPalindrome
{
	public static void main(String[] args)
	{
		int num,res,count=0;
		int rev=0;
		Scanner n=new Scanner(System.in);
		System.out.println("enter the number");
		num=n.nextInt();
		res=num;
		int num1=num;
		while(res!=0)
		{
			count++;
			res=res/10;
		}
		//System.out.println(count);		
		for (int i=0;i<count;i++)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		//System.out.println(rev);
		if (rev==num1)
		{
			System.out.println("yes,entered num is a palindrome");
		}
		else
		{
			System.out.println("no,entered num is not a palindrome");
		}
	}
}