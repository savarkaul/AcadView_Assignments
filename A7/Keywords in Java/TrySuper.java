class First
{
    void Display()
    {
        System.out.println("Display method of First class");
    }
}
class Second extends First
{
    void Display()
    {
        super.Display();
    }
}
class TrySuper
{
    public static void main(String[] args)
    {
        Second a=new Second();
        a.Display();
    }
}