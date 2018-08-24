import java.util.Scanner;
class ArraySearch
{
    public static void main(String[] args)
    {
        int temp,a,b;
        int count=0;
        Scanner s=new Scanner(System.in);
        int[] A=new int[]{1,4,6,7,8,9,10};
        System.out.println("Enter Integer to search");
        int num=s.nextInt();
        for(a=0;a<A.length;a++)
        {
            if(num==A[a])
            {
                System.out.println("Integer found at position (Starting from zero) : "+a);
                count=1;
                break;
            }

        }
        if(count==0)
        {
            System.out.println("Integer doesn't exist in array");
        }
    }
}