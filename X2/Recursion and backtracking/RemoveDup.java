import java.lang.*;
import java.util.*;
class RemoveDup
{
    public static String remdup(char[] x1,int l, int j,String y)
    {
        if(j>l-1)
        {
            y+=x1[j];
            return y;
        }
        if(x1[j]!=x1[j+1])
        {
            y+=x1[j]; 
        }
        y=remdup(x1,l,++j,y);
        return y;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char[] x1=s1.toCharArray();
        String y="";
        y=remdup(x1,s1.length()-1,0,y);
        System.out.println(y);
    }
}