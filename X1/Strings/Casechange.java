import java.util.*;
class Casechange
{
    public static String change(char[] x1)
    {
        String s2="";
        int a;
        for(int i=0;i<x1.length;i++)
        {
            if(x1[i]>='A'&&x1[i]<='Z')
            {
                a=(int)(x1[i]+32);
                s2+=(char)a;
            }
            else if(x1[i]>='a'&&x1[i]<='z')
            {
                a=(int)(x1[i]-32);
                s2+=(char)a;
            }
            else
            {
                s2+=x1[i];
            }
        }
        return s2;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine(); 
        char[] x1=s1.toCharArray();
        String a=change(x1);
        System.out.println(a);
        
    }
}