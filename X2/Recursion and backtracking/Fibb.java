import java.util.*;
class Fibb
{
    public static int calc_fib(int v, int v2, int x)
    {
        if(x<2)
        {
            return v2;
        }
        v2+=v;
        v=v2;
        v2=calc_fib(v,v2,--x);
        return v2;
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter position: ");
        int x=s.nextInt();
        int v=0;
        int v2=1;
        
        if(x==1)
        {
            System.out.println(0);  
        }
        else
        {
            v=calc_fib(v,v2,x-1);
            System.out.println(v);
        }
    }
}