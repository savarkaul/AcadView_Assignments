import java.util.Scanner;

class CalSum
{
    public static int Cal(char[] x1, int len, int sum)
    {
        if(len<0)
        {
        return sum;
        }
        if(x1[len]>'0'&&x1[len]<'9')
        {
        sum+=(int)x1[len]-'0';
        }
        sum=Cal(x1,--len,sum);
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char[] x1=s1.toCharArray();
        int sum=0;
        sum=Cal(x1,s1.length()-1,sum);
        System.out.println(sum);
    }
}