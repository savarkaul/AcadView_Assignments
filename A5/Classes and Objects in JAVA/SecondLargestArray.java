import java.util.Scanner;
class SecondLargestArray
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,j,temp;
        int count=1;
        int[] Arr=new int[10];
        System.out.println("Enter the elements");
        for(i=0;i<10;i++)
        {
            Arr[i]=s.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=i;j<10;j++)
            {
                if(Arr[j]>Arr[i])
                {
                    temp=Arr[i];
                    Arr[i]=Arr[j];
                    Arr[j]=temp;
                }
            }
        }
    for(i=0;i<10;i++)
    {
        if(count==0)
        {
            System.out.println("Second Largest element is : "+Arr[i]);
        }
        count--;
    }
    }
}