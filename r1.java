 class Reverse
{
public static void main(String args[])
{
 int  num=789, reverse = 0, temp, remainder;
 
   
    temp = num;
    while (num > 0)
    {
        remainder = num % 10;
        reverse = reverse * 10 + remainder;
        num =num/10;
    }
    System.out.println("Given number "+temp);
    System.out.println("Its reverse is"+reverse);
    }
	}