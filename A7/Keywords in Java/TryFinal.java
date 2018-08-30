final class Asus
{
    void Display()
    {
        System.out.println("The class with a final keyword can not be extended");
    }
}
class Asus1
{
	void.Display()
	{
		System.out.println("Asus1");
	}
class TryFinal
{
    public static void main(String[] args)
    {
        Asus d=new Asus();
        d.Display();
    }
}