import java.util.Scanner;
public class Reversed
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter a string");
String s1=s.nextLine();
char[] ch=s1.toCharArray();
int i,size=ch.length;
String rever="";
for(i=size-1;i>=0;i--)
{
rever=rever+ch[i];
}
System.out.print("The reversed string is "+rever);
}
}