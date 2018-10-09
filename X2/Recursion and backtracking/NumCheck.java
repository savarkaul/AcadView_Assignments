import java.util.Scanner;
class NumCheck
{
    public static boolean check(int[] arr,int n,int m)
    {
        if(n<0)
        {
            return false;
        }
        else if(arr[n]==m)
        {
            return true;
        }
        boolean a=check(arr,--n,m);
        return a;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int y=s.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr=new int[y];
        for(int i=0;i<y;i++)
        {
        arr[i]=s.nextInt();
        }
        System.out.println("Enter the number to search: ");
        int x=s.nextInt();
        boolean a= check(arr,y-1,x);
        System.out.println("Result:"+a);

    }
}