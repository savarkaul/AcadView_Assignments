import java.util.Scanner;
class Maxfreq
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        char[] x1=s1.toCharArray();
        int i,j=0,max=0;
        int[] x2=new int[256];
        for(i=0;i<s1.length();i++)
        {
            x2[x1[i]]++;
        }
        for(i=0;i<s1.length();i++)
        {
            if(max<x2[x1[i]])
            {
               j=i;
               max=x2[x1[i]];
            }
        }
        System.out.println("Character with maximum frequency : "+x1[j]);
    }
}