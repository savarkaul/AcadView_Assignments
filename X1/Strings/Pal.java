import java.util.Scanner;
class Pal
{
    public static String palin(char[] x1,int i,int j)
    {
        if(j>=i)
        {
            return ("It is a palindrome");
        }
        if(x1[i]==x1[j])
        {
            String s = palin(x1,i-1,j+1);
            return (s);
        }
        else
        {
            return("It is not a palindrome");
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next(); 
        char[] x1=s1.toCharArray();
        String a=palin(x1,s1.length()-1,0);
        System.out.println(a);
        
    }
}