import java.util.Scanner;
class FindPrimeSeq
{
    public static void main(String[] args)
    {
        int i,j;
        int chk=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        System.out.println("Prime Numbers in the sequence are:");
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    chk+=1;
                }
            }
            if(chk<=2 && i!=1)
            {
                System.out.println(i);
            }
            chk=0;
        }
    }
}