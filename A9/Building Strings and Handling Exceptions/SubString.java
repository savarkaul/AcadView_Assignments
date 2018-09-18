import java.util.Scanner;
public class SubString
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter a string");
String str=s.nextLine();
char[] ch=str.toCharArray();
int size=str.length();
int i,j,k;
System.out.println("The substrings are:");
for(i=0;i<size;i++)
{
for(j=0;j<=i;j++)
{
for(k=j;k<=i;k++)
{
System.out.print(ch[k]);
}
System.out.println();       
}
}
}
}