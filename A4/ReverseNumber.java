import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args)
	{
		int num,temp,count=0;
		int revnum=0;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter an Integer");
		num=n.nextInt();
		temp=num;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		for (int i=0;i<count;i++)
		{
			revnum=revnum*10;
			revnum=revnum+num%10;
			num=num/10;
		}
		System.out.println("Reverse of the number is "+revnum);
	}
}