import java.util.Scanner;
class Word {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter a string: ");
String str=s.nextLine();
int word=0,i,j;
char[] ch=str.toCharArray();
int size=str.length();
for(i=0;i<size;i++)
{
if(ch[i]==' ')
{
word++;
}
}
if(str.length()==0)
{
System.out.println("This is an empty string");
}
else
{
System.out.println("The words are "+(word+1));
}
}
}