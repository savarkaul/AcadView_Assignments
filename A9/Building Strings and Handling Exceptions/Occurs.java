import java.util.Scanner;
public class Occurs
{
public static void check(String st,String ch)
{
int a=st.length();
int b=ch.length();
char[] ch1=st.toCharArray();
char[] ch2=ch.toCharArray();
int i,j=0,o=0,flag=0;
for(i=0;i<a-b;i++)
{
j=0;   
if(ch1[i]==ch2[j]) 
{
++j;
while(j<b)
{
if(ch1[i+j]==ch2[j])
{
flag=1;
}
else
{
flag=0;
break;
}
++j;
}
}
if(flag==1)
{
System.out.println("This substring exists");
break;
}
{
System.out.println("This substring does not exist");
break;
}
}
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String st=s.nextLine();
System.out.println("Enter the string to check occurrence in the first string");
String ch=s.nextLine();
check(st,ch);
}
}