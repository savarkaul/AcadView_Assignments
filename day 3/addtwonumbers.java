import java.util.Scanner;
class AddNumbers
{
	public static void main(String[] args)
	{
		int num1,num2,z;
		Scanner s=new Scanner (System.in);
		System.out.println("enter number 1");
		num1=s.nextInt();
		System.out.println("enter number 2");
		num2=s.nextInt();
		z=num1+num2;
		System.out.println("result is "+z);
	}
}