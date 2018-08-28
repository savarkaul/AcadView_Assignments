import java.util.Scanner;
class Shape
{
    int length;
    int breadth;
    int Calculate(int length,int breadth)
    {
        int area;
        area=length*breadth;
        return area;
    }

}
class Calculate_Area
{
    public static void main(String[] args)
    {
        Shape a=new Shape();
        Scanner s=new Scanner(System.in);
        System.out.println("Length of rectangle");
        a.length=s.nextInt();
        System.out.println("Breadth of rectangle");
        a.breadth=s.nextInt();
        int area=a.Calculate(a.length,a.breadth);
        System.out.println("Area: "+area);
    }
}