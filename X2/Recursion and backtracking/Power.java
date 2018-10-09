import java.util.*;
class Power
{
    public static long calc_power(long a, long b)
    {
        if(b==1)
        {
            return a;
        }
        a*=a;
        a=calc_power(a,--b);
        return a;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number: ");
        long a= s.nextInt();
        System.out.println("Enter Power: ");
        long b=s.nextInt();
        a=calc_power(a,b);
        System.out.println("Result: "+a);
    }
}