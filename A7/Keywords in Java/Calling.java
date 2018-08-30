class Try
{
    Try()
    {
        System.out.println("In default constructor of Try class");
    }
    Try(String a)
    {
        this();
        System.out.println("In parameterized constructor of Try class");
    }
}
class Calling
{
    public static void main(String[] args)
    {
        Try t=new Try("I love Java");
    }
}