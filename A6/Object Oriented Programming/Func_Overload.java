import java.util.Scanner;
class Test
{

    void print()
    {
        System.out.print("When no arguments are passed in print,this function is called.");
    }
    void print(int a)
    {
        System.out.print("When an Int arguments is passed in print, int value = " + a);
    }
    void print(float b)
    {
        System.out.print("When a Float arguments is passed in print, float value = " + b);
    }
}
class Func_Overload
{
    public static void main(String[] args)
    {
        int num1=14;
        float num2=1.21f;
        Test t=new Test();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1 to pass int to print");
        System.out.println("Enter 2 to pass float to print");
        System.out.println("Enter 3 to pass nothing to print");
        int i=s.nextInt();
        switch(i)
        {
            case 1:
            t.print(num1);
            break;

            case 2:
            t.print(num2);
            break;

            case 3:
            t.print();
            break;

            default:
            System.out.println("Please enter correct option");
            break;
        }
    }
}