import java.util.Scanner;
import java.lang.Math;
class CheckArmstrong
{
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=s.nextInt();
            int temp2=100,temp1=num;
            int count=0,ast=0;
            while(temp1>0)
            {
                temp2=temp1%10;
                count++;
                temp1=temp1/10;
            }
            temp1=num;
            while(temp1>0)
            {
                temp2=temp1%10;
                ast+=Math.pow(temp2,count);
                temp1=temp1/10;
            }
            if(num==ast)
            {
                System.out.println(num+" is an Armstrong number");
            }
            else
            {
                System.out.println(num+" is not an Armstrong number");
            }
        }
}