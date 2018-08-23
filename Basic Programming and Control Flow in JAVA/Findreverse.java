import java.util.Scanner;
class Findreverse
{
	public static void main(String[] args)
	{
		int num,res,count=0;
		int rev=0;
		Scanner n=new Scanner(System.in);
		System.out.println("enter the number");
		num=n.nextInt();
		res=num;
		while(res!=0)
		{
			count++;
			res=res/10;
		}
		for (int i=0;i<count;i++)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		System.out.println("reverse is "+rev);
	}
}