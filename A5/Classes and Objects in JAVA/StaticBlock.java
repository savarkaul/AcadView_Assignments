import java.util.Scanner;
class InfoEmployee
{
    String ename;
    static String company;
    static
    {
        company="Kaul Enterprise";
    }
}
class StaticBlock
{
    public static void main(String[] args)
    {
        InfoEmployee emp1=new InfoEmployee();
        emp1.ename="Dhruv";
        InfoEmployee emp2=new InfoEmployee();
        emp2.ename="Satwik";
        System.out.println(emp1.ename+" works in "+emp1.company);
        System.out.println(emp2.ename+" works in "+emp2.company);
    }
}