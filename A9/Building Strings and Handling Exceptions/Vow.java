import java.util.Scanner;
class Vow
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String s1=s.nextLine();
char[] ch=s1.toCharArray();
char[] ch1=new char[s1.length()];
char temp;
int i,size=ch.length,j=0,flag=0;
for(i=0;i<size;i++)
{
flag=1;
if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
{
flag=0;
}
if(flag!=0)
{
ch1[j]=ch[i];
++j;
}
}
String s2=new String(ch1);
System.out.println(s2);
}
}