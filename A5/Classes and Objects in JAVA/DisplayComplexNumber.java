import java.util.Scanner;
class Complex
{
    int real;
    int imaginary;
    Complex()
    {
        real=2;
        imaginary=5;
    }
    int Display()
    {
        System.out.println("Number :");
        System.out.println(real+"+"+imaginary+"i");
        return 0;
    }

}
class DisplayComplexNumber
{
    public static void main(String[] args)
    {
        Complex a=new Complex();
        a.Display();
    }
}