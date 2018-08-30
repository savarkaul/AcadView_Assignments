import java.util.Scanner;
class Chips
{
    String name;
    static String company;
    static
    {
        company="Lays";
    }
}
class StaticBlock
{
    public static void main(String[] args)
    {
        Chips c1=new Chips();
        c1.name="Tangy Tomato";
        Chips c2=new Chips();
        c2.name="Herb and Cheese";
        System.out.println(c1.name+" is a good flavor of "+c1.company+" chips");
        System.out.println(c2.name+" is a good flavor of "+c2.company+" chips");
    }
}