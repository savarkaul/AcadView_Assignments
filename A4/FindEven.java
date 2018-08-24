import java.util.Scanner;
class FindEven
{
    public static void main(String[] args)
    {
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        System.out.println("Even Numbers:");
        for(i=0;i<=num;i++)
        {
            if(i%2==0 && i!=0)
            {
                System.out.println(i);
            }
        }
    }
}